package modelo;

import java.util.ArrayList;

public class Lecturas {

    private int idlectura;
    private String lectura;
    private String fechalectura;
    private int consumo;
    private String estado;
    private int idCliente;
    private int idPlanilla;
    private double valorpago;
    private int meslectura;
    private int lecturaAnterior;
    private String fechaLecturaAnterior;

    public Lecturas() {
    }
    
    public int getIdlectura() {
        return idlectura;
    }

    public void setIdlectura(int idlectura) {
        this.idlectura = idlectura;
    }

    public String getLectura() {
        return lectura;
    }

    public void setLectura(String lectura) {
        this.lectura = lectura;
    }

    public String getFechalectura() {
        return fechalectura;
    }

    public void setFechalectura(String fechalectura) {
        this.fechalectura = fechalectura;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(int idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public double getValorpago() {
        return valorpago;
    }

    public void setValorpago(double valorpago) {
        this.valorpago = valorpago;
    }

    public int getMeslectura() {
        return meslectura;
    }

    public void setMeslectura(int meslectura) {
        this.meslectura = meslectura;
    }

    public int getLecturaAnterior() {
        return lecturaAnterior;
    }

    public void setLecturaAnterior(int lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    public String getFechaLecturaAnterior() {
        return fechaLecturaAnterior;
    }

    public void setFechaLecturaAnterior(String fechaLecturaAnterior) {
        this.fechaLecturaAnterior = fechaLecturaAnterior;
    }
   
    
   

}
