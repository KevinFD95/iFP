package es.ifp.programacion.uf3.ficheros.sistemaarchivos2;

import java.io.File;

/**
 * Clase que verifica si existe un directorio
 * mostrando si se tiene permisos de lectura y escritura
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		File dir = new File("miDirectorio");
		boolean creado;
		
		if (dir.exists()){
			System.out.println("El directorio "+dir+" existe.");
		}
		else {
			System.out.println("El directorio "+dir+" no existe.");
			creado = dir.mkdir();
			System.out.println("El directorio ha sido creado: "+creado);
		}
		
		if (dir.canRead()) {
			System.out.println("El directorio se puede leer.");
		}
		else {
			System.out.println("El directorio no se puede leer.");
		}
		
		if (dir.canWrite()) {
			System.out.println("El directorio se puede escribir.");
		}
		else {
			System.out.println("El directorio no se puede escribir.");
		}
	}

}
