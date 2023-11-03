package es.ifp.programacion.uf4.poo.videotutoriales.polimorfismo;

import es.ifp.programacion.uf4.poo.ejemplos.ejercicio2.herencia.clases.Conductor;
import es.ifp.programacion.uf4.poo.ejemplos.ejercicio2.herencia.clases.ConductorCamion;
import es.ifp.programacion.uf4.poo.videotutoriales.polimorfismo.clases.ConductorMoto;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		/**
		 * Se definen Objetos Conductor con el constructor de sus clases hijas.
		 * Cada objeto Conductor tendra las caracteristicas de conductor y de la clase hija que construimos.
		 * 
		 * Asi, el metodo getCarnet() es diferente para cada objeto ya que cada uno tiene una licencia (moto o camion) diferente
		 * y esta definido en las clases Conductor, ConductorMoto y ConductorCamion
		 */
		Conductor conductorKevin = new ConductorCamion("Kevin", "Fuentes", 28, "emkf_95@hotmail.com", "77794709-S", "CAM1234");
		Conductor conductorMaria = new ConductorMoto("Maria", "Duran", 57, "meloso66@gmail.com", "77795710-S", "MOT1234");
		
		System.out.println("Carnet Kevin: "+conductorKevin.getCarnet());
		System.out.println("Carnet Maria: "+conductorMaria.getCarnet());
	}

}
