package es.ifp.programacion.uf1.pseudo;

/**
 * Clase que da dos numeros y los suma
 */

import java.util.Scanner;

public class ProgramaPrincipal 
{

	public static void main(String[] args) 
	{
		//Bloque de declaracion de variables
		
		int num1;
		int num2;
		int result;
		Scanner sc = new Scanner(System.in);
		
		
		//Entrada de datos
		
		System.out.println("Introduzca el primer numero: ");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca el segundo numero: ");
		num2 = Integer.parseInt(sc.nextLine());
		
		
		//Transformacion de datos
		
		result = num1 + num2;
		
		
		//Salida de datos
		
		System.out.println("El resultado es: "+result);
		sc.close();
		
	}

}