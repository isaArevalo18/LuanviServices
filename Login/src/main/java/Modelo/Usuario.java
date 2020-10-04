
package Modelo;


public class Usuario {
    private int id;
    private String usuario,clave,correo;

    public Usuario() {
    }

    public Usuario(int id, String usuario, String clave, String correo) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", usuario=" + usuario + ", clave=" + clave + ", correo=" + correo + '}';
    }
    
            
}
