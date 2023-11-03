package es.ifp.programacion.uf3.ficheros.operaciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Programa que realiza operaciones de escritura y lectura
 * en un fichero de texto
 * 
 * 
 * Mostrará un menú para que el usuario elija la operación que
 * desea realizar:
 * 
 * Crear un directorio (CD)
 * Borrar un directorio (BD)
 * Crear un fichero (CF)
 * Borrar un fichero (BF)
 * 
 * Escribir en un fichero (EF)
 * Leer de un fichero (LF)
 * 
 * Salir del programa (S)
 * 
 * 
 * Ruta relativa del fichero (sobre la carpeta del proyecto)
 * file.txt
 */

public class ProgramaPrincipal2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		do {
			muestraMenu();
			opcion = sc.nextLine();
			
			if (opcion.equals("CD")) {
				crearDirectorio();
			}
			else {
				if (opcion.equals("BD")) {
					borrarDirectorio();
				}
				else {
					if (opcion.equals("CF")) {
						crearFichero();
					}
					else {
						if (opcion.equals("BF")) {
							borrarFichero();
						}
						else {
							if (opcion.equals("EF")) {
								escribirFichero();
							}
							else {
								if (opcion.equals("LF")) {
									leerFichero();
								}
								else {
									if (opcion.equals("S")) {
									}
									else {
										System.out.println("Opción incorrecta");
									}
								}
							}
						}
					}
				}
			}
			
		} while (!opcion.equals("S"));
		
		System.out.println("Fin del programa");
	}
	
/**
 * PROCEDIMIENTO DEL MENÚ
 * 
 * Un procedimiento que muestra las opciones del programa
 */

public static void muestraMenu() {
	System.out.println("===============================");
	System.out.println("      Gestión de ficheros      ");
	System.out.println("===============================");
	System.out.println("Crear un directorio (CD)");
	System.out.println("Borrar un directorio (BD)");
	System.out.println("Crear un fichero (CF)");
	System.out.println("Borrar un fichero (BF)");
	System.out.println("Escribir en un fichero (EF)");
	System.out.println("Leer de un fichero (LF)");
	System.out.println("Salir del programa (S)");
	System.out.println("===============================");
	System.out.print("Introduzca acción que desea realizar: ");
}


/**
 * CREAR UN DIRECTORIO
 */
public static void crearDirectorio() {
	
	Scanner sc = new Scanner(System.in);
	String ruta;
	File fich = null;
	boolean result;
	
	System.out.println("Crear directorio");
	System.out.println("Introduzca la ruta del directorio a crear:");
	ruta = sc.nextLine();
	
	fich = new File(ruta);
	result = fich.mkdir();
	
	if (result) {
		System.out.println("El directorio ha sido creado correctamente.");
	}
	else {
		System.out.println("El directorio no ha sido creado.");
	}
}
	
/**
 * BORRA UN DIRECTORIO
 */
public static void borrarDirectorio() {
	
	Scanner sc = new Scanner(System.in);
	String ruta;
	File fich = null;
	boolean result;
	
	System.out.println("Borrar directorio");
	System.out.println("Introduzca la ruta del directorio a borrar:");
	ruta = sc.nextLine();
	
	fich = new File(ruta);
	result = fich.delete();
	
	if (result) {
		System.out.println("El directorio ha sido borrado correctamente.");
	}
	else {
		System.out.println("El directorio no ha sido borrado.");
	}
}

/**
 * CREAR FICHERO
 */
public static void crearFichero() {
	
	Scanner sc = new Scanner(System.in);
	String ruta;
	File fich = null;
	boolean result = false;
	
	System.out.println("Crear Fichero");
	System.out.println("Introduzca la ruta del fichero a crear:");
	ruta = sc.nextLine();
	
	fich = new File(ruta);
	
	try {
		result = fich.createNewFile();
	} 
	catch (IOException ioe) {
		ioe.printStackTrace();
		System.out.println("El fichero no ha sido creado");
	}
	
	if (result) {
		System.out.println("El fichero ha sido creado correctamente.");
	}
	else {
		System.out.println("El fichero no ha sido creado.");
	}
}

/**
 * BORRAR FICHERO
 */
public static void borrarFichero() {
	
	Scanner sc = new Scanner(System.in);
	String ruta;
	File fich = null;
	boolean result = false;
	
	System.out.println("Borrar Fichero");
	System.out.println("Introduzca la ruta del fichero a borrar:");
	ruta = sc.nextLine();
	
	fich = new File(ruta);
	
	result = fich.delete();
	if (result) {
		System.out.println("El fichero ha sido borrado correctamente.");
	}
	else {
		System.out.println("El fichero no ha sido borrado.");
	}
}

public static void escribirFichero() {
	
	Scanner sc = new Scanner(System.in);
	String ruta;
	FileWriter fw = null;
	BufferedWriter bw = null;
	String cadena;
	
	System.out.println("Escribir Fichero");
	System.out.println("Introduzca la ruta del archivo donde se quiere escribir:");
	ruta = sc.nextLine();
	
	System.out.println("Introduzca el texto que quiere escribir:");
	cadena = sc.nextLine();
	
	try {
		fw = new FileWriter(ruta);
		bw = new BufferedWriter(fw);
		bw.write(cadena);
		
		bw.close();
		fw.close();
		
		System.out.println("El fichero ha sido modificado correctamente.");
	}
	catch (IOException ioe) {
		ioe.printStackTrace();
		System.out.println("No se ha podido escribir el texto");
	}
}

public static void leerFichero() {
	
	Scanner sc = new Scanner(System.in);
	String ruta;
	FileReader fr = null;
	BufferedReader br = null;
	String linea = "";
	String totalLineas="";
	
	System.out.println("Leer Fichero");
	System.out.println("Introduzca la ruta del archivo que quiere leer:");
	ruta = sc.nextLine();
	
	try {
		fr = new FileReader(ruta);
		br = new BufferedReader(fr);
		
		linea = br.readLine();
		while (linea != null) {
			totalLineas += "\n"+linea;
			linea = br.readLine();
		}
		
		br.close();
		fr.close();
		
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch (IOException ioe) {
		ioe.printStackTrace();
		System.out.println("No se ha podido leer el texto");
	}
	
	System.out.println("Contenido del fichero:");
	System.out.println(totalLineas);
}
}
