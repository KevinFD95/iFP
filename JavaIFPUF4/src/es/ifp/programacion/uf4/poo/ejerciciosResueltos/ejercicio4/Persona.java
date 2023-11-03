package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio4;

/**
 * CLASE EJERCICIOS RESUELTOS 4, 5, 6 Y 7: PERSONA
 * 
 * Clase padre Persona de otras cuatro clases: Entrenador, JugadorBasket, JugadorFutbol y Nadador.
 * 
 * Datos:
 * String nombre
 * String apellidos
 * String dni
 * 
 * Constructor con todos los datos
 * 
 * Metodos get, set y toString
 */

public class Persona {

	//ATRIBUTOS
	
	private String nombre;
	private String apellidos;
	private String dni;
	
	//CONSTRUCTORES
	
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	//METODOS
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	public void setApellidos(String nuevosApellidos) {
		this.apellidos = nuevosApellidos;
	}
	
	public String getDni() {
		return this.dni;
	}
	public void setDni(String nuevoDni) {
		this.dni = nuevoDni;
	}
	
	public String toString() {
		return  "Nombre: "+this.nombre+"\n"+
				"Apellidos: "+this.apellidos+"\n"+
				"DNI: "+this.dni;
	}
}
