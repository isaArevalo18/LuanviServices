package controlador;
//

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
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

	public boolean ingresarEmpleado(Long id, String apellido, String nombre, String fecha) throws JPAException {
		Empleado empleado = new Empleado(id, apellido, nombre, fecha);
		return objServicios.insertar(empleado);
	}//eoc

	public boolean eliminarEmpleado(Long id) throws JPAException {
		return objServicios.eliminar(id);
	}

	public boolean modificarEmpleado(Long id, String nombre, String apellido, String fecha)throws JPAException {
		Empleado empleado = new Empleado(id, apellido, nombre, fecha);
		return objServicios.actualizar(empleado);
	}

	public List<Empleado> obtenerEmpleados() {
		return objServicios.obtenerTodos();
	}
}//{}



