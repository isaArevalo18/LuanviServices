
package modelo;

public class Correo {
    
   
   private String destinatario;
   private String contraseña;
   private String destinatarioCC;
   private String asunto;
   private String mensaje;

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
   
   
   
   
   
}
