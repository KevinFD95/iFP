package es.ifp.programacion.uf1.ejerciciosResueltos.ejercicio8;

import java.util.Scanner;

/**
 * Crea un programa en Java que muestre una única vez el menú siguiente, pudiendo el usuario seleccionar el número de opción o la letra que se muestra entre paréntesis.
 * 1.- Entrar (E)
 * 2.- Ver (V)
 * 3.- Modificar (M)
 * 4.- Salir (S)
 * 
 * El programa imprimirá en pantalla la opción introducida.
 */

public class ejercicio8 {

	public static void main(String[] args) {
		
		/*
		 * Bloque de declaración de variables
		 */
		
		String valor;
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Bloque de introducción de datos
		 */
		
		System.out.println("Introduzca la opción con la que quiera proceder:");
		System.out.println(" ");
		System.out.println("Entrar (E)");
		System.out.println("Ver (V)");
		System.out.println("Modificar (M)");
		System.out.println("Salir (S)");
		System.out.println(" ");
		valor = sc.nextLine();
		
		/*
		 * Bloque de transformación de datos
		 * El programa busca referencias con los textos anteriores, si introducimos E saldrá la primera opción, 
		 * si introducimos M saldrá la tercera,etc.
		 */
		
		switch (valor){
			case "E": System.out.println("Entrar"); break;
			case "V": System.out.println("Ver"); break;
			case "M": System.out.println("Modificar"); break;
			case "S": System.out.println("Salir"); break;
			default: System.err.println("Opción incorrecta"); break;
		}
		
		sc.close();
		
	}

}
