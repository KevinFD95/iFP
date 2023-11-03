package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio2;

/**
 * CLASE EJERCICIOS RESUELTOS 2 Y 3: PERSONA
 * 
 * Esta clase es padre de dos clases distintas (Profesor y Alumno) que heredan los datos en comun
 * codificados a continuacion. Tambien heredaran los datos de Direccion, una clase que se compone
 * con esta, la clase Persona.
 * 
 * Datos:
 * String nombre
 * String apellido1
 * String apellido2
 * String dni
 * String correo
 * Direccion direccion
 * int numTlf
 */

public class Persona {

		//ATRIBUTOS
		
		private String nombre;
		private String apellido1;
		private String apellido2;
		private String dni;
		private String correo;
		protected Direccion direccion;
		private int numTlf;
		
		//CONSTRUCTORES
		
		/**
		 * CONSTRUCTOR CON TODOS LOS DATOS
		 * 
		 * @param nombre un String con los datos del nombre de la persona
		 * @param apellido1 un String con el primer apellido de la persona
		 * @param apellido2 un String con el segundo apellido de la persona
		 * @param dni un String con el DNI de la persona
		 * @param correo un String con el correo electronico de la persona
		 * @param numTlf un int con el numero de telefono de la persona
		 * @param direccion un objeto de tipo Direccion con los datos de la direccion de la persona
		 */
		public Persona(String nombre, String apellido1, String apellido2, String dni, String correo, int numTlf, Direccion direccion) {
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.dni = dni;
			this.correo = correo;
			this.numTlf = numTlf;
			this.direccion = direccion;
		}
		
		/**
		 * CONSTRUCTOR CON TODOS LOS DATOS DESGLOSANDO LOS QUE ESTAN EN EL OBJETO DIRECCION
		 * 
		 * @param nombre un String con los datos del nombre de la persona
		 * @param apellido1 un String con el primer apellido de la persona
		 * @param apellido2 un String con el segundo apellido de la persona
		 * @param dni un String con el DNI de la persona
		 * @param correo un String con el correo electronico de la persona
		 * @param numTlf un int con el numero de telefono de la persona
		 * @param calle un String con el nombre de la calle de la persona
		 * @param num un int con el numero de la calle de la persona
		 * @param puerta un char con la puerta de la persona
		 * @param localidad un String con la localidad de la persona
		 * @param municipio un String con el municipio de la persona
		 */
		public Persona(String nombre, String apellido1, String apellido2, String dni, String correo, int numTlf, String calle, int num, char puerta, 
			   String localidad, String municipio) {
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.dni = dni;
			this.correo = correo;
			this.numTlf = numTlf;
			this.direccion = new Direccion(calle, num, puerta, localidad, municipio);
		}
		
		/**
		 * CONSTRUCTOR SIN EL NUMERO DE TELEFONO
		 * 
		 * @param nombre un String con los datos del nombre de la persona
		 * @param apellido1 un String con el primer apellido de la persona
		 * @param apellido2 un String con el segundo apellido de la persona
		 * @param dni un String con el DNI de la persona
		 * @param correo un String con el correo electronico de la persona
		 * @param direccion un objeto de tipo Direccion con los datos de la direccion de la persona
		 */
		public Persona(String nombre, String apellido1, String apellido2, String dni, String correo, Direccion direccion) {
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.dni = dni;
			this.correo = correo;
			this.direccion = direccion;
		}
		
		/**
		 * CONSTRUCTOR SIN NUMERO DE TELEFONO DESGLOSANDO LOS DATOS QUE ESTAN EN EL OBJETO DIRECCION
		 * 
		 * @param nombre un String con los datos del nombre de la persona
		 * @param apellido1 un String con el primer apellido de la persona
		 * @param apellido2 un String con el segundo apellido de la persona
		 * @param dni un String con el DNI de la persona
		 * @param correo un String con el correo electronico de la persona
		 * @param calle un String con el nombre de la calle de la persona
		 * @param num un int con el numero de la calle de la persona
		 * @param puerta un char con la puerta de la persona
		 * @param localidad un String con la localidad de la persona
		 * @param municipio un String con el municipio de la persona
		 */
		public Persona(String nombre, String apellido1, String apellido2, String dni, String correo, String calle, int num, char puerta, 
			   String localidad, String municipio) {
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.dni = dni;
			this.correo = correo;
			this.direccion = new Direccion(calle, num, puerta, localidad, municipio);
		}
		
		/**
		 * CONSTRUCTOR CON LOS DATOS BASICOS (NOMBRE, APELLIDOS Y DNI)
		 * 
		 * @param nombre un String con los datos del nombre de la persona
		 * @param apellido1 un String con el primer apellido de la persona
		 * @param apellido2 un String con el segundo apellido de la persona
		 * @param dni un String con el DNI de la persona
		 */
		public Persona(String nombre, String apellido1, String apellido2, String dni) {
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.dni = dni;
		}
		
		//MÉTODOS

		/**
		 * Método get que devuelve el nombre de la persona
		 * @return nombre un String con el nombre de la persona
		 */
		public String getNombre() {
			return this.nombre;
		}
		
		/**
		 * Método get que devuelve el primer apellido de la persona
		 * @return apellido1 un String con el primer apellido de la persona
		 */
		public String getApellido1() {
			return this.apellido1;
		}
		
		/**
		 * Método get que devuelve el segundo apellido de la persona
		 * @return un String con el segundo apellido de la persona
		 */
		public String getApellido2() {
			return this.apellido2;
		}

		/**
		 * Metodo get que devuelve el DNI de la persona
		 * @return dni un String con el DNI de la persona
		 */
		public String getDni() {
			return this.dni;
		}

		/**
		 * Metodo get que devuelve el correo electronico de la persona
		 * @return correo un String con el correo electronico de la persona
		 */
		public String getCorreo() {
			return this.correo;
		}
		/**
		 * Metodo set que cambia el correo electronico de la persona por uno nuevo
		 * @param nuevoCorreo un String con el nuevo correo electronico de la persona
		 */
		public void setCorreo(String nuevoCorreo) {
			this.correo = nuevoCorreo;
		}

		/**
		 * Metodo get con la direccion de la persona
		 * @return direccion un objeto de clase Direccion con la direccion de la persona
		 */
		public Direccion getDireccion() {
			return this.direccion;
		}
		/**
		 * Metodo set que cambia la direccion de la persona
		 * @param un objeto de clase Direccion con la nueva direccion de la persona
		 */
		public void setDireccion(Direccion nuevaDireccion) {
			this.direccion = nuevaDireccion;
		}

		/**
		 * Metodo get que devuelve el numero de telefono de la persona
		 * @return numTlf un int con el numero de telefono de la persona
		 */
		public int getNumTlf() {
			return this.numTlf;
		}
		/**
		 * Metodo set que cambia el numero de telefono de la persona
		 * @param nuevoNumTlf un int con el nuevo numero de telefono de la persona
		 */
		public void setNumTlf(int nuevoNumTlf) {
			this.numTlf = nuevoNumTlf;
		}
		
		/**
		 * Metodo toString que devuelve todos los datos de la persona juntos
		 * @return un String con todos los datos de la persona reunidos en uno
		 */
		public String toString() {
			return  "Nombre: "+this.getNombre()+"\n"+
					"Apellidos: "+this.getApellido1()+" "+this.getApellido2()+"\n"+
					"DNI: "+this.getDni()+"\n"+
					"Correo Electrónico: "+this.getCorreo()+"\n"+
					"Dirección: "+this.getDireccion()+"\n"+
					"Teléfono: "+this.getNumTlf();
		}
}