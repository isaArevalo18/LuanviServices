package Config;

public class GeneradorPasswordRecuperacion {

    private String password;
    private int longitud;

    public GeneradorPasswordRecuperacion(int longitud) {
        this.longitud = longitud;
        password = generarPassword();
    }

    public String getPassword() {
        return password;
    }

    public String generarPassword() {
        String clave = "";

        for (int i = 0; i < longitud; i++) {
            Integer eleccion = ((int) Math.floor(Math.random() * 5 + 1));
            clave += eleccion.toString();
        }
        return clave;
    }
}
