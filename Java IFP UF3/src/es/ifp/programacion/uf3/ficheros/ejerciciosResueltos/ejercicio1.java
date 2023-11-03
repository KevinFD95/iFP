package es.ifp.programacion.uf3.ficheros.ejerciciosResueltos;

import java.io.File;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES
		 */
		String ruta;
		Scanner sc = new Scanner(System.in);
		
		/**
		 * BLOQUE DE INTRODUCCIÓN DE DATOS
		 */
		System.out.println("Introduzca la ruta del fichero a analizar:");
		ruta = sc.nextLine();
		
		/**
		 * BLOQUE DE SALIDA DE DATOS
		 */
		specFich(ruta);
		System.out.println("Fin del programa.");
		
	}

/**
 * PROCEDIMIENTO CARACTERÍSTICAS DE UN FICHERO
 * 
 * Procedimiento que nos indica las características de un fichero siempre y cuando
 * éste exista. Si existe nos muestra una serie de datos sobre él. Si no existe,
 * se cierra el programa.
 * 
 * @param nameFich como ruta del fichero que queremos procesar
 */
	public static void specFich(String nameFich) {
		
		/**
		 * DECLARACIÓN E INICIALIZACIÓN DE VARIABLES EN EL PROCEDIMIENTO
		 */
		File fich = null;
		fich = new File(nameFich);
		
		/**
		 * BLOQUE DE TRANSFORMACIÓN DE DATOS
		 */
		if (fich.exists()) {
			System.out.println("NOMBRE DEL FICHERO: "+fich.getName());
			System.out.println("DIRECTORIO PADRE DEL FICHERO: "+fich.getParent());
			System.out.println("RUTA ABSOLUTA DEL FICHERO: "+fich.getAbsolutePath());
			System.out.println("LONGITUD DEL FICHERO: "+(fich.length()/1024)+"kB");
			System.out.println("EL FICHERO ES UN DIRECTORIO? "+fich.isDirectory());
			System.out.println("EL FICHERO ES UN FICHERO? "+fich.isFile());
			System.out.println("EL FICHERO SE PUEDE EJECUTAR? "+fich.canExecute());
			System.out.println("EL FICHERO ESTÁ OCULTO? "+fich.isHidden());
		}
		else {
			System.out.println("El fichero no existe.");
		}
	}
}
