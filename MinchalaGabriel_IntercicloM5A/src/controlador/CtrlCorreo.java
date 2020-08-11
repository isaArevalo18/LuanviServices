package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.Correo;
import utils.config;
import vista.VistaCorreo;
/*Importamos los paquetes que vamos nos va ser util en el desarrollo*/
public class CtrlCorreo implements ActionListener {

    private Correo modelo;/*paquete modelo*/
    private VistaCorreo vista;/*paquete vista*/
    private File Archivo; /* Este file ayudara para adjuntar archivos a un correo*/

    /*
    Este constructor conecta la vista con el modelo, mediante el controlador
     */
    public CtrlCorreo(Correo modelo, VistaCorreo vista) {
        this.modelo = modelo;
        this.vista = vista;
        //importante añadir los action listerner de cada boton para que funcionen caso contratio no lo haran
        this.vista.item_enviar.addActionListener(this);
        this.vista.item_recibir.addActionListener(this);
        this.vista.item_salir.addActionListener(this);
        this.vista.btn_enviar.addActionListener(this);
        this.vista.btn_archivo.addActionListener(this);

    }

    //Este metodo ejecuta la vista grafica de la aplicacion
    /*
    * En este metodo configuramos el titulo, el centrado y el tamaño y otros parametros de la vista grafica de la aplicacion
     */
    public void iniciar() {
        this.vista.setTitle("GABRIEL-MINCHALA-CORREO ELECTRONICO");
        this.vista.setLocationRelativeTo(null);
        this.vista.setResizable(false);
        this.vista.pl_enviarcorreo.setVisible(false);
        this.vista.pl_bandeja.setVisible(false);
        this.vista.setVisible(true);
    }

    /* Este metodo sobrecargado permite capturar los eventos de la parte grafica
        * es decir, cada vez que se da un click en algun boton en la vista se llamara a algun metodo del controlador
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.item_enviar) {
            this.vista.pl_bandeja.setVisible(false);
            this.vista.pl_enviarcorreo.setVisible(true);
        }
        if (e.getSource() == this.vista.item_recibir) {
            this.vista.pl_bandeja.setVisible(true);
            this.vista.pl_enviarcorreo.setVisible(false);
            try {
                ListarCorreo();
            } catch (MessagingException ex) {
                Logger.getLogger(CtrlCorreo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CtrlCorreo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (e.getSource() == this.vista.item_salir) {
            this.vista.dispose();
        }
        if (e.getSource() == this.vista.btn_enviar) {
            EnviarMensaje();
        }
        if (e.getSource() == this.vista.btn_archivo) {
            CargarArchivo();
        }

    }
    // En este metodo cargamos toda la informacion que ira en nuestro mensaje

    private void CrearMensaje() {
        modelo = new Correo();
        modelo.setRemitente(this.vista.txt_remitente.getText());
        modelo.setDestinatario(this.vista.txt_destinatario.getText());
        modelo.setDestinatarioCC(this.vista.txt_destinatariocopia.getText());
        modelo.setAsunto(this.vista.txt_asunto.getText());
        modelo.setMensaje(this.vista.txt_mensaje.getText());
        if (Archivo != null) {
            modelo.setArchivo(Archivo);
        }
        System.out.println(modelo.toString());
    }

    private void EnviarMensaje() {
        Address Direcciones[] = null;
        Address DireccionesCC[] = null;
        CrearMensaje();
        Session session = Session.getDefaultInstance(config.ConfigurarCorreo(), null);
        MimeMultipart mensaje = new MimeMultipart();
        MimeMessage mm = new MimeMessage(session); //Realizamos el siguiente objeto para enviar el mensaje 
        BodyPart texto = new MimeBodyPart();
        BodyPart archivo = new MimeBodyPart();

        try {
            //Agregamos el asunto de nuestro correo
            mm.setSubject(modelo.getAsunto());

            if (!this.modelo.getDestinatario().equals("")) {
                //Creamos un vector en caso de tener varios destinatarios para el mensaje
                String[] listaDestinatarios = modelo.getDestinatario().split(";");
                //La clase addres nos permite guardar varias direcciones de correo electronico para el envio
                Direcciones = new Address[listaDestinatarios.length];
                for (int i = 0; i < listaDestinatarios.length; i++) {
                    Direcciones[i] = new InternetAddress(listaDestinatarios[i]);
                    System.out.println(listaDestinatarios[i]);
                }
            }

            if (!this.modelo.getDestinatarioCC().equals("")) {
                //Repetimos el mismo proceso para los mensajes cc
                String[] listaDestinatariosCC = modelo.getDestinatarioCC().split(";");
                DireccionesCC = new Address[listaDestinatariosCC.length];
                for (int i = 0; i < listaDestinatariosCC.length; i++) {
                    DireccionesCC[i] = new InternetAddress(listaDestinatariosCC[i]);
                    System.out.println(listaDestinatariosCC[i]);
                }
            }

            //En el siguiente bloque de condicion verificamos si es un correo con un archivo o si es un correo de solo texto
            if (modelo.getArchivo() != null) {
                //Añadimos el texto al mensaje para ser enviado
                texto.setText(modelo.getMensaje());
                //Añadimos el archivo al mensaje para ser enviado
                archivo.setDataHandler(new DataHandler(new FileDataSource(modelo.getArchivo())));
                archivo.setFileName(modelo.getArchivo().getName());
                //Añadimos el archivo y el texto al mensaje para ser enviados
                mensaje.addBodyPart(texto);
                mensaje.addBodyPart(archivo);
                if (this.vista.txt_remitente.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Ingrese su direccion de correo");
                } else {
                    //Cargamos la direccion de nuestro correo 
                    mm.setFrom(new InternetAddress(modelo.getRemitente()));
                    //Añadimos todo el contenido del mensaje junto con el archivo
                    mm.setContent(mensaje);
                }

            } else {
                //Proceso para enviar un mensaje de solo texto
                //Cargamos la direccion de nuestro correo 
                mm.setFrom(new InternetAddress(modelo.getRemitente()));

                mm.setText(modelo.getMensaje());
            }
            /*
             * Una vez validado si es un mensaje de texto o un mensaje con un archivo procedemos a enviar el mensaje
             * con el siguiente codigo a continuacion
             */

            //Comprobramos si es un mensaje cc o un mensaje sin cc
            if (this.vista.txt_destinatariocopia.getText().equals("")) {
                mm.setRecipients(Message.RecipientType.TO, Direcciones);
                System.out.println("sin cc");
            } else {
                if (!this.modelo.getDestinatarioCC().equals("")) {
                    System.out.println("CON cc");
                    mm.setRecipients(Message.RecipientType.CC, DireccionesCC);
                }

                if (!this.modelo.getDestinatario().equals("")) {
                    mm.setRecipients(Message.RecipientType.TO, Direcciones);
                    System.out.println("sin cc");
                }

            }
            //Realizamos la tranferencia del correo mediante el protocolo smtp para el envio
            Transport transferencia = session.getTransport("smtp");
            transferencia.connect(modelo.getRemitente(), this.vista.txt_contraseña.getText()); //Correo de quien envia el mensaje y la contraseña del correo
            transferencia.sendMessage(mm, mm.getAllRecipients()); //añadimos todas las direcciones a enviar el mensaje y se realiza el envio
            //transferencia.close(); //cerramos conexion

            JOptionPane.showMessageDialog(null, "MENSAJE ENVIADO");
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Error al enviar el mensaje" + e);
        }

    }

    private File CargarArchivo() {

        JFileChooser chooser = new JFileChooser(); /*nos va permitir mostrar la ventana de selecion de un archivo*/
        int n = chooser.showOpenDialog(null);
         /*Si el usuario le da en aceptar*/
        if (JFileChooser.APPROVE_OPTION == n) {
             /*Nos devolvera la ruta del archivo que seleccionamos*/
            String rutaarchivo = chooser.getSelectedFile().getAbsolutePath();
            this.Archivo = new File(rutaarchivo);
             /*Mostrara el numero de archivos que han sido cargados*/
            this.vista.lbl_mensajearchivo.setText("(1)" + Archivo.getName());
        }
         /*Devuelve el archivo*/
        return Archivo;
    }

    private void ListarCorreo() throws NoSuchProviderException, MessagingException, IOException {
        String listadocorreos="";
        String correo = JOptionPane.showInputDialog(null, "Ingrese su direccion de correo");
        String contraseña = JOptionPane.showInputDialog(null, "Ingrese su contraseña");

        if (correo.equals("")||contraseña.equals("")) {
           JOptionPane.showMessageDialog(null,"Ingrese el correo y contraseña");
        } else {
            Multipart mp = null;
            BodyPart bp = null;
            Session session = Session.getDefaultInstance(config.ConfigurarLectura(), null);/*A partir del session obtenemos 
            el almacen de correos Store*/
            Store store = session.getStore("pop3s");/*Con Store establecemoes la conexion con el 
            servidor de correo, indicando el nombre del host, correo y contraseña*/
            store.connect("pop.gmail.com", correo, contraseña);
            /*Pedimos al store que nos devuelva la carpeta "Inbox", la cual solo la leeremos*/
            Folder folder = store.getFolder("INBOX");
            folder.open(Folder.READ_ONLY);/*Solamente de lectura*/
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            /*En esta parte de aqui comenzaremos a obtener los mensajes*/
            Message mensajes[] = folder.getMessages();/*getMessages nos ayudara a obtener los mensajes,ademas 
            nos devolvera un array con los mensajes nuevos*/
            for (Message m : mensajes) {
                try {
                    /*A partir del sesion y message, indicaremos el destino del mensaje*/
                    Address[] in = m.getFrom();
                    for (Address address : in) {
                        System.out.println("Correo: " + address.toString() + "\n");
                    }
                    /*Obtendremos el contenido,el metodo getConten nos devolvera directamente 
                    el String con el texto del mensaje*/
                    Object content = m.getContent();
                    if (content instanceof String) {
                        String body = (String) content;
                        /*En caso de ser de extension multipart(documento compuesto),
                        debemos ir extrayendo cada una de sus partes*/
                    } else if (content instanceof Multipart) {
                        mp = (Multipart) m.getContent();
                        /*con getBodyPart obtendremos cada parte*/
                        bp = mp.getBodyPart(0);

                    }
                    /*Nos va a dar un listado con los correos que hayamos recibido*/
                    listadocorreos=listadocorreos+"\n"+"De: " + InternetAddress.toString(m.getRecipients(Message.RecipientType.TO))+"\n"+
                             "CC Para: " + InternetAddress.toString(m.getRecipients(Message.RecipientType.CC))+"\n"+
                             "Fecha: " + m.getSentDate()+"\n"+
                             "Asunto: " + m.getSubject()+"\n";
                   

                } catch (MessagingException ex) {
                    Logger.getLogger(CtrlCorreo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            /*Mnadamos a mostrar los correos recibidos*/
             this.vista.txt_bandeja.setText(listadocorreos+"\n");
            
        }

    }

}
