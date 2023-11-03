package es.ifp.programacion.uf1.ejerciciosResueltos.ejercicio9;

import java.util.Scanner;

/**
 * Crea un programa en Java que realice la suma de números positivos.
 * El programa acabará cuando el usuario introduzca el cero o un número entero negativo.
 * Antes de finalizar mostrará la suma de los números enteros positivos.
 */

public class ejercicio9 {

	public static void main(String[] args) {
		
		/*
		 * Variables
		 */
		
		int num;
		int total=0;
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Entrada de datos
		 */
		
		System.out.println("Introduzca número a sumar:");
		num = Integer.parseInt(sc.nextLine());
		
		/*
		 * Transformación de datos
		 */
		
		while (num>0) {
			total = total+num;
			System.out.println("Introduzca número a sumar:");
			num = Integer.parseInt(sc.nextLine());
		}
		
		/**
		 * Salida de datos
		 */
		
		System.out.println("El total de la suma es: "+total);
		sc.close();
		
	}

}
