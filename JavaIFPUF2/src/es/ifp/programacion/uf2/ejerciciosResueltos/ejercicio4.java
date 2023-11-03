package es.ifp.programacion.uf2.ejerciciosResueltos;

import java.util.Scanner;

/**
 * Crea un programa en Java en el que modularices lo máximo la resolución de los diferentes problemas que se plantean:
 *
 * El programa mostrará el siguiente menú:
 * 1.- Mayúsculas
 * 2.- Longitud de una cadena
 * 3.- Número aleatorio
 * 4.- Salir
 * 
 * Comportamiento del programa:
 * El programa mostrará inicialmente este menú.
 * Si el usuario selecciona la opción 1, se pedirá al usuario una cadena. El programa retornará el número de caracteres de dicha cadena
 * Si el usuario selecciona la opción 2, se imprimirá la longitud de una cadena que el usuario introducirá por teclado.
 * La opción 3, mostrará un número aleatorio entre 0.0 y 1.0.
 * Si pulsa la opción 4, el programa finaliza.
 * El menú deberá mostrarse siempre y cuando no se haya pulsado la opción 4.
 * 
 * No se permitirá utilizar System.out.println en la implementación de los métodos de las operaciones arriba indicadas.
 */

public class ejercicio4 {

	public static void main(String[] args) {
		
		//Declaración de variables
		
		String opcion;
		Scanner sc = new Scanner(System.in);
		String text;
		int longitud;
		double random;
		
		//Selección del menú
		
		menuPrograma();
		
		//Introducción, transformación y salida de datos
		
		do {
			System.out.println("Introduzca la opción deseada:");
			opcion = sc.nextLine();
			
			switch (opcion) {
			case "1":
				System.out.println("Mayúsculas");
				System.out.println("Introduzca el texto a transformar:");
				/*
				 * Modificamos la variable String text, decimos que text es igual
				 * nuevamente a la operacion de textoMayus de text introducido anteriormente
				 * 
				 * Podría ser para diferenciarlo introduciendo una variable nueva text2 y el código se entendería mejor así:
				 * 
				 * text = sc.nextLine();
				 * String text2;
				 * text2 = textoMayus(text);
				 * System.out.println(text2);
				 */
				text = sc.nextLine(); //Introducimos un texto en la variable String text
				text = textoMayus(text); 
				System.out.println("Transformación: "+text); //text es igual al último introducido, el modificado y no el introducido por el usuario.
			break;
			case "2":
				System.out.println("Longitud de texto");
				System.out.println("Introduzca el texto a medir:");
				text = sc.nextLine();
				longitud = longTexto(text); //Dentro de los () de longTexto se debe introducir la variable que queremos que se procese en la función.
				System.out.println("Longitud: "+longitud);
			break;
			case "3":
				System.out.println("Número aleatorio");
				random = numRandom();
				System.out.println(random);
			break;
			case "4":
				System.out.println("Salir");
				System.out.println("======================================");
				System.out.println("===========Fin del programa===========");
				System.out.println("======================================");
			break;
			default:
				System.out.println("Opción incorrecta");
			break;
			}
		} while (!opcion.equals("4"));
		
		sc.close();
		
	}
	
	//Funciones
	
	public static void menuPrograma() {
		System.out.println("=====================================");
		System.out.println("==========Menú del programa==========");
		System.out.println("=====================================");
		System.out.println("1.- Mayúsculas");
		System.out.println("2.- Longitud de cadena");
		System.out.println("3.- Número aleatorio");
		System.out.println("4.- Salir");
		System.out.println("=====================================");
	}
	
	public static String textoMayus(String text) {
		return text.toUpperCase();
	}
	
	public static int longTexto(String textoAMedir) {
		int longitud = textoAMedir.length();
		return longitud;
	}
	
	public static double numRandom() {
		return Math.random();
	}
}
