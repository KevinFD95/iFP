package es.ifp.programacion.uf1.ejerciciosResueltos.ejercicio6;

import java.util.Scanner;

/**
 * Crea un programa en Java en el que se pide al usuario una cadena y un número.
 * Si el valor introducido por el usuario es 0, o el caracter 's', o el caracter 'S' y además el número es negativo se mostrará el mensaje "Condiciones correctas".
 * En caso contrario se mostrará un mensaje indicando la finalización del programa como sigue: "Finalización del programa".
 */

public class ejercicio6 {

	public static void main(String[] args) {

		/**
		 * Bloque de declaración de variables
		 */
		
		String cadena;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Bloque de introducción de datos
		 */
		
		System.out.println("Introduzca el valor correspondiente:");
		cadena = sc.nextLine();
		
		System.out.println("Introduzca un número:");
		num = Integer.parseInt(sc.nextLine());
		
		/**
		 * Bloque de transformación y salida de datos
		 */
		
		if ((cadena.equals("0") || cadena.equals("s") || cadena.equals("S")) && num<0) {
			System.out.println("Condiciones correctas");
		}
		else {
			System.out.println("Finalización del programa");
		}
		sc.close();
	}

}
