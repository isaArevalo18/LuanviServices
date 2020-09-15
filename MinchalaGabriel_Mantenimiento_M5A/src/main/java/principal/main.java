
package principal;

import controlador.CtrlEmpleado;
import modelo.Empleado;
import vista.VistaMantenimiento;

public class main {
    public static void main(String[] args) {
        Empleado modelo=new Empleado();
        VistaMantenimiento vista=new VistaMantenimiento();
        CtrlEmpleado controlador=new CtrlEmpleado(modelo, vista);
        controlador.Iniciar();
    }
}
