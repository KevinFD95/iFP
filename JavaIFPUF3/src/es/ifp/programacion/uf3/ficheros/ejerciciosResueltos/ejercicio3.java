package es.ifp.programacion.uf3.ficheros.ejerciciosResueltos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		/**
		 * BLOQUE DE DECLARACIÓN E INICIALIZACIÓN DE VARIABLES
		 */
		Scanner sc = new Scanner(System.in);
		String ruta;
		int num;
		
		/**
		 * BLOQUE DE INTRODUCCIÓN DE DATOS
		 */
		menu();
		ruta = sc.nextLine();
		
		crearFich(ruta);
		
		System.out.println("Introduzca el número que quiere escribir en el fichero (-1 para cerrar):");
		num = sc.nextInt();
		
		/**
		 * BLOQUE DE BUCLE DE INTRODUCCIÓN, TRANSFORMACIÓN Y SALIDA DE DATOS
		 * 
		 * En este bucle se introduce el número constantemente mientras dure el bucle y se irá añadiendo al fichero
		 */
		while (num != -1) {
			escribirFich(ruta, num);
			System.out.println("Introduzca el número que quiere escribir en el fichero (-1 para cerrar):");
			num = sc.nextInt();
		}
		
		/**
		 * BLOQUE DE FINALIZACIÓN DEL PROGRAMA
		 */
		System.out.println("Programa finalizado.");
	}

	/**
	 * PROCEDIMIENTO DE MENÚ
	 */
	public static void menu() {
		System.out.println("========================================");
		System.out.println("Programa de escritura de números enteros");
		System.out.println("========================================");
		System.out.println("Introduzca la ruta del fichero:");	
	}
	
	/**
	 * PROCEDIMIENTO DE COMPROBACIÓN Y CREACIÓN EN SU DEFECTO DEL FICHERO
	 * @param nameFich como ruta del fichero
	 */
	public static void crearFich(String nameFich) {
		
		Scanner sc = new Scanner(System.in);
		File fich = null;
		String crear;
		
		fich = new File(nameFich);
		
		if (!fich.exists()) {
			System.out.println("El fichero no existe.");
			System.out.println("Desea crearlo? (S/N)");
			crear = sc.nextLine();
			try {
				if (crear.equals("S")) {
					fich.createNewFile();
					System.out.println("El fichero ha sido creado correctamente.");
				}
				else {
					if (crear.equals("N")) {
						System.out.println("El fichero no ha sido creado.");
						System.out.println("Fin del programa.");
					}
					else {
						System.out.println("Opción incorrecta, el fichero no ha sido creado.");
					}
				}
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
	/**
	 * PROCEDIMIENTO DE ESCRITURA EN EL FICHERO
	 * @param nameFich como ruta del fichero
	 * @param numero como número introducido para escribir en el fichero
	 */
	public static void escribirFich(String nameFich, int numero) {
		
		Scanner sc = new Scanner(System.in);
		File f = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			f = new File(nameFich);
			fw = new FileWriter(f, true);
			bw = new BufferedWriter(fw);
			bw.write(numero+"\n");
			
			bw.close();
			fw.close();
		} 
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
