package modelo;

public class Planilla {

    private int idplanilla;
    private String fechaPlanilla;
    private double total;
    private int idCliente;
    private double consumoexceso;
    private double consumosinexceso;

    public Planilla() {

    }

    public Planilla(int idplanilla, String fechaPlanilla, double total, int idCliente) {
        this.idplanilla = idplanilla;
        this.fechaPlanilla = fechaPlanilla;
        this.total = total;
        this.idCliente = idCliente;
    }

    public int getIdplanilla() {
        return idplanilla;
    }

    public void setIdplanilla(int idplanilla) {
        this.idplanilla = idplanilla;
    }

    public String getFechaPlanilla() {
        return fechaPlanilla;
    }

    public void setFechaPlanilla(String fechaPlanilla) {
        this.fechaPlanilla = fechaPlanilla;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getConsumoexceso() {
        return consumoexceso;
    }

    public void setConsumoexceso(double consumoexceso) {
        this.consumoexceso = consumoexceso;
    }

    public double getConsumosinexceso() {
        return consumosinexceso;
    }

    public void setConsumosinexceso(double consumosinexceso) {
        this.consumosinexceso = consumosinexceso;
    }

}
