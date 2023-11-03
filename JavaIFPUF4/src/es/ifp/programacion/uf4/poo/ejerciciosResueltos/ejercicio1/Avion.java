package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio1;

import java.util.Date;

/**
 * CLASE DEL EJERCICIO RESUELTO 1: AVION
 * 
 * Esta clase contiene diferentes atributos que serán especificados en el programa en el que se
 * cree un objeto 'Avion', un constructor con todos esos datos y los métodos get y set de cada atributo,
 * a parte de un método toString para reunir la información de todos.
 */

public class Avion {

	//ATRIBUTOS
	
	private String codAvion;
	private int asientos;
	private float autonomia;
	private Date revision;
	private String mecanico;
	
	//CONSTRUCTORES
	
	public Avion(String codAvion, int asientos, float autonomia, Date revision, String mecanico) {
		this.codAvion = codAvion;
		this.asientos = asientos;
		this.autonomia = autonomia;
		this.revision = revision;
		this.mecanico = mecanico;
	}
	
	//METODOS
	
	/**
	 * Metodo get que devuelve el codigo del avion
	 * @return un String con el codigo del avion
	 */
	public String getCodAvion() {
		return this.codAvion;
	}
	/**
	 * Metodo set que cambia el codigo del avion
	 * @param nuevoCodAvion String con el nuevo codigo del avion
	 */
	public void setCodAvion(String nuevoCodAvion) {
		this.codAvion = nuevoCodAvion;
	}

	/**
	 * Metodo get que devuelve el numero de asientos
	 * @return asientos un int con el numero de asientos
	 */
	public int getAsientos() {
		return this.asientos;
	}
	/**
	 * Metodo set que cambia el numero de asientos
	 * @param nuevosAsientos un int con el numero nuevo de asientos
	 */
	public void setAsientos(int nuevosAsientos) {
		this.asientos = nuevosAsientos;
	}

	/**
	 * Metodo get que devuelve la autonomia del avion
	 * @return autonomia un float con la autonomia del avion
	 */
	public float getAutonomia() {
		return this.autonomia;
	}
	/**
	 * Metodo set que cambia la autonomia del avion
	 * @param autonomia un float con la nueva autonomia del avion
	 */
	public void setAutonomia(float nuevaAutonomia) {
		this.autonomia = nuevaAutonomia;
	}

	/**
	 * Metodo get que devuelve la fecha de la revision del avion
	 * @return un Date con la fecha de la revision del avion
	 */
	public Date getRevision() {
		return this.revision;
	}
	/**
	 * Metodo set que cambia la fecha de revision del avion
	 * @param nuevaRevision un Date con la nueva fecha de revision del avion
	 */
	public void setRevision(Date nuevaRevision) {
		this.revision = nuevaRevision;
	}

	/**
	 * Metodo get que devuelve el nombre del mecanico del avion
	 * @return mecanico un String con el nombre del mecanico del avion
	 */
	public String getMecanico() {
		return this.mecanico;
	}
	/**
	 * Metodo set que cambia el mecanico del avion
	 * @param nuevoMecanico un String con el nuevo mecanico del avion
	 */
	public void setMecanico(String nuevoMecanico) {
		this.mecanico = nuevoMecanico;
	}
	
	/**
	 * Sobreescribimos el metodo toString para que retorne todos los datos
	 * del avion en un String
	 * @Override es una anotacion de Java que indica que anule el metodo de la
	 * superclase
	 * @return un String con todos los atributos de la clase Avion
	 */
	public String toString() {
		return  "Código de avión: "+this.getCodAvion()+"\n"+
				"Número de asientos: "+this.getAsientos()+"\n"+
				"Autonomía: "+this.getAsientos()+"\n"+
				"Última revisión: "+this.getRevision()+"\n"+
				"Mecánico de la última revisión: "+this.getMecanico()+"\n";
	}
}
