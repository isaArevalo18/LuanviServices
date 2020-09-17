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

	public boolean ingresarEmpleado(Long id, String apellido, String nombre, String fecha,Long iddireccion, String calleprincipal,
                String callesecundaria,int numero,String barrio,String telefono) throws JPAException {
		Empleado empleado = new Empleado(id, apellido, nombre, fecha);
                empleado.setDireccion(new Direccion(iddireccion,calleprincipal,callesecundaria,numero,barrio,telefono));
		return objServicios.insertar(empleado);
	}//eoc

	public boolean eliminarEmpleado(Long id) throws JPAException {
		return objServicios.eliminar(id);
	}

	public boolean modificarEmpleado(Long id, String apellido, String nombre, String fecha,Long iddireccion, String calleprincipal,
                String callesecundaria,int numero,String barrio,String telefono)throws JPAException {
		Empleado empleado = new Empleado(id, apellido, nombre, fecha);
                empleado.setDireccion(new Direccion(iddireccion,calleprincipal,callesecundaria,numero,barrio,telefono));
		return objServicios.actualizar(empleado);
	}

	public List<Empleado> obtenerEmpleados() {
		return objServicios.obtenerTodos();
	}
}//{}



