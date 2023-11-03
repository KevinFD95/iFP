package es.ifp.programacion.uf5.datos.videotutoriales.V07;

/**
 * Clases y metodo genericos: Programa Principal
 */

import java.util.ArrayList;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//OBJETOS
		//Creamos ArrayList de objetos con las clases que hemos creado (Pantalon y Camisa)
		ArrayList<Camisa> aCamisas;
		ArrayList<Pantalon> aPantalones;
		
		//Creamos nuestro objeto generico sustituyendo el parametro <T> del generico por el objeto
		//que queremos contener.
		Maleta<Camisa> maletaDeCamisas = new Maleta<Camisa>();
		Maleta<Pantalon> maletaDePantalones = new Maleta<Pantalon>();
		
		//Creamos los objetos de nuestras clases "normales"
		Camisa cBlanca = new Camisa("Blanco");
		Pantalon pNegro = new Pantalon("Negro");
		
		//Añadimos elementos a nuestros objetos Maleta
		maletaDeCamisas.add(cBlanca);
		maletaDePantalones.add(pNegro);
		
		//Miramos los objetos que contienen los Array
		aCamisas = maletaDeCamisas.getProducts();
		System.out.println(aCamisas.size());
		aPantalones = maletaDePantalones.getProducts();
		System.out.println(aPantalones.size());
	}
}