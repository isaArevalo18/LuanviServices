package modelo;


import java.util.ArrayList;

public class Cliente extends Persona  {
    private static final double  Medi_amb=0.50;
    private String num_medidor;

    public Cliente(String num_medidor, String categoria, String total) {
        this.num_medidor = num_medidor;
        this.categoria = categoria;
        this.total = total;
    }

    public Cliente(String num_medidor, String categoria, String total, String cedula, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono, String correo) {
        super(cedula, nombre, apellido, fechaNacimiento, direccion, telefono, correo);
        this.num_medidor = num_medidor;
        this.categoria = categoria;
        this.total = total;
    }

    public Cliente() {
    }

    private String categoria;
    private String total;


    public String getNum_medidor() {
        return num_medidor;
    }

    public void setNum_medidor(String num_medidor) {
        this.num_medidor = num_medidor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public double getMedi_amb(){
        return Medi_amb;
    }
    

}
