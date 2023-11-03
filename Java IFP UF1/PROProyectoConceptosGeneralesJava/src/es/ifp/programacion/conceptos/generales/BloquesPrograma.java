package es.ifp.programacion.conceptos.generales;

import java.util.Scanner;

public class BloquesPrograma 
{
	public static void main(String[] args) 
	{
		
		//Tipos de variables
		/**
		 * String (cadena)
		 * int (numero entero)
		 * long
		 * double (decimal)
		 * boolean (true/false)
		 * byte
		 * char
		 * float
		 * short
		 */

		//Bloque de declaraciones
		String nombre;
		String apellidos;
		String nombreCompleto;
		Scanner sc = new Scanner(System.in);
		
		int numero = 10;
		
		long edad = 80L;
		char letra = 'a';
		String nombreLiteral = "Juan";
		
		//Por costumbre, las variables se escriben en minuscula y las constantes en MAYUSCULA
		//Ejemplo: PI se escribe en MAYUSCULA para explicar que es una constante
		//'final' delante de una variable hace se convierta en constante
		final double PI = 3.141592; 
		
		/**
		 * Bloque de instrucciones
		 */
		
		//Entrada
		System.out.println("Introduzca el nombre y pulse intro:");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca apellidos y pulse intro:");
		apellidos = sc.nextLine();
		
		//Transformacion
		nombreCompleto = nombre+" "+apellidos;
		
		//Salida
		System.out.println("El nombre y los apellidos introducidos son: "+nombreCompleto);
		sc.close();
		
	}

}