
package utils;

import java.util.Properties;

public class config {

    public config() {
        /*
        * En esta clase con ayuda del siguiente constructor, establecemos los parametros de conoxion
        * para el mensaje
        */
        Properties Propiedades = new Properties(); 
        Propiedades.setProperty("mail.smtp.auth", "true"); // Usar autenticación mediante usuario y clave
        Propiedades.setProperty("mail.smtp.starttls.enable", "true"); // Establecemos la conecion segura con el servidor SMTP
        Propiedades.setProperty("mail.smtp.host", "smtp.gmail.com"); // Establecemos conexion con els ervidor smtp de GMAIL
        Propiedades.setProperty("mail.smtp.port", "587");// puerto seguro SMTP de Google
    }
    
}
