package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio2;

/**
 * CLASE EJERCICIOS RESUELTOS 2 Y 3: ALUMNO
 * 
 * Clase que hereda de persona, una clase hija con los datos especificos del objeto Alumno
 * 
 * Datos:
 * Heredados: super nombre, apellido1, apellido2, dni, correo, numTlf, direccion.
 * int edad
 */

public class Alumno extends Persona{

	//ATRIBUTOS
	
	private int edad;
	
	//CONSTRUCTORES
	
	/**
	 * CONSTRUCTOR CON TODOS LOS DATOS
	 * 
	 * @param nombre un String con los datos del nombre del alumno
	 * @param apellido1 un String con el primer apellido del alumno
	 * @param apellido2 un String con el segundo apellido del alumno
	 * @param dni un String con el DNI del alumno
	 * @param correo un String con el correo electronico del alumno
	 * @param edad un int con la edad del alumno
	 * @param direccion un objeto de tipo Direccion con los datos de la direccion del alumno
	 */
	public Alumno(String nombre, String apellido1, String apellido2, String dni, String correo, int edad, Direccion direccion) {
		super(nombre, apellido1, apellido2, dni, correo, direccion);
		this.edad = edad;
	}
	
	/**
	 * CONSTRUCTOR CON TODOS LOS DATOS DESGLOSANDO LOS QUE ESTAN EN EL OBJETO DIRECCION
	 * 
	 * @param nombre un String con los datos del nombre del alumno
	 * @param apellido1 un String con el primer apellido del alumno
	 * @param apellido2 un String con el segundo apellido del alumno
	 * @param dni un String con el DNI del alumno
	 * @param correo un String con el correo electronico del alumno
	 * @param edad un int con la edad del alumno
	 * @param calle un String con el nombre de la calle del alumno
	 * @param num un int con el numero de la calle del alumno
	 * @param puerta un char con la puerta del alumno
	 * @param localidad un String con la localidad del alumno
	 * @param municipio un String con el municipio del alumno
	 */
	public  Alumno(String nombre, String apellido1, String apellido2, String dni, String correo, int edad, String calle, 
			int num, char puerta, String localidad, String municipio) {
		super(nombre, apellido1, apellido2, dni,correo, calle, num, puerta, localidad, municipio);
		this.edad = edad;
	}
	
	/**
	 * CONSTRUCTOR CON LOS DATOS BASICOS (NOMBRE, APELLIDOS Y DNI)
	 * 
	 * @param nombre un String con los datos del nombre del alumno
	 * @param apellido1 un String con el primer apellido del alumno
	 * @param apellido2 un String con el segundo apellido del alumno
	 * @param dni un String con el DNI del alumno
	 */
	public Alumno(String nombre, String apellido1, String apellido2, String dni) {
		super(nombre, apellido1, apellido2, dni);
	}
	
	//METODOS
	
	/**
	 * Metodo get que devuelve la edad del alumno
	 * @return edad un int con la edad del alumno
	 */
	public int getEdad() {
		return this.edad;
	}
	/**
	 * Metodo set que cambia la edad del alumno
	 * @param nuevaEdad un int con la nueva edad del alumno
	 */
	public void setEdad(int nuevaEdad) {
		this.edad = nuevaEdad;
	}
	
	/**
	 * Metodo toString que reune todos los datos del alumno
	 * @return un String con todos los datos del alumno
	 */
	public String toString() {
		return  "Nombre: "+super.getNombre()+"\n"+
				"Apellidos: "+super.getApellido1()+" "+super.getApellido2()+"\n"+
				"DNI: "+super.getDni()+"\n"+
				"Correo Electrónico: "+super.getCorreo()+"\n"+
				"Edad: "+this.getEdad()+"\n"+
				"Dirección: "+super.getDireccion();
	}
}