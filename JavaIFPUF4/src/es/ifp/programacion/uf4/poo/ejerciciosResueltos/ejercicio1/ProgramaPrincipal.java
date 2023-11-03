package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio1;

import java.util.Date;

/**
 * EJERCICIO RESUELTO 1: REPARACION DE AVIONES
 * 
 * Este ejercicio consiste en un clasificador de aviones según los datos de cada uno de ellos y el programa principal
 * nos muestra los datos del objeto 'Avion' que creamos a partir de la clase 'Avion'.
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//DECLARACION DE OBJETOS
		
		Avion avion1 = new Avion("Airbus A350", 292, 700f, new Date(), "Kevin Fuentes");
		Avion avion2 = new Avion("Airbus A320", 250, 700f, new Date(), "Kevin Fuentes");
		
		//SALIDA DE DATOS
		
		System.out.print(avion1.toString());
		System.out.println("==================================================");
		System.out.print(avion2.toString());
	}

}
