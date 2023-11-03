package es.ifp.programacion.uf4.poo.ejemplos.ejercicio2.herencia.clases;

import es.ifp.programacion.uf4.poo.videotutoriales.interfaces.iConductorCamion;

public class ConductorCamion extends Conductor implements iConductorCamion {

	private String licenciaCamion;
	
	//CONSTRUCTORES
	
	public ConductorCamion(String nombre, String apellidos, int edad, String correo, String numCarnetConducir, String licenciaCamion) {
		super(nombre, apellidos, edad, correo, numCarnetConducir);
		this.licenciaCamion = licenciaCamion;
	}

	//METODOS
	
	public String getCarnet() {
		return licenciaCamion;
	}
}
