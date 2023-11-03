package es.ifp.programacion.uf1.ejerciciosResueltos.ejercicio1;

import java.util.Scanner;

/**
 * Primer ejercicio resuelto en el que el usuario deberá introducir datos para formar una ficha personal
 * Introducción de datos almacenados en variables
 */


public class ejercicio1 {

	public static void main(String[] args) {
		
		/**
		 * Bloque de declaración de variables
		 */
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellidos;
		String dni;
		int edad;
		boolean mayorEdad;
		float peso;
		int tlf;
		
		/**
		 * Variables de la dirección
		 */
		
		String calle;
		int num;
		int piso;
		String letra;
		char puerta;
		int cp;
		
		/**
		 * Bloque de introducción de datos
		 */
		
		System.out.println("======================================");
		System.out.println("Programa de creación de ficha personal");
		System.out.println("======================================");
		
		System.out.println("Introduzca su nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca sus apellidos: ");
		apellidos = sc.nextLine();
		
		System.out.println("Introduzca su número de identificación: ");
		dni = sc.nextLine();
		
		System.out.println("Introduzca su edad: ");
		edad = Integer.parseInt(sc.nextLine());
		
		mayorEdad = (edad>=18);
		
		System.out.println("Introduzca su peso: ");
		peso = Float.parseFloat(sc.nextLine());
		
		System.out.println("Introduzca su número de teléfono: ");
		tlf = Integer.parseInt(sc.nextLine());
		
		/**
		 * Introducción de datos de dirección
		 */
		
		System.out.println("===============================");
		System.out.println("Datos de dirección de domicilio");
		System.out.println("===============================");
		
		System.out.println("Introduzca su calle: ");
		calle = sc.nextLine();
		
		System.out.println("Introduzca el número: ");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca la planta: ");
		piso = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca la puerta: ");
		letra = sc.nextLine();
		puerta = letra.charAt(0);
		
		System.out.println("Introduzca el código postal: ");
		cp = Integer.parseInt(sc.nextLine());
		
		/**
		 * Salida de datos
		 */
		
		System.out.println("==========================");
		System.out.println("==========================");
		System.out.println("DATOS DE SU FICHA PERSONAL");
		System.out.println("==========================");
		System.out.println("==========================");
		
		System.out.println("NOMBRE: "+nombre);
		System.out.println("APELLIDOS: "+apellidos);
		System.out.println("DNI: "+dni);
		System.out.println("EDAD: "+edad);
		System.out.print("Mayoría de edad? ");
		if (mayorEdad == true)
			System.out.println("Sí");
		else
			System.out.println("No");
		System.out.println("PESO: "+peso);
		System.out.println("NUM. TELEFONO: "+tlf);
		
		System.out.println("======================");
		System.out.println("DIRECCIÓN DE DOMICILIO");
		System.out.println("======================");
		
		System.out.println("CALLE: "+calle);
		System.out.println("NÚMERO: "+num);
		System.out.println("PISO: "+piso);
		System.out.println("PUERTA: "+puerta);
		System.out.println("CP: "+cp);
		
		sc.close();
	}

}
