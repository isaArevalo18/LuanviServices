
package modelo;

import java.util.ArrayList;


public class Lecturas {
    public static ArrayList<Lecturas> listaLectura = new ArrayList<>();
    private String fecha_lecturaAct;
    private String fecha_lecturaAnter;
    private String lecturaAnter;
    private String lecturaAct;
    private String numMedidor;
    private String consumo;
    private boolean estado;

    public Lecturas() {
    }
    

    public String getFecha_lecturaAct() {
        return fecha_lecturaAct;
    }

    public void setFecha_lecturaAct(String fecha_lecturaAct) {
        this.fecha_lecturaAct = fecha_lecturaAct;
    }

    public String getFecha_lecturaAnter() {
        return fecha_lecturaAnter;
    }

    public void setFecha_lecturaAnter(String fecha_lecturaAnter) {
        this.fecha_lecturaAnter = fecha_lecturaAnter;
    }

    public String getLecturaAnter() {
        return lecturaAnter;
    }

    public void setLecturaAnter(String lecturaAnter) {
        this.lecturaAnter = lecturaAnter;
    }

    public String getLecturaAct() {
        return lecturaAct;
    }

    public void setLecturaAct(String lecturaAct) {
        this.lecturaAct = lecturaAct;
    }

    public String getNumMedidor() {
        return numMedidor;
    }

    public void setNumMedidor(String numMedidor) {
        this.numMedidor = numMedidor;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public static String getcodigo(){
        return "fac"+listaLectura+1;
    }
    
}
