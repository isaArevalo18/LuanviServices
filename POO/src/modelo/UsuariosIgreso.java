
package modelo;


public class UsuariosIgreso {
    String usuario;
    String contraseña;
    String tipoEmp;

    public UsuariosIgreso() {
    }

    public UsuariosIgreso(String usuario, String contraseña, String tipoEmp) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipoEmp = tipoEmp;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipoEmp() {
        return tipoEmp;
    }

    public void setTipoEmp(String tipoEmp) {
        this.tipoEmp = tipoEmp;
    }
    
    
}
