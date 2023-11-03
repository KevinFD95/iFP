package es.ifp.programacion.uf4.poo.ejemplos.ejercicio2.herencia.clases;

import es.ifp.programacion.uf4.poo.conferencias.confe1.Persona;

public abstract class Conductor extends Persona { //Hereda los atributos de Persona

	//ATRIBUTOS DE CLASE
	//Los atributos de la clase padre se heredan a la clase hija y no hay que definirlos de nuevo
	//nombre, apellido, edad y correoElectronico
	
	private String numCarnetConducir;
	
	//CONSTRUCTORES
	
	/**
	 * Constructor de la clase Constructor que llama al constructor de la clase padre Persona
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param correoElectronico
	 * @param numCarnetConducir
	 */
	public Conductor(String nombre, String apellidos, int edad, String correoElectronico, String numCarnetConducir) {
		
		//Constructor de atributos de la clase padre
		super(nombre, apellidos, edad, correoElectronico);
		
		//Constructor de atributo de clase
		this.numCarnetConducir = numCarnetConducir;
	}

	//METODOS
	
	/**
	 * Metodo que retorna el carnet de conducir
	 * @return the numCarnetConducir un String con el carnet de conducir de una persona
	 */
	public String getNumCarnetConducir() {
		return numCarnetConducir;
	}

	/**
	 * Metodo que modifica el carnet de una persona
	 * @param numCarnetConducir un String que se asigna a la persona
	 */
	public void setNumCarnetConducir(String numCarnetConducir) {
		this.numCarnetConducir = numCarnetConducir;
	}
	
	public abstract String getCarnet();
	
}
