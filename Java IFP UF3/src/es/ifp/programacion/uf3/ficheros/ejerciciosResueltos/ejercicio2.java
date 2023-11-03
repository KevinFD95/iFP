package es.ifp.programacion.uf3.ficheros.ejerciciosResueltos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES
		 */
		Scanner sc = new Scanner(System.in);
		String ruta;
		String linea;
		
		/**
		 * BLOQUE DE INTRODUCCIÓN DE DATOS
		 */
		menu();
		
		ruta = sc.nextLine();
		
		System.out.println("Introduzca el texto que desea escribir (EOF para salir):");
		linea = sc.nextLine();
		
		/**
		 * BLOQUE DE TRANSFORMACIÓN Y SALIDA DE DATOS
		 */
		while (!linea.equals("EOF")) {
			escribirFich(ruta, linea);
			System.out.println("Introduzca el texto que desea escribir (EOF para salir):");
			linea = sc.nextLine();
		}
		
		/**
		 * CIERRE DEL PROGRAMA
		 */
		System.out.println("Fin del programa.");
		sc.close();	
	}

/**
 * PROCEDIMIENTO DEL MENÚ DEL PROGRAMA
 * 
 * Muestra el menú del programa donde sea llamado en el procedimiento principal
 */
	public static void menu() {
		
		System.out.println("===========================================");
		System.out.println("======Programa de escritura de textos======");
		System.out.println("===========================================");
		System.out.println("Introduzca en que fichero quiere escribir:");
		
	}
	
/**
 * PROCEDIMIENTO DE ESCRITURA EN UN FICHERO
 * 
 * Procedimiento donde se realiza la escritura del fichero que escogemos en el programa principal.
 * Si el fichero no existe, pregunta al usuario si desea crearlo.
 * 
 * @param nameFich como ruta del fichero donde deseamos escribir
 * @param cadena como texto que deseamos escribir
 */
	public static void escribirFich(String nameFich, String cadena) {
		
		/**
		 * BLOQUE DE DECLARACIÓN E INICIALIZACIÓN DE VARIABLES DEL PROCEDIMIENTO
		 */
		Scanner sc = new Scanner(System.in);
		
		File f = null;
		String creaF;
		boolean result;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		String opcion;
		boolean tipo;
		
		f = new File(nameFich);
		
		/**
		 * COMPROBACIÓN SI EL FICHERO EXISTE O NO Y SI SE DESEA CREAR
		 */
		
		try {
			if (!f.exists()) {
				System.out.println("El fichero donde desea escribir no existe.");
	
				do {
					System.out.println("Desea crearlo? (S/N)");
					creaF = sc.nextLine();
					if (creaF.equals("S")) {
						result = f.createNewFile();
					
						if (result) {
						System.out.println("El fichero ha sido creado.");
						}
						else {
						System.out.println("El fichero no ha sido creado.");
						}
					}
					else {
						if (creaF.equals("N")) {
						System.out.println("El fichero no ha sido creado.");
						}
						else {
						System.out.println("Opción incorrecta. Introduzca una opción válida:");
						}
					}
				} while (!creaF.equals("S") && !creaF.equals("N"));
			}
		}
		catch (IOException ioe){
			ioe.printStackTrace();
			System.out.println("El fichero no ha sido creado.");
		}
		
		/**
		 * ESCRITURA DEL FICHERO
		 * 
		 * Deja escoger al usuario si se sobreescribe el texto o se añade al fichero.
		 */
		try {
				System.out.println("Opciones de escritura:");
				System.out.println("Sobreescribir texto (S)");
				System.out.println("Añadir texto al final (A)");
				System.out.println("Introduzca la opción deseada:");
				opcion = sc.nextLine();
			
				if (opcion.equals("A")) {
					tipo = true;
				}
				else {
					if (opcion.equals("S")) {
						tipo = false;
					}
					else {
						System.out.println("Opción incorrecta, se añadirá el texto al final.");
						tipo = true;
					}
				}
				
				fw = new FileWriter(f, tipo);
				bw = new BufferedWriter(fw);
				bw.write(cadena+"\n");
				
				/**
				 * Cierre de recursos del escritor.
				 */
				bw.close();
				fw.close();
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
