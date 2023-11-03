package es.ifp.programacion.uf5.datos.videotutoriales.V09;

/**
 * Excepcion que se lanza cuando un alumno tiene menos de 18 años
 * Llama al constructor de la clase padre.
 */

public class MensajeEdadException extends Exception {

	//CONSTRUCTOR
	
	MensajeEdadException(String msg ){
		super(msg);
	}
	
}
