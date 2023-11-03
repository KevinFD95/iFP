package es.ifp.programacion.uf2.ejerciciosResueltos;

/*
 * Llamadas de procedimientos desde el programa principal y otro procedimiento
 */

public class ejercicio1 {

	public static void main(String[] args) {
		
		//Llamadas del procedimientos
		escribirSeparador();
		escribirEnConsola("Inicio del programa principal");
		}
	
	public static void escribirEnConsola(String cadena) {
		System.out.println(cadena);
		//Llamada de procedimiento dentro de un procedimiento
		escribirSeparador();
	}
	
	public static void escribirSeparador() {
		System.out.println("=============================");
	}
}
