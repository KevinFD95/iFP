package es.ifp.programacion.uf4.poo.ejemplos.ejercicio2.herencia;

import es.ifp.programacion.uf4.poo.conferencias.confe1.Persona;
import es.ifp.programacion.uf4.poo.ejemplos.ejercicio2.herencia.clases.Conductor;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Persona kevin = new Persona("Kevin", "Fuentes Duran", 28, "emkf_95@hotmail.com");
		
		System.out.println(kevin.toString());
	}
}