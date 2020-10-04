package Controlador;

import Config.ConfigCorreo;
import Config.GeneradorPasswordRecuperacion;
import ModeloDao.UsuarioDao;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class CtrlUsuario {

    UsuarioDao DAO = new UsuarioDao();

    //Método de inicio de sesion
    public String Login(String usuario, String clave) {
        //Se llama al metodo de IniciarSesion con los datos (correo, clave)
        return DAO.IniciarSesion(usuario, clave);
    }

    //Método de envio de clave al correo
    public boolean EnvioClave(String correo) {
        //Se declara la variable a retornar
        Boolean res = true;
        //Se llama al método de comprobar correo
        String existente = DAO.comprobarCorreo(correo);
        //Se compara si llega la clave del correo
        if (existente.equals("")) {
            res = false;
        } else {
            /* 
                   * LLamamos una instancia de la clase generar Password la cual  recibe en su constructor 
                   * el tamaño de la clave de recuperacion que deseamos el maximo tamaño puede ser 16
             */
            GeneradorPasswordRecuperacion generadorclave = new GeneradorPasswordRecuperacion(6);
            //llamamos a la funcion de cambiarClave para cambiar la clave anterior por una clave aleatoria de recuperacion
            if (DAO.actualizarClave(existente, generadorclave.getPassword()) > 0) {
                //Se declara el session cargando las propiedades de la clase ConfigCorreo
                Session session = Session.getDefaultInstance(ConfigCorreo.ConfigurarServidorCorreo(), new javax.mail.Authenticator() {
                    @Override
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        //Se autentifica con el (correo y clave) del correo del cual se enviara la clave
                        return new javax.mail.PasswordAuthentication(ConfigCorreo.CorreoSistema, ConfigCorreo.Password);
                    }
                });
                try {
                    //Convertimos a un Iternet Address la direccion del remitente
                    Address Direccion = new InternetAddress(correo);
                    //Creamos un objeto Mimemessage a partir de la session
                    MimeMessage message = new MimeMessage(session);
                    //Añadimos el remitente al que se envia el mensaje
                    message.setFrom(Direccion);
                    //Añadimos el asunto
                    message.setSubject("RECUPERACION DE CONTRASEÑA");

                    //Añadimos el contenido de texto del mensaje
                    message.setText("La Contraseña de Recuperacion para su cuenta es: " + generadorclave.getPassword());
                    //Añadimos el tipo de envio y la direccion de correo a la que se envia
                    message.setRecipient(Message.RecipientType.TO, Direccion);
                    System.out.println("Enviando .....");
                    //Se envia el correo
                    Transport.send(message);
                    JOptionPane.showMessageDialog(null, "MENSAJE DE RECUPERACION ENVIADO, REVISE SU CORREO");
                } catch (MessagingException e) {
                    System.out.println("Error" + e);
                }
            }else{
                 JOptionPane.showMessageDialog(null, "Error de Actualizacion de Clave Temporal Revisa la BD o su conexion");
            }

        }
        return res;
    }
}
