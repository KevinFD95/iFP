package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio2;

/**
 * CLASE EJERCICIOS RESUELTOS 2 Y 3: DIRECCION
 * 
 * Esta clase es constructora de los datos de la direccion que por composicion estan incluidos
 * en la clase Persona.
 * 
 * Datos:
 * String calle
 * int num
 * char puerta
 * String localidad
 * String municipio
 */

public class Direccion {

	//ATRIBUTOS
	
	private String calle;
	private int num;
	private char puerta;
	private String localidad;
	private String municipio;
	
	//CONSTRUCTORES
	
	/**
	 * CONSTRUCTOR CON TODOS LOS DATOS
	 * 
	 * @param calle un String con la calle
	 * @param num un int con el numero de la calle
	 * @param puerta un char con la puerta
	 * @param localidad un String con la localidad
	 * @param municipio un String con el municipio
	 */
	public Direccion(String calle, int num, char puerta, String localidad, String municipio) {
		this.calle = calle;
		this.num = num;
		this.puerta = puerta;
		this.localidad = localidad;
		this.municipio = municipio;
	}
	
	//METODOS
	
	/**
	 * Metodo get que devuelve la calle
	 * @return un String con el nombre de la calle
	 */
	public String getCalle() {
		return this.calle;
	}
	/**
	 * Metodo set que cambia la calle
	 * @param nuevaCalle con el nombre de la nueva calle
	 */
	public void setCalle(String nuevaCalle) {
		this.calle = nuevaCalle;
	}
	
	/**
	 * Metodo get que devuelve el numero de la calle
	 * @return num un int con el numero de la calle
	 */
	public int getNum() {
		return this.num;
	}
	/**
	 * Metodo set que cambia el numero de la calle
	 * @param nuevoNum un int con el nuevo numero de la calle
	 */
	public void setNum(int nuevoNum) {
		this.num = nuevoNum;
	}
	
	/**
	 * Metodo get que devuelve la puerta
	 * @return puerta un char con el caracter de la puerta
	 */
	public char getPuerta() {
		return this.puerta;
	}
	/**
	 * Metodo set que cambia la puerta
	 * @param nuevaPuerta un char con el nuevo caracter de la puerta
	 */
	public void setPuerta(char nuevaPuerta) {
		this.puerta = nuevaPuerta;
	}
	
	/**
	 * Metodo get que devuelve la localidad
	 * @return localidad un String con la localidad
	 */
	public String getLocalidad() {
		return this.localidad;
	}
	/**
	 * Metodo set que cambia la localidad
	 * @param nuevaLocalidad un String con la nueva localidad
	 */
	public void setLocalidad(String nuevaLocalidad) {
		this.localidad = nuevaLocalidad;
	}
	
	/**
	 * Metodo get que devuelve el municipio
	 * @return municipio un String con el municipio
	 */
	public String getMunicipio() {
		return this.municipio;
	}
	/**
	 * Metodo set que cambia el municipio
	 * @param nuevoMunicipio un String con el nuevo municipio
	 */
	public void setMunicipio(String nuevoMunicipio) {
		this.municipio = nuevoMunicipio;
	}
	
	/**
	 * Metodo toString que reune los datos de la direccion en un solo metodo
	 * @return un String con los datos de la direccion
	 */
	public String toString() {
		return "Calle: "+this.getCalle()+", número: "+this.getNum()+", puerta: "+this.getPuerta()+", localidad: "+this.getLocalidad()+", municipio: "+this.getMunicipio();
	}
}