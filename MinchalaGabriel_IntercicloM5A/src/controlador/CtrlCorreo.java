package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
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

public class CtrlCorreo implements ActionListener {

    private Correo modelo;
    private VistaCorreo vista;
    private File Archivo;

    /*
    Este constructor conecta la vista con el modelo, mediante el controlador
    */
    public CtrlCorreo(Correo modelo, VistaCorreo vista) {
        this.modelo = modelo;
        this.vista = vista;
        //importante añadir los antion listerner de cada boton para que funcionen caso contratio no lo haran
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
        this.vista.setVisible(true);
    }

     /* Este metodo sobrecargado permite capturar los eventos de la parte grafica
        * es decir, cada vez que se da un click en algun boton en la vista se llamara a algun metodo del controlador
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.item_enviar) {
            this.vista.pl_enviarcorreo.setVisible(true);
        }
        if (e.getSource() == this.vista.item_recibir) {

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
            transferencia.connect(modelo.getRemitente(), "Ista2019-2020"); //Correo de quien envia el mensaje y la contraseña del correo
            transferencia.sendMessage(mm, mm.getAllRecipients()); //añadimos todas las direcciones a enviar el mensaje y se realiza el envio
            transferencia.close(); //cerramos conexion

            JOptionPane.showMessageDialog(null, "MENSAJE ENVIADO");
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Error al enviar el mensaje" + e);
        }

    }

    private File CargarArchivo() {

        JFileChooser chooser = new JFileChooser();
        int n = chooser.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == n) {
            String rutaarchivo = chooser.getSelectedFile().getAbsolutePath();
            this.Archivo = new File(rutaarchivo);
            this.vista.lbl_mensajearchivo.setText("(1)" + Archivo.getName());
        }
        return Archivo;
    }

}
