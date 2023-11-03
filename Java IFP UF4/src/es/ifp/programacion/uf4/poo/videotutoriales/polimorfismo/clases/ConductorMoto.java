package es.ifp.programacion.uf4.poo.videotutoriales.polimorfismo.clases;

import es.ifp.programacion.uf4.poo.ejemplos.ejercicio2.herencia.clases.Conductor;

public class ConductorMoto extends Conductor {

	//ATRIBUTOS
	
	private String licenciaMoto;
	
	//CONSTRUCTORES
	
	public ConductorMoto(String nombre, String apellidos, int edad, String correo, String numCarnetConducir, String licenciaMoto) {
		super(nombre, apellidos, edad, correo, numCarnetConducir);
		this.licenciaMoto = licenciaMoto;
	}
	
	//METODOS
	
	public String getCarnet() {
		return licenciaMoto;
	}
	
}
