package modelo;

import java.util.ArrayList;
import java.util.List;

/*
  * Esta clase tendra la funcionalidad de proporcionarnos una vista detallada de las facturas de un cliente en una tabla
 */
public class DetallePlanilla extends Planilla {

    int idcliente;
    int idlectura;
    String cedula;
    String nombrecliente;
    String apellidopcliente;
    String direccioncliente;
    String numeromedidor;
    String estado;
    String telefono;
    String consumo;
    String lectura_anterior;
    String lectura_actual;
    String mespago;
    String correocliente;

    public static List<DetallePlanilla> cargarPlanilla = new ArrayList<>();

    public DetallePlanilla() {
    }

    public DetallePlanilla(String nombrecliente, String apellidopcliente, String direccioncliente, String numeromedidor, String estado, int idplanilla, String fechaPlanilla, double total, int idCliente) {
        super(idplanilla, fechaPlanilla, total, idCliente);
        this.nombrecliente = nombrecliente;
        this.apellidopcliente = apellidopcliente;
        this.direccioncliente = direccioncliente;
        this.numeromedidor = numeromedidor;
        this.estado = estado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getApellidopcliente() {
        return apellidopcliente;
    }

    public void setApellidopcliente(String apellidopcliente) {
        this.apellidopcliente = apellidopcliente;
    }

    public String getDireccioncliente() {
        return direccioncliente;
    }

    public void setDireccioncliente(String direccioncliente) {
        this.direccioncliente = direccioncliente;
    }

    public String getNumeromedidor() {
        return numeromedidor;
    }

    public void setNumeromedidor(String numeromedidor) {
        this.numeromedidor = numeromedidor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getLectura_anterior() {
        return lectura_anterior;
    }

    public void setLectura_anterior(String lectura_anterior) {
        this.lectura_anterior = lectura_anterior;
    }

    public String getLectura_actual() {
        return lectura_actual;
    }

    public void setLectura_actual(String lectura_actual) {
        this.lectura_actual = lectura_actual;
    }

    public static List<DetallePlanilla> getCargarPlanilla() {
        return cargarPlanilla;
    }

    public static void setCargarPlanilla(List<DetallePlanilla> cargarPlanilla) {
        DetallePlanilla.cargarPlanilla = cargarPlanilla;
    }

    public String getMespago() {
        return mespago;
    }

    public void setMespago(String mespago) {
        this.mespago = mespago;
    }

    public String getCorreocliente() {
        return correocliente;
    }

    public void setCorreocliente(String correocliente) {
        this.correocliente = correocliente;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdlectura() {
        return idlectura;
    }

    public void setIdlectura(int idlectura) {
        this.idlectura = idlectura;
    }

}
