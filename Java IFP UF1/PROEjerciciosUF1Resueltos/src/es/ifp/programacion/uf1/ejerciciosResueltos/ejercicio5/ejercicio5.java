package es.ifp.programacion.uf1.ejerciciosResueltos.ejercicio5;

import java.util.Scanner;

/**
 * Crea un programa en Java en el que se pide al usuario una cadena.
 * Si el valor introducido por el usuario es 0, o el caracter 's', o el caracter 'S' se mostrará el siguiente mensaje indicando también el dato introducido. Por ejemplo: "El valor introducido es: s", si es una s. O el correspondiente.
 * En caso contrario se mostrará un mensaje indicando la finalización del programa como sigue: "Finalización del programa".
 * 
 * Dos opciones diferentes: un anidamiento if-else y un if-else con operación lógica OR (||)
 * 
 * La opción 1 está deshabilitada
 */

public class ejercicio5 {

	public static void main(String[] args) {
		
		/**
		 * Bloque de declaración de variables
		 */
		
		String cadena;
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Bloque de introducción de datos
		 */
		
		System.out.println("Introduzca el valor correspondiente: ");
		cadena = sc.nextLine();
		
		/**
		 * Bloque de transformación y salida de datos
		 */
		
		/**
		 * OPCIÓN 1
		 * Anidamiento de if-else
		 */
		
		/**if (cadena.equals("0")) {
			System.out.println("El valor introducido es: "+cadena);
		}
		else {
			if (cadena.equals("s")) {
				System.out.println("El valor introducido es: "+cadena);
			}
			else {
				if (cadena.equals("S")) {
					System.out.println("El valor introducido es: "+cadena);
				}
				else {
					System.out.println("Finalización del programa");
				}
			}
		}
		*/
		
		/*
		 * OPCIÓN 2
		 * Uso de operación lógica OR (||) para hacer toda la transformación en un mismo if-else
		 */
		
		if (cadena.equals("0") || cadena.equals("s") || cadena.equals("S")) {
			System.out.println("El valor introducido es: "+cadena);
		}
		else {
			System.out.println("Finalización del programa");
		}
		
		sc.close();
		
	}
}
