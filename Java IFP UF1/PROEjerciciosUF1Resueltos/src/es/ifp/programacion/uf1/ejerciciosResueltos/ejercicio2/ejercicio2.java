package es.ifp.programacion.uf1.ejerciciosResueltos.ejercicio2;

import java.util.Scanner;

/**
 * Ejercicio 2 Resuelto: comparación de 2 números introducidos por el usuario
 * Las respuestas del programa serán booleanas (verdadero/falso) contestando si los números son iguales, si num1>num2 o num1<num2
 * 
 * Se darán 3 respuestas en cada solución.
 */

public class ejercicio2 {

	public static void main(String[] args) {
		
		/**
		 * Bloque de declaración de variables
		 */
		
		String dato1;				//Cadena a introducir
		String dato2;				//Cadena a introducir
		
		boolean esMenor;			//Booleana
		boolean esMayor;			//Booleana
		boolean esIgual;			//Booleana
		
		int num1;					//Número entero
		int num2;					//Número entero
		
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Introducción de datos
		 */
		
		System.out.println("Introduzca el primer número:");
		dato1 = sc.nextLine();
		
		System.out.println("Introduzca el segundo número:");
		dato2 = sc.nextLine();
		
		/**
		 * Transformación de datos
		 * 
		 * Transformamos las cadenas (dato1/dato2) en las variables enteras (int) de num1 y num2 para poder compararlas
		 * en booleanas
		 */
		
		num1 = Integer.parseInt(dato1);
		num2 = Integer.parseInt(dato2);
		
		//Se comparan los datos enteros
		esMenor = (num1<num2);
		esMayor = (num1>num2);
		esIgual = (num1==num2);
		
		/**
		 * Salida de datos
		 * 
		 * Sacamos el resultado de las booleanas en texto
		 */
		
		System.out.println("El número "+num1+" es menor al número "+num2+"? "+esMenor);
		System.out.println("El número "+num1+" es igual al número "+num2+"? "+esIgual);
		System.out.println("El número "+num1+" es mayor al número "+num2+"? "+esMayor);
		sc.close();
		
	}
}
