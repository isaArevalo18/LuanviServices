
package modelo;

public class Empleado extends Usuario{
    private int IdEmpleado;
    private String cargo;
    private String clave;
    private String usuario;
    private String fechaCreacion;
    private int idusuario;

    public Empleado() {
    }

    public Empleado(int IdEmpleado, String cargo, String clave, String usuario) {
        this.IdEmpleado = IdEmpleado;
        this.cargo = cargo;
        this.clave = clave;
        this.usuario = usuario;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
    
    
}
