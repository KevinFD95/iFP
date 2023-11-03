package es.ifp.programacion.uf4.poo.conferencias.confe1;

import es.ifp.programacion.uf4.poo.ejemplos.ejercicio2.herencia.clases.Direccion;

/**
 * Definicion de la clase Persona
 * Una persona se compone de un nombre, apellidos, edad, correo electronico...
 * 
 * Nuevo requisito:
 * Ademas tiene direccion fisica: Calle, numero, poblacion y CP
 */

public class Persona {

	//ARTRIBUTOS
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String correoElectronico;
	
	//Por composicion, creo un atributo para la direccion de la persona (no es igual que la herencia)
	//A diferencia de la herencia, aqui definimos un atributo con la clase Direccion, con la herencia
	//no definimos el atributo ya que viene dada con el 'extends'
	private Direccion direccionPersona;
	
	static String nacionalidad = "España"; //Atributo de clase, todos los objetos de esta clase tienen este valor.
	
	//CONSTRUCTORES SIN PARAMETROS
	
	public Persona(){ //Si el constructor no tiene visibilidad (public/private/protected), solo se puede ver desde su package.
		nombre = "";
		apellidos = "";
		edad = 0;
		correoElectronico = "";
	}
	
	// CONSTRUCTORES CON PARAMETROS
	/**
	 * Es la definición que utilizaremos para construir un objeto en un programa.
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre; //Al atributo nombre le asigno el parámetro nombre. this.Atributo = parámetro.
		this.apellidos = apellidos;
		this.edad = edad;
	}
	/**
	 * Constructor con un parametro extra
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param correo
	 */
	public Persona(String nombre, String apellidos, int edad, String correo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.correoElectronico = correo;
	}
	
	//MÉTODOS
	/**
	 * Retorna true si es mayor de edad, false si no.
	 * @return
	 */
	public boolean esMayor() {
		if(this.edad >= 18) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Metodo get que retorna el nombre de la persona
	 * @return nombre un String con el nombre de la persona
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Metodo set que cambia el nombre de la persona
	 * @param nuevoNombre un String con el nuevo nombre de la persona
	 */
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	/**
	 * Metodo get que retorna los apellidos de la persona
	 * @return apellidos un String con los apellidos de la persona
	 */
	public String getApellidos() {
		return this.apellidos;
	}
	
	/**
	 * Metodo set que cambia los apellidos de la persona
	 * @param nuevosApellidos un String con los nuevos apellidos de la persona
	 */
	public void setApellidos(String nuevosApellidos) {
		this.apellidos = nuevosApellidos;
	}
	
	/**
	 * Metodo get que retorna la edad de la persona
	 * @return edad un int con la edad de la persona
	 */
	public int getEdad() {
		return this.edad;
	}
	
	/**
	 * Metodo set que cambia la edad de la persona
	 * @param nuevaEdad un int que cambia la edad de la persona
	 */
	public void setEdad(int nuevaEdad) {
		this.edad = nuevaEdad;
	}
	
	/**
	 * Metodo get que retorna el correo de la persona
	 * @return correoElectronico un String con el correo de la persona
	 */
	public String getCorreo() {
		return this.correoElectronico;
	}
	/**
	 * Metodo set que cambia el correo de la persona
	 * @param nuevoCorreo un String con el nuevo correo de la persona
	 */
	public void setCorreo(String nuevoCorreo) {
		this.correoElectronico = nuevoCorreo;
	}
	
	/**
	 * Metodo que retorna la nacionalidad de la persona
	 * @return nacionalidad un String con la nacionalidad de la persona
	 */
	public String nacionalidad() {
		return this.nacionalidad();
	}

	/**
	 * Metodo que retorna la direccion dela persona dada por la clase Direccion
	 * @return direccionPersona un objeto de la clase Direccion
	 */
	public Direccion getDireccionPersona() {
		return direccionPersona;
	}

	/**
	 * Metodo que modifica la direccion de la persona
	 * @param direccionPersona un objeto Direccion que cambia la direccion de la persona
	 */
	public void setDireccionPersona(Direccion direccionPersona) {
		this.direccionPersona = direccionPersona;
	}
	/**
	 * Sobreescribimos el metodo toString de la clase Object
	 */
	public String toString() {
		return "Nombre: "+this.nombre+", apellidos: "+this.apellidos+", edad: "+this.edad+", correo: "+this.correoElectronico;
	}
	
}