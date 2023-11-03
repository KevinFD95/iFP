package es.ifp.programacion.uf1.condicional;

/**
 * Ejercicio de condicionales dentro de otra condicional
 */

import java.util.Scanner; //Importar Scanner de java para la introduccion de datos

public class esMayorMenorOIgual 
{

	public static void main(String[] args) 
	{
		//Bloque de declaracion de variables
		int num1;
		int num2;
		//Declaracion del Scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Bloque de Introduccion de datos
		System.out.println("Introduzca el primer numero: ");
		num1 = Integer.parseInt(sc.nextLine()); 				//Convertir un String en Integer (INT)
		
		System.out.println("Introduzca el segundo numero: ");
		num2 = Integer.parseInt(sc.nextLine()); 				//Convertir un String en Integer (INT)
		
		
		//Bloque de transformacion
		if (num1 < num2)
		{
			//Salida de datos
			System.out.println("El primer numero es MENOR al segundo numero");
		}
		else
		{
			if (num1 == num2) //Si dentro de una llave {} hay solamente una linea, se pueden eliminar las llaves
			{
				//Salida de datos
				System.out.println("El primer numero es IGUAL al segundo numero");
			}
			else
			{
				//Salida de datos
				System.out.println("El primer numero es MAYOR al segundo numero");
			}
		}
		
		sc.close();
		
	}

}
