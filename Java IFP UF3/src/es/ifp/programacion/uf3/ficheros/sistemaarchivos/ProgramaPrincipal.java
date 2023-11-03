package es.ifp.programacion.uf3.ficheros.sistemaarchivos;

import java.io.File;
import java.io.IOException;

/**
 * Programa que realiza operaciones básicas con un fichero:
 * - Comprueba si existe
 * - Obtener el nombre del fichero
 * - Obtener el directorio padre
 * - Obtener la ruta absoluta del fichero
 * - Comprobar si es un directorio o un fichero
 * - Comprobar si se puede ejecutar
 * - Comprobar si es un fichero oculto
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		boolean fichCreado;
		
		//Ruta absoluta vs ruta relativa.
		File fichero = new File("file.txt"); //Constructor
		
		if (fichero.exists()) {
			System.out.println("El fichero existe.");
		}
		else {
			System.out.println("El fichero no existe.");
			System.out.println("Se crea el fichero file.txt");
			
			try {
				fichCreado = fichero.createNewFile();
			}
			catch (IOException ioe) {
				System.out.println("Error al crear el fichero.");
			}
			finally {
				System.out.println("Se ejecuta siempre el finally.");
			}
		}
		
		System.out.println("El nombre del fichero con getName(): "+fichero.getName());
		System.out.println("Directorio padre con getParent(): "+fichero.getParent());
		System.out.println("La ruta absoluta del fichero con getAbsolutePath(): "+fichero.getAbsolutePath());
		System.out.println("La longitud del fichero con length(): "+fichero.length());
		System.out.println("Es un directorio? Con isDirectory(): "+fichero.isDirectory());
		System.out.println("Es un fichero? Con isFile(): "+fichero.isFile());
		System.out.println("Se puede ejecutar el fichero? Con canExecute(): "+fichero.canExecute());
		System.out.println("Es un fichero oculto? Con isHidden(): "+fichero.isHidden());
		
	}

}
