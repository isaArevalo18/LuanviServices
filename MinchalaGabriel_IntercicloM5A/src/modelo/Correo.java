
package modelo;

import java.io.File;

public class Correo {
    
   private String remitente;
   private String destinatario;
   private String contraseña;
   private String destinatarioCC;
   private String asunto;
   private String mensaje;
   private File archivo;
 

    public Correo() {
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDestinatarioCC() {
        return destinatarioCC;
    }

    public void setDestinatarioCC(String destinatarioCC) {
        this.destinatarioCC = destinatarioCC;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }


    
    @Override
    public String toString() {
        return "Correo{" + "remitente=" + remitente + ", destinatario=" + destinatario + ", contrase\u00f1a=" + contraseña + ", destinatarioCC=" + destinatarioCC + ", asunto=" + asunto + ", mensaje=" + mensaje + '}';
    }
   
   
   
   
   
}
