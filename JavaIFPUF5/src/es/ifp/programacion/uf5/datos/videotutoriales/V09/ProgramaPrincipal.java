package es.ifp.programacion.uf5.datos.videotutoriales.V09;


/**
 * 
 * Dada la clase Persona incluida en el proyecto, se desea:
 * 
 * Hacer los cambios oportunos para que se muestre un mensaje
 * personalizado en la consola cuando la edad del alumno sea menor de 18.
 * Utilizando Excepciones.
 * 
 * La excepcion creada se transladara a los niveles superiores de la aplicacion para
 * que sea capturada por la interfaz de usuario y muestre un aviso en la aplicacion.
 * 
**/

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//Declaracion de objetos y variables
		
		try {
			Alumno kevin = new Alumno("ID01", "Kevin", "Fuentes Duran", 28, "MAT404");
		} 
		catch (MensajeEdadException mee) {
			System.out.println("Error: "+mee.getMessage());
		}
		
		try {
			Alumno maria = new Alumno("ID02", "Maria", "Gonzalez Segura", 17, "MAT405");
		} 
		catch (MensajeEdadException mee) {
			System.out.println("Error: "+mee.getMessage());
		}
		
	}

}
