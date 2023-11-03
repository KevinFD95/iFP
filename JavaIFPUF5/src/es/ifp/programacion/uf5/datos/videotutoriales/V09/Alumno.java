package es.ifp.programacion.uf5.datos.videotutoriales.V09;

public class Alumno {

	//ATRIBUTOS
	
	private String id;
	private String nombre;
	private String apellidos;
	private int edad;
	private String matricula;
	
	//CONSTRUCTOR
	
	public Alumno(String id, String nombre, String apellidos, int edad, String matricula) throws MensajeEdadException {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		if (edad<18) {
			throw new MensajeEdadException("Edad menor de 18");
		}
		this.edad = edad;
		this.matricula = matricula;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String nuevaId) {
		this.id = nuevaId;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) throws MensajeEdadException {
		if (edad<18) {
			throw new MensajeEdadException("Edad menor de 18");
		}
		this.edad = edad;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return  "Datos del alumno:\n"+
				"Nombre: "+this.getNombre()+"\n"+
				"Apellidos: "+this.getApellidos()+"\n"+
				"ID: "+this.getId()+"\n"+
				"Edad: "+this.getEdad()+"\n"+
				"Matricula: "+this.getMatricula();
	}
}
