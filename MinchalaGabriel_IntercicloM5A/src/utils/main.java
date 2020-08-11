package utils;

import controlador.CtrlCorreo;
import modelo.Correo;
import vista.VistaCorreo;

public class main {

    public static void main(String[] args) {
        Correo modelo = new Correo();
        VistaCorreo vista = new VistaCorreo();
        CtrlCorreo controlador = new CtrlCorreo(modelo, vista);
        controlador.iniciar();
    }
}
