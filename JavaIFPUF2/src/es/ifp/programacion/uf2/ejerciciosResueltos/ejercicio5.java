package es.ifp.programacion.uf2.ejerciciosResueltos;

import java.util.Scanner;

/**
 * Crea un programa en Java implementando funciones o procedimientos siguiendo los siguientes requisitos:
 *
 * 1.- Reverso
 * La función/procedimiento recibirá una cadena y retornará la cadena en orden inverso
 * 
 * 2.- Revés
 * La función/procedimiento recibirá dos cadenas y retornará una cadena concatenando ambas en orden inverso. Esto es, el segundo parámetro se mostrará al principio, separadas por un guión.
 * Por ejemplo: Se recibe: "hola" y "adios". Retornará "adios-hola"
 * 3.- Contar vocales
 * La función/procedimiento recibirá una cadena y retornará el número de vocales (a,e,i,o,u) que contiene la cadena.
 *
 * 4.- Repite
 * La función/procedimiento recibirá dos parámetros, un String y un entero. La función retornará la concatenación del primer parámetro tantas veces como se indique en el número entero.
 *
 * 5.- Es positivo
 * Dado un número entero pasado como parámetro, la función/procedimiento devolverá true si es positivo el número, false en caso contrario.
 * 
 * Comportamiento del programa:
 * Crea un programa principal que ejecute por orden las cuatro funciónes/procedimientos, pidiendo al usuario la información necesaria para ejecutarlo correctamente.
 * Define adecuadamente las funciones o procedimientos, nombres, parámetros y tipos de retorno.
 * 
 * No se permitirá utilizar System.out.println en la implementación de los métodos de las operaciones arriba indicadas.
 */

public class ejercicio5 {

	public static void main(String[] args) {
		
		/**
		 * Bloque de declaración de variables
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//Selector del menú
		String opcion;
		
		//Introducción de texto
		String text;
		String text2;
		int repetir;
		int num;
		
		//Almacenadores de resultados
		String reverso;
		String reves;
		int vocal;
		String repetido;
		boolean esPositivo;
		
		/**
		 * Inicio del programa
		 */
		
		funcTitulo();
		
		do {
			/**
			 * Bloque de introducción de datos
			 */
			
			funcMenu();
			System.out.println("Introduce una opción: ");
			opcion = sc.nextLine();
			
			/**
			 * Bloque de transformación y salida de datos
			 */
			
			switch (opcion) {
			case "1":
				System.out.println("Reverso");
				System.out.println("-------------------------");
				System.out.println("Introduzca el texto:");
				text = sc.nextLine();
				reverso = funcReverso(text);
				System.out.println("El reverso del texto es: "+reverso);
				System.out.println(" ");
				break;
			case "2":
				System.out.println("Reves");
				System.out.println("-------------------------");
				System.out.println("Introduzca la primera palabra:");
				text = sc.nextLine();
				System.out.println("Introduzca la segunda palabra:");
				text2 = sc.nextLine();
				System.out.println("El reves del texto es:");
				reves = funcReves(text, text2);
				System.out.println(reves);
				System.out.println(" ");
			break;
			case "3":
				System.out.println("Cuenta vocales");
				System.out.println("-------------------------");
				System.out.println("Introduzca el texto:");
				text = sc.nextLine();
				vocal = cuentaVocales(text);
				System.out.println("El El número de vocales es: "+vocal);
				System.out.println(" ");
			break;
			case "4":
				System.out.println("Repite");
				System.out.println("-------------------------");
				System.out.println("Introduzca el texto a repetir:");
				text = sc.nextLine();
				System.out.println("Introduce el número de veces a repetir:");
				repetir = Integer.parseInt(sc.nextLine());
				System.out.println("Repetición:");
				repetido = repite(text, repetir);
				System.out.println(repetido);
				System.out.println(" ");
			break;
			case "5":
				System.out.println("Es positivo o negativo");
				System.out.println("-------------------------");
				System.out.println("Introduzca un número: ");
				num = Integer.parseInt(sc.nextLine());
				esPositivo = esPositivo(num);
				System.out.println("Es positivo? "+esPositivo);
				System.out.println(" ");
			break;
			case "6":
				System.out.println("Salir");
				System.out.println("========================");
				System.out.println("====Fin del programa====");
				System.out.println("========================");
			break;
			default:
				System.out.println("Opción incorrecta");
				System.out.println(" ");
			break;
			}
		} while (!opcion.equals("6"));
		
		sc.close();
	}
	
	public static void funcTitulo() {
		System.out.println("=======================");
		System.out.println("===Menú del programa===");
	}
	public static void funcMenu() {
		System.out.println("=======================");
		System.out.println("1. Reverso");
		System.out.println("2. Revés");
		System.out.println("3. Cuenta vocales");
		System.out.println("4. Repite");
		System.out.println("5. Positivo o negativo");
		System.out.println("6. Salir");
		System.out.println("=======================");
	}
	
	public static String funcReverso(String cadena) {
		int lon = cadena.length();
		String str="";
		for (int count=lon-1;count>=0;count--) {
			str += cadena.charAt(count); //O str = str + cadena.charAt(count);
		}
		return str;
	}
	
	public static String funcReves(String str1, String str2) {
		return str2+"-"+str1;
	}
	
	public static int cuentaVocales(String cadena) {
		int numVocal=0;
		int lon = cadena.length();
		char c;
		for (int i=0;i<lon;i++) {
			c = cadena.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				numVocal++;
			}
		}
		return numVocal;
	}
	
	public static String repite(String str, int n) {
		String cadena = "";
		for (int i=1;i<=n;i++) {
			cadena = cadena+" "+str;
		}
		return cadena;
	}
	
	public static boolean esPositivo(int param1) {
		if (param1 > 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
