package es.ifp.programacion.uf1.condicional;

/**
 * Ejercicio de ejemplo del uso de Mientras de PSeINT, while en Java
 * El ejemplo es un contador que escribe todos los numeros
 * desde el 0 hasta el numero aportado por el usuario
 */

import java.util.Scanner;

public class ejercicioWhile 
{

	public static void main(String[] args) 
	{
		//Bloque de declaracion e inicializacion de variables
		
		int num;
		int contador=0;
		Scanner sc = new Scanner(System.in);
		
		
		//Bloque de Introduccion de datos
		
		System.out.println("Introduzca el valor deseado:");
		num = Integer.parseInt(sc.nextLine());
		
		
		//Bloque de transformacion y salida de datos
		
		while (contador <= num) 
		{
			System.out.println(contador);
			contador++; //Es lo mismo que "contador = contador+1"
		}
		
		System.out.println("Fin del bucle.");
		sc.close();
	}

}