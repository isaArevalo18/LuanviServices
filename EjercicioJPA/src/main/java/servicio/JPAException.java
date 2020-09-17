package servicio;

import java.awt.AWTException;
import javax.persistence.PersistenceException;

public class JPAException extends PersistenceException {

	public JPAException(String message, Throwable cause) {
		super(message, cause);
	}
}




