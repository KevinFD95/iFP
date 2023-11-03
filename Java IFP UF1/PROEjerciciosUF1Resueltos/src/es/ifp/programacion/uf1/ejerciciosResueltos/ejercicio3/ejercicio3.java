package es.ifp.programacion.uf1.ejerciciosResueltos.ejercicio3;

import java.util.Scanner;

/**
 * Enunciado

 * Crea un programa en Java que reciba cuatro datos numéricos introducidos por el usuario a través del teclado
 * Dos de estos datos serán valores enteros y los otros dos, valores reales.

 * El programa, además de realizar la declaración adecuada de variables y su asignación correspondiente, realizará los siguientes cálculos:

 * 1.- La suma de los cuatro datos introducidos.
 * 2.- La multiplicación de los valores introducidos.
 * 3.- La resta de los datos introducidos siguiendo su orden de entrada en el programa.
 * 4.- Aumenta en una unidad todos los datos introducidos

 */
public class ejercicio3 {

	public static void main(String[] args) {
		
		/**
		 * Bloque de declaración de variables
		 */
		int dato1;
		int dato2;
		
		float dato3;
		float dato4;
		
		Scanner sc = new Scanner(System.in);
		
		float suma;
		float multi;
		float resta;
		
		/**
		 * Bloque de introducción de datos
		 */
		
		System.out.println("Introduzca el primer valor entero:");
		dato1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca el segundo valor entero:");
		dato2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca el tercer valor real:");
		dato3 = Float.parseFloat(sc.nextLine());
		
		System.out.println("Introduzca el cuarto valor real:");
		dato4 = Float.parseFloat(sc.nextLine());
		
		/**
		 * Bloque de transformación de datos
		 */
		
		suma = dato1 + dato2 + dato3 + dato4;
		multi = dato1 * dato2 * dato3 * dato4;
		resta = dato1 - dato2 - dato3 - dato4;
		
		dato1++;
		dato2++;
		dato3++;
		dato4++;
		
		/**
		 * Bloque de salida de datos
		 */
		
		System.out.println(" ");
		System.out.println("=============================");
		System.out.println("RESULTADOS DE LAS OPERACIONES");
		System.out.println("=============================");
		System.out.println(" ");
		
		System.out.println("1. El resultado a la suma de los valores introducidos es: "+suma);
		System.out.println("2. El resultado a la multiplicación de los valores introducidos es: "+multi);
		System.out.println("3. El resultado a la resta de los valores es: "+resta);
		System.out.println("4. El resultado al aumento de una unidad de los valores introducidos es: "+dato1+", "+dato2+", "+dato3+", "+dato4);
		
		System.out.println(" ");
		System.out.println("================");
		System.out.println("FIN DEL PROGRAMA");
		System.out.println("================");
		sc.close();
		
	}

}
