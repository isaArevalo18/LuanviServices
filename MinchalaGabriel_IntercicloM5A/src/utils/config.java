package utils;

import java.util.Properties;
import javax.swing.JFileChooser;
import javax.swing.plaf.FileChooserUI;

public class config {

    public config() {
    }

    public static Properties ConfigurarCorreo() {
        /*
        JavaMail especifica un conjunto de propiedades que se pueden configurar para configurar una conexión.
        * En esta clase con ayuda del siguiente constructor, establecemos los parametros de conoxion
        * para el mensaje
         */
        Properties Propiedades = new Properties();
        Propiedades.setProperty("mail.smtp.auth", "true"); // Usar autenticación mediante usuario y clave
        Propiedades.setProperty("mail.smtp.starttls.enable", "true"); // Establecemos la conecion segura con el servidor SMTP
        Propiedades.setProperty("mail.smtp.host", "smtp.gmail.com"); // Establecemos conexion con el servidor smtp de GMAIL
        Propiedades.setProperty("mail.smtp.port", "587");// puerto seguro SMTP de Google
        return Propiedades;
    }

    public static Properties ConfigurarLectura() {
        Properties prop = new Properties();

// Deshabilitamos TLS
        prop.setProperty("mail.pop3.starttls.enable", "false");

// Hay que usar SSL
        prop.setProperty("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");/*Nombre de la clase que nos proporciona 
        java para obtener sockets SSL*/
        prop.setProperty("mail.pop3.socketFactory.fallback", "false");/*gmail solo admite SSL, por lo
        que esta propiedad la colocamos en false*/

// Puerto 995 para conectarse.
        prop.setProperty("mail.pop3.port", "995");/*Puerto de Conexion*/
        prop.setProperty("mail.pop3.socketFactory.port", "995");/*Socket Alternativo*/
        prop.setProperty("https.proxyHost", "myProxy");
        prop.setProperty("https.proxyPort", "80");

        return prop;
    }

}
