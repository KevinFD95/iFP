package es.ifp.programacion.uf4.poo.conferencias.confe1;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Persona juan = new Persona("Juan", "Martinez", 24);
		Persona ana = new Persona("Ana", "Santana", 15);
		
		boolean esMayor = juan.esMayor();
		boolean esMayor2 = ana.esMayor();
		
		System.out.println("Juan es mayor de edad? "+esMayor);
		System.out.println("Ana es mayor? "+esMayor2);
		
		System.out.println(juan.getNombre());
		System.out.println(Persona.nacionalidad);
		System.out.println(juan.nacionalidad); //Es lo mismo que la linea anterior, con un static no hay que crear un objeto para llamarlo
	}

}
