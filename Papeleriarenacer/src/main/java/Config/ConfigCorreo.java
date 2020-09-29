
package Config;

import java.util.Properties;

public class ConfigCorreo {
    public static String CorreoSistema="cuenta.prueba.ex16@gmail.com";
    public static String Password="Peluches18"; 
     public static Properties ConfigurarServidorCorreo() {
        String proveedorCorreo = "smtp.gmail.com";
        Properties Propiedades = new Properties();
        Propiedades.setProperty("mail.smtp.auth", "true"); // Usar autenticación mediante usuario y clave
        Propiedades.setProperty("mail.smtp.starttls.enable", "true"); // Establecemos la conecion segura con el servidor SMTP
        Propiedades.setProperty("mail.smtp.host", proveedorCorreo); // Establecemos conexion con el servidor smtp de GMAIL
        Propiedades.setProperty("mail.smtp.port", "587");// puerto seguro SMTP de Google
        
        return Propiedades;
    }
}
