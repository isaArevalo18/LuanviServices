package controlador;
//

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import modelo.Direccion;
import servicio.EmpleadoServicios;
import modelo.Empleado;
import servicio.JPAException;

public class ControladorEmpleado {

    //
    private EmpleadoServicios objServicios;
    //private jdlgMantenimiento objMantenimiento;

    public ControladorEmpleado() {
        //inicialisar los objServicios y objMantenimiento
        objServicios = new EmpleadoServicios();
    }
    //ingreso de los campos 

    public boolean ingresarEmpleado(Long id, String apellido, String nombre, String fecha, Long iddireccion, String calleprincipal,
            String callesecundaria, int numero, String barrio, String telefono) throws JPAException {
        Empleado empleado = new Empleado(id, apellido, nombre, fecha);
        empleado.setDireccion(new Direccion(iddireccion, calleprincipal, callesecundaria, numero, barrio, telefono));
        return objServicios.insertar(empleado);
    }//eoc
    //metodo eliminacion

    public boolean eliminarEmpleado(Long id) throws JPAException {
        return objServicios.eliminar(id);
    }
    //metodo de modficacion empleado y direccion

    public boolean modificarEmpleado(Long id, String apellido, String nombre, String fecha, Long iddireccion, String calleprincipal,
            String callesecundaria, int numero, String barrio, String telefono) throws JPAException {
        //modificacion empleado	
        Empleado empleado = new Empleado(id, apellido, nombre, fecha);
        //modificacion direccion
        empleado.setDireccion(new Direccion(iddireccion, calleprincipal, callesecundaria, numero, barrio, telefono));
        return objServicios.actualizar(empleado);
    }
//listado de empleados
    public List<Empleado> obtenerEmpleados() {
        return objServicios.obtenerTodos();
    }
}//{}

