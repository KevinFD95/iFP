package es.ifp.programacion.uf1.condicional;

import java.util.Scanner;

/**
 * Esto es un ejercicio de ejemplo de do-while de Java
 * Pediremos al usuario la entrada de un número y entrará en un bucle
 * hasta que sea acertado 
 */

public class ejercicioDoWhile {

	public static void main(String[] args) {
		
		//Bloque de declaración de variables
		
		int num=0;
		Scanner sc = new Scanner(System.in);
		
		//Bloque de transformación de datos
		
		do {
			System.out.println("Introduzca un número: ");
			num = Integer.parseInt(sc.nextLine());
			
			/**
			 * Si ponemos igual '==' como en PSeINT el bucle se repite cuando el número sea 100, 
			 * pero cierra el bucle cuando el número es diferente.
			 * Si ponemos distinto '!=' hará que el bucle continue hasta que sea el número deseado.
			 * Funciona al revés que PSeINT, para que solo cierre el número deseado tiene que ser distinto a
			 * 
			 * Haz (do) las líneas de código mientras (while) num sea distinto (!=) a 100
			 */
			
		} while (num!=100); 
		
		System.out.println("Número correcto, sale del bucle");
		sc.close();
	}

}
