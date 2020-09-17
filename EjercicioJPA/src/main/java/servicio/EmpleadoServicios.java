package servicio;

import java.util.List;
//
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import modelo.Empleado;

public class EmpleadoServicios {

	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JhonZ");

	public boolean insertar (Empleado objEmpleado) throws JPAException{
		EntityManager man = emf.createEntityManager();
		//
		try {
			man.getTransaction().begin();
			man.persist(objEmpleado);
			man.getTransaction().commit();
			//
		} catch (JPAException e) {
			man.getTransaction().rollback();
			throw new JPAException(e.getMessage(), e);

		} finally {
			man.close();
		}
		return true;
	}//eoc

	public boolean actualizar (Empleado objEmpleado) throws JPAException {
		EntityManager man = emf.createEntityManager();
		//
		try {
			man.getTransaction().begin();
			//
			man.merge(objEmpleado);
			//
			man.getTransaction().commit();
		} catch (java.lang.IllegalArgumentException e) {
			man.getTransaction().rollback();
			throw new JPAException(e.getMessage(), e);
		}finally {
			man.close();
		}
		return true;
	}//eoc

	public boolean eliminar (Long id) throws JPAException {
		EntityManager man = emf.createEntityManager();
		Empleado empleado = man.find(Empleado.class, id);
		//
		try {
			man.getTransaction().begin();
			man.remove(empleado);
			man.getTransaction().commit();
			//
		} catch (JPAException e) {
			man.getTransaction().rollback();
			throw new JPAException(e.getMessage(), e);
		}finally {
			man.close();
		}
		return true;
	}//eoc

	public List<Empleado> obtenerTodos() {
		EntityManager man = emf.createEntityManager();
		List<Empleado> empleados = (List<Empleado>) man.createQuery("FROM Empleado").getResultList();
//		List<Empleado> empleados = (List<Empleado>) man.createQuery("SELECT e FROM Empleado e").getResultList();
		return empleados;
	}//eoc
}





















