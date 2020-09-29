package modelo;

public class Usuario extends Persona {

    private String cod_usuario;
    private String num_medidor;
    private String lec_actual;
    private String lec_anterior;
    

    public Usuario() {
    }
    

    //**************************CONSTRUCTOR********************************//
    public Usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public Usuario(String cod_usuario, String cedula, String nombre, String apellido, String edad, String direccion, String telefono, String correo) {
        super(cedula, nombre, apellido, edad, direccion, telefono, correo);
        this.cod_usuario = cod_usuario;
    }
    //*****************************METODOS**********************************
    public String getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNum_medidor() {
        return num_medidor;
    }

    public void setNum_medidor(String num_medidor) {
        this.num_medidor = num_medidor;
    }

    public String getLec_actual() {
        return lec_actual;
    }

    public void setLec_actual(String lec_actual) {
        this.lec_actual = lec_actual;
    }

    public String getLec_anterior() {
        return lec_anterior;
    }

    public void setLec_anterior(String lec_anterior) {
        this.lec_anterior = lec_anterior;
    }
    
    

    

}
