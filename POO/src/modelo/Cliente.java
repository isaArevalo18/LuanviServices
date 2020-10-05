package modelo;


import java.util.ArrayList;

public class Cliente extends Usuario{
    private int idCliente;
    private String fechaCreacion;
    private String num_medidor;
    private int idusuario;

    public Cliente() {
    }

    public Cliente(int idCliente, String fechaCreacion,String num_medidor, int idusuario) {
        this.idCliente = idCliente;
        this.fechaCreacion = fechaCreacion;
        this.num_medidor = num_medidor;
        this.idusuario = idusuario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNum_medidor() {
        return num_medidor;
    }

    public void setNum_medidor(String num_medidor) {
        this.num_medidor = num_medidor;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", fechaCreacion=" + fechaCreacion + ", num_medidor=" + num_medidor + ", idusuario=" + idusuario + '}';
    }
    
    

}
