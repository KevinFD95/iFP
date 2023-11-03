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

public class ProgramaPrincipalMejora {

	public static void main(String[] args) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES
		 */
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		/**
		 * BLOQUE DE INTRODUCCIÓN DE DATOS
		 */
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
	
	/**
	 * BLOQUE DE DECLARACIÓN E INICIALIZACIÓN DE VARIABLES DEL PROCEDIMIENTO
	 */
	Scanner sc = new Scanner(System.in);
	String ruta;
	File fich = null;
	boolean result;
	
	/**
	 * BLOQUE DE INTRODUCCIÓN DE DATOS
	 * 
	 * Declaración del fichero
	 */
	System.out.println("Crear directorio");
	System.out.println("Introduzca la ruta del directorio a crear:");
	ruta = sc.nextLine();
	fich = new File(ruta);
	
	/**
	 * COMPROBACIÓN DEL ESTADO DEL FICHERO: CREADO, NO CREADO O YA EXISTENTE
	 */
	if (!fich.exists()){
		result = fich.mkdir();
		if (result) {
			System.out.println("El directorio ha sido creado correctamente.");
		}
		else {
			System.out.println("El directorio no ha sido creado.");
		}
	}
	else {
		System.out.println("El directorio ya existe.");
	}
}
	
/**
 * BORRA UN DIRECTORIO
 */
public static void borrarDirectorio() {
	
	/**
	 * BLOQUE DE DECLARACIÓN E INICIALIZACIÓN DE VARIABLES DEL PROCEDIMIENTO
	 */
	Scanner sc = new Scanner(System.in);
	String ruta;
	File fich = null;
	boolean result;
	
	/**
	 * BLOQUE DE INTRODUCCIÓN DE DATOS
	 * 
	 * Declaración del fichero
	 */
	System.out.println("Borrar directorio");
	System.out.println("Introduzca la ruta del directorio a borrar:");
	ruta = sc.nextLine();
	fich = new File(ruta);
	
	/**
	 * COMPROBACIÓN DEL ESTADO DEL FICHERO: BORRADO, NO BORRADO O NO EXISTENTE
	 */
	if (fich.exists()) {
		result = fich.delete();
		if (result) {
			System.out.println("El directorio ha sido borrado correctamente.");
		}
		else {
			System.out.println("El directorio no ha sido borrado.");
		}
	}
	else {
		System.out.println("El directorio no existe.");
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
		if (!fich.exists()) {
			result = fich.createNewFile();
			if (result) {
				System.out.println("El fichero ha sido creado correctamente.");
			}
			else {
				System.out.println("El fichero no ha sido creado.");
			}
		}
		else {
			System.out.println("El fichero no existe.");
		}
	} 
	catch (IOException ioe) {
		ioe.printStackTrace();
		System.out.println("El fichero no ha sido creado");
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
	
	if (fich.exists()) {
		result = fich.delete();
		if (result) {
			System.out.println("El fichero ha sido borrado correctamente.");
		}
		else {
			System.out.println("El fichero no ha sido borrado.");
		}
	}
	else {
		System.out.println("El fichero no existe.");
	}
}

public static void escribirFichero() {
	
	Scanner sc = new Scanner(System.in);
	String ruta;
	FileWriter fw = null;
	BufferedWriter bw = null;
	String cadena;
	String opcion;
	File fich = null;
	boolean tipo;
	String tmp;
	
	
	System.out.println("Escribir Fichero");
	System.out.println("Introduzca la ruta del archivo donde se quiere escribir:");
	ruta = sc.nextLine();
	
	System.out.println("Introduzca el texto que quiere escribir:");
	cadena = sc.nextLine();
	
	System.out.println("Opciones de escritura:");
	System.out.println("Sobreescribir (S)");
	System.out.println("Añadir al final (A)");
	System.out.println("Introduzca opción de escritura:");
	opcion = sc.nextLine();
	
	if (opcion.equals("A")) {
		tipo = true;
	}
	else {
		if (opcion.equals("S")) {
			tipo = false;
		}
		else {
			System.out.println("Opción incorrecta de escritura.");
			tipo = true;
		}
		
	}
	
	try {
		
		fich = new File (ruta);
		
		if (fich.exists()) {
			fw = new FileWriter(fich, tipo);
			bw = new BufferedWriter(fw);
			bw.write(cadena);
			
			bw.close();
			fw.close();
			
			System.out.println("El fichero ha sido modificado correctamente.");
		}
		else {
			System.out.println("No se puede escribir en un fichero que no existe, desea crearlo? (S/N)");
			tmp = sc.nextLine();
			
			if (tmp.equals("S")) {
				fich.createNewFile();
				
				fw = new FileWriter(fich, tipo);
				bw = new BufferedWriter(fw);
				bw.write(cadena);
				
				bw.close();
				fw.close();
				
				System.out.println("El fichero ha sido modificado correctamente.");
			}
			else {
				System.out.println("No se realiza la escritura al no crear el fichero.");
			}
		}
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
	File fich = null;
	
	System.out.println("Escribir Fichero");
	System.out.println("Introduzca la ruta del archivo donde se quiere escribir:");
	ruta = sc.nextLine();
	
	try {
		
		fich = new File (ruta);
		if (fich.exists()) {
			fr = new FileReader(fich);
			br = new BufferedReader(fr);
			
			linea = br.readLine();
			while (linea != null) {
				totalLineas += "\n"+linea;
				linea = br.readLine();
			}
			
			br.close();
			fr.close();
			
			System.out.println("Contenido del fichero:");
			System.out.println(totalLineas);
		}
		else {
			System.out.println("El fichero no existe.");
		}
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch (IOException ioe) {
		ioe.printStackTrace();
		System.out.println("No se ha podido leer el texto");
	}
}

}
