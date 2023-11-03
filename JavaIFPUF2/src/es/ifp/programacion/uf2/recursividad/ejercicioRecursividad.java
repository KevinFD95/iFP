package es.ifp.programacion.uf2.recursividad;

import java.util.Scanner;

public class ejercicioRecursividad {

	public static void main(String[] args) {
		
		//Bloque de declaración de variables
		
		Scanner sc = new Scanner(System.in);
		int num;
		int result;
		
		//Bloque Introducción de datos
		
		do {
			System.out.println("Introduzca el valor del cual quiere calcular el factorial");
			num = Integer.parseInt(sc.nextLine());
		
			//Transformación de datos
		
			result = factorial(num);
		
			//Salida de datos
		
			System.out.println("El resultado del factorial del número "+num+" es "+result);
		} while (num!=0);
		
		System.out.println("Fin del programa");
		sc.close();
		
	}
	
	public static int factorial(int n) {
		if (n<=1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

}
