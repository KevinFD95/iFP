package es.ifp.programacion.uf1.condicional;

/**
 * Ejemplo del uso de Switch en Java
 * Segun en PSeINT = Switch en Java
 * Si el usuario introduce un numero 1, 2 o 3 se muestra un mensaje personalizado
 * Si no es ninguno de estos 3 numeros, el mensaje sera por defecto
 */

import java.util.Scanner;

public class programaSwitch 
{

	public static void main(String[] args) 
	{
		//Bloque de declaracion e inicializacion de variables
		int num=0;
		Scanner sc = new Scanner(System.in);
		
		
		//Introduccion de datos
		System.out.println("Introduzca un numero: ");
		num = Integer.parseInt(sc.nextLine());
		
		
		//Transformacion y salida de datos
		switch(num)
		{
			case 1:
				System.out.println("El numero es 1");
				break;
			case 2:
				System.out.println("El numero es 2");
				break;
			case 3:
				System.out.println("El numero es 3");
				break;
			default:
				System.out.println("El numero no es ni 1, ni 2 ni 3");
		}
		
		System.out.println("Continua la ejecucion del programa");
		sc.close();
		
	}

}
