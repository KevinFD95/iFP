package es.ifp.programacion.uf1.ejerciciosResueltos.ejercicio4;

import java.util.Scanner;

/**
 * Crea un programa en Java que reciba por parte del usuario (a través de teclado) cinco palabras y genere una salida en consola con los siguientes resultados:
 * Concatenación, en el mismo orden de entrada, de las cinco palabras separadas por un espacio en blanco.
 * Concatenación, en orden inverso a su entrada, de las cinco palabras separadas por el caracter '-'.
 */
public class ejercicio4 {

	public static void main(String[] args) {
		
		/*
		 * Bloque de declaración de variables
		 */
		
		String word1;
		String word2;
		String word3;
		String word4;
		String word5;
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Bloque de introducción de datos
		 */
		
		System.out.println("==============================");
		System.out.println("PROGRAMA DE CREACIÓN DE FRASES");
		System.out.println("==============================");
		System.out.println(" ");
		
		System.out.println("Introduzca la primera palabra:");
		word1 = sc.nextLine();
		System.out.println("Introduzca la segunda palabra:");
		word2 = sc.nextLine();
		System.out.println("Introduzca la tercera palabra:");
		word3 = sc.nextLine();
		System.out.println("Introduzca la cuarta palabra:");
		word4 = sc.nextLine();
		System.out.println("Introduzca la quinta palabra:");
		word5 = sc.nextLine();
		
		/*
		 * Bloque de transformación de datos
		 */
		
		String frase;
		frase = word1.concat(" "+word2+" "+word3+" "+word4+" "+word5);
		
		String frase2;
		frase2 = word5.concat("-"+word4+"-"+word3+"-"+word2+"-"+word1);
		
		/**
		 * Bloque de salida de datos
		 */
		
		System.out.println(" ");
		System.out.println("=======================================");
		System.out.println("La frase es: "+frase);
		System.out.println("=======================================");
		
		System.out.println(" ");
		System.out.println("=======================================");
		System.out.println("La frase a la inversa es: "+frase2);
		
		sc.close();
	}

}
