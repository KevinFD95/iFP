package es.ifp.programacion.uf2.ejerciciosResueltos;

/**
 *Definición de procedimientos.
 *Llamadas a procedimientos desde el programa principal.
 *Llamadas a procedimientos desde otros procedimientos.
 */
public class ejercicio2 {

	public static void main(String[] args) {
		
		//Llamadas del procedimientos
		
		escribirTitulo("======Programa principal======");
		escribirEnConsola("Inicio del programa");
		
	}
	
	public static void escribirTitulo(String titulo) {
		escribirSeparador();
		System.out.println(titulo);
		escribirSeparador();
	}
	
	public static void escribirEnConsola(String texto) {
		System.out.println(texto);
		//Llamada de procedimiento dentro de un procedimiento
		escribirSeparador();
	}
	
	public static void escribirSeparador() {
		System.out.println("==============================");
	}
}
