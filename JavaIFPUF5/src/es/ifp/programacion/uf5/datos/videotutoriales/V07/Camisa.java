package es.ifp.programacion.uf5.datos.videotutoriales.V07;

/**
 * Clases y metodos genericos: Clase Camisa
 */

public class Camisa {

	//ATRIBUTOS
	
	private String color;
	
	//CONSTRUCTORES
	
	Camisa() {
		this.color = "Transparente";
	}
	
	Camisa(String color) {
		this.color = color;
	}
	
	//METODOS
	
	public String getColor() {
		return this.color;
	}
	
}
