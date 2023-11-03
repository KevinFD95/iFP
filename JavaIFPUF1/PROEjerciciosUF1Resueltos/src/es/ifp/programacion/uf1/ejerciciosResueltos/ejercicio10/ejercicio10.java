package es.ifp.programacion.uf1.ejerciciosResueltos.ejercicio10;

import java.util.Scanner;

/**
 * Crea un programa en Java dados un conjunto de números introducidos por el usuario encuentre el número mayor de todos ellos.
 * El usuario introducirá previamente la cantidad de números de la secuencia.
 * El programa mostrará finalmente el mayor número de los introducidos.
 */
public class ejercicio10 {

	public static void main(String[] args) {
		
		/**
		 * Bloque de declaración de variables
		 */
		
		int totalNum=0;
		int num;
		int masAlto;
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Bloque de introducción de datos
		 */
		
		System.out.println("Introduzca la cantidad de números: ");
		totalNum = Integer.parseInt(sc.nextLine());
		
		/**
		 * Transformación de datos
		 */
		
		System.out.println("Introduzca el primer número:"); 			//Pedimos el primer número de la secuencia
		masAlto = Integer.parseInt(sc.nextLine()); 					//Este número será el más alto en un principio
		
		for (int contador=2;contador<=totalNum;contador++) { 		//Empezamos la secuencia a partir del segundo número hasta que el contador llegue al total
			
			System.out.println("Introduzca el número "+contador); 	//Nos pedirá los números en orden
			num = Integer.parseInt(sc.nextLine()); 					//La variable 'num' almacenará cada número introducido
			
			if (num>masAlto) {
				masAlto = num;										//Nos pondrá como número más alto el mayor almacenado
			}
		}
		
		/*
		 * Salida de datos
		 */
		
		System.out.println("El número más alto es: "+masAlto);
		sc.close();
		
	}

}
