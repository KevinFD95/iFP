package es.ifp.programacion.uf1.ejerciciosResueltos.ejercicio7;

import java.util.Scanner;

/**
 * Crea un programa en Java que lea números introducidos por el usuario desde el teclado y calcule la suma de todos ellos.
 * El usuario introducirá primero la cantidad de números a sumar inicialmente y luego introducir el valor de cada número.
 * El programa mostrará finalmente en pantalla la suma de todos ellos.
 */


public class ejercicio7 {

	public static void main(String[] args) {
		
		/**
		 * Bloque de declaración de variables
		 */
		
		int cantidad;
		Scanner sc = new Scanner(System.in);
		int result=0;
		int num;
		
		/*
		 * Bloque de introducción y transformación de datos
		 * 
		 * Aquí se nos pide que introduzcamos la cantidad de números que queremos operar (*1)
		 * Entramos en un bucle 'for' donde iniciamos la variable de tipo entero 'contador' y aplicamos:
		 * contador es 1 inicialmente; el bucle se repetirá hasta que contador sea igual a la cantidad de números que queremos operar; repetiremos el bucle sumando 1 a contador (*2)
		 * Introducimos el valor en la posición que indica contador (primer número, segundo, tercero, etc. (*3)
		 * Se almacenan los valores en la variable de tipo entero 'num' y se suma al resultado (*4)
		 * El resultado se irá acumulando con los valores introducidos hasta finalizar (*5)
		 */
		
		System.out.println("Introduzca la cantidad de números a operar:");
		cantidad = Integer.parseInt(sc.nextLine()); //*1
		
		for (int contador=1;contador<=cantidad;contador++) { //*2
			System.out.println("Introduzca el número "+contador+":"); //*3
			num = Integer.parseInt(sc.nextLine()); //*4
			result = result + num; //*5
		}
		
		/*
		 * Bloque de salida de datos
		 */
		System.out.println("El resultado de la suma es: "+result);
		sc.close();
		
	}

}
