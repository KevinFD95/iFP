package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio2;

/**
 * CLASE EJERCICIOS RESUELTOS 2 Y 3: PROFESOR
 * 
 * Clase que hereda de persona, una clase hija con los datos especificos del objeto Profesor
 * 
 * Datos:
 * Heredados: super nombre, apellido1, apellido2, dni, correo, numTlf, direccion.
 * String titulo
 * String materia
 */

public class Profesor extends Persona{

	//ATRIBUTOS
	
	private String titulo;
	private String materia;
	
	//CONSTRUCTORES
	
	/**
	 * CONSTRUCTOR CON TODOS LOS DATOS
	 * 
	 * @param nombre un String con los datos del nombre del profesor
	 * @param apellido1 un String con el primer apellido del profesor
	 * @param apellido2 un String con el segundo apellido del profesor
	 * @param dni un String con el DNI del profesor
	 * @param correo un String con el correo electronico del profesor
	 * @param numTlf un int con el numero de telefono del profesor
	 * @param direccion un objeto de tipo Direccion con los datos de la direccion del profesor
	 * @param titulo un String con la titulacion del profesor
	 * @param materia un String con la materia que imparte el profesor
	 */
	public Profesor(String nombre, String apellido1, String apellido2, String dni, String correo, int numTlf, Direccion direccion, String titulo, String materia) {
		super(nombre, apellido1, apellido2, dni, correo, numTlf, direccion);
		this.titulo = titulo;
		this.materia = materia;
	}
	
	/**
	 * CONSTRUCTOR CON TODOS LOS DATOS DESGLOSANDO LOS QUE ESTAN EN EL OBJETO DIRECCION
	 * 
	 * @param nombre un String con los datos del nombre del profesor
	 * @param apellido1 un String con el primer apellido del profesor
	 * @param apellido2 un String con el segundo apellido del profesor
	 * @param dni un String con el DNI del profesor
	 * @param correo un String con el correo electronico del profesor
	 * @param numTlf un int con el numero de telefono del profesor
	 * @param calle un String con el nombre de la calle del profesor
	 * @param num un int con el numero de la calle del profesor
	 * @param puerta un char con la puerta del profesor
	 * @param localidad un String con la localidad del profesor
	 * @param municipio un String con el municipio del profesor
	 * @param titulo un String con la titulacion del profesor
	 * @param materia un String con la materia que imparte el profesor
	 */
	public Profesor(String nombre, String apellido1, String apellido2, String dni, String correo, int numTlf, String calle, int num,
					char puerta, String localidad, String municipio, String titulo, String materia) {
		super(nombre, apellido1, apellido2, dni, correo, numTlf, calle, num, puerta, localidad, municipio);
		this.titulo = titulo;
		this.materia = materia;
	}
	
	/**
	 * CONSTRUCTOR CON LOS DATOS BASICOS (NOMBRE, APELLIDOS Y DNI)
	 * 
	 * @param nombre un String con los datos del nombre del profesor
	 * @param apellido1 un String con el primer apellido del profesor
	 * @param apellido2 un String con el segundo apellido del profesor
	 * @param dni un String con el DNI del profesor
	 */
	public Profesor(String nombre, String apellido1, String apellido2, String dni) {
		super(nombre, apellido1, apellido2, dni);
	}
	
	//MÉTODOS

	/**
	 * Metodo get que devuelve la titulacion del profesor
	 * @return titulo un String con la titulacion del profesor
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Metodo set que cambia la titulacion del profesor
	 * @param nuevoTitulo un String con la nueva titulacion del profesor
	 */
	public void setTitulo(String nuevoTitulo) {
		this.titulo = nuevoTitulo;
	}

	/**
	 * Metodo get que devuelve la materia que imparte el profesor
	 * @return materia un String con la materia que imparte el profesor
	 */
	public String getMateria() {
		return materia;
	}

	/**
	 * Metodo set que cambia la materia que imparte el profesor
	 * @param nuevaMateria un String con la nueva materia que imparte el profesor
	 */
	public void setMateria(String nuevaMateria) {
		this.materia = nuevaMateria;
	}
	
	/**
	 * Metodo toString que reune todos los datos del profesor, de la propia clase y la clase padre Persona
	 * @return un String con todos los datos del profesor
	 */
	public String toString() {
		
			return  "Nombre: "+super.getNombre()+"\n"+
					"Apellidos: "+super.getApellido1()+" "+super.getApellido2()+"\n"+
					"DNI: "+super.getDni()+"\n"+
					"Correo Electrónico: "+super.getCorreo()+"\n"+
					"Número de teléfono: "+super.getNumTlf()+"\n"+
					"Dirección: "+super.getDireccion()+"\n"+
					"Titulación: "+this.getTitulo()+"\n"+
					"Material que imparte: "+this.getMateria();
	}
}