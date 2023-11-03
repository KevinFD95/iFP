package es.ifp.programacion.uf4.poo.ejemplos.ejercicio2.herencia.clases;

/**
 * Clase que refleja una direccion fisica compuesta de calle, numero, poblacion y codigo postal
 * Definimos un constructor y los metodos get/set correspondientes
 */

public class Direccion {

	//ATRIBUTOS
	
	private String calle;
	private String num;
	private String poblacion;
	private String codigoPostal;
	
	//CONSTRUCTORES
	
	/**
	 * Constructor con todos los parametros
	 * @param calle
	 * @param num
	 * @param poblacion
	 * @param codigoPostal
	 */
	public Direccion(String calle, String num, String poblacion, String codigoPostal) {
		this.calle = calle;
		this.num = num;
		this.poblacion = poblacion;
		this.codigoPostal = codigoPostal;
	}
	
	//METODOS

	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}

	/**
	 * @return the poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	/**
	 * @return the codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
}
