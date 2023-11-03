package es.ifp.programacion.uf5.datos.videotutoriales.V07;

/**
 * Clases y metodos genericos: Clase Pantalon
 */

public class Pantalon {

	//ATRIBUTOS
	
	private String color;
	
	//CONSTRUCTORES
	
	Pantalon() {
		this.color = "Rojo";
	}
	
	Pantalon(String color) {
		this.color = color;
	}

	//METODOS
	
	public String getColor() {
		return this.color;
	}
}
