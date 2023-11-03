package es.ifp.programacion.uf3.ficheros.operaciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Programa que realiza operaciones de escritura y lectura
 * en un fichero de texto
 * 
 * Gestión de excepciones.
 * 
 * Mostrará un menú para que el usuario elija la operación que
 * desea realizar
 * 
 * Ruta absoluta del fichero:
 * 
 * 
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES Y CONSTANTES
		 */
		
		final String fichero = "file.txt"; //Constante del fichero, esto no va a cambiar de ninguna manera
		String lineasFichero; //String que almacena las líneas del fichero para la lectura
		
		/**
		 * BLOQUE DE LLAMADA DE PROCEDIMIENTOS Y FUNCIONES
		 */
		
		//Con un false en la primera llamada, el archivo siempre sobreescribirá la primera línea.
		escrituraFichero(fichero, "Primera escritura con fw", false); //Llamada a la escritura del fichero para escribir la primera línea
		escrituraFichero(fichero, "Segunda escritura con fw", true); //Llamada a la escritura del fichero para escribir la segunda línea
		
		lineasFichero = lecturaFichero(fichero); //Llamada a la lectura del fichero. Se almacena en la variable String
		
		/**
		 * BLOQUE DE SALIDA DE DATOS
		 * 
		 * El programa muestra en consola el contenido del fichero
		 */
		
		System.out.println(lineasFichero);
	}

	/**
	 * PROCEDIMIENTO DE ESCRITURA DE FICHEROS
	 * 
	 * Método que escribe en un fichero de texto una cadena pasada como parametro
	 * @param rutaFichero Ruta del fichero a escribir
	 * @param cadena String a escribir en el fichero
	 * @param tipo si es true se añade al final del fichero, sino sobreescribe el texto del fichero
	 */
	
	public static void escrituraFichero(String rutaFichero, String cadena, boolean tipo) {
		
		/**
		 * BLOQUE DE DECLARACIÓN E INICIALIZACIÓN DE VARIABLES EN EL PROCEDIMIENTO
		 * 
		 * Su uso es exclusivo de este procedimiento
		 */
		
				File fichero = null; //Variable de creación del fichero
				FileWriter fw = null; //Variable de creación del escritor
				BufferedWriter bw = null; //Variable de uso del escritor más eficiente
		
				/**
				 * BLOQUE DE TRANSFORMACIÓN DE DATOS
				 * 
				 * El código se escribe en un try&catch por las excepciones que pueda haber.
				 * Se le pide al programa que intente crear un fichero en ruta relativa al programa.
				 * A su vez, crea un nuevo escritor y un escritor buffered más eficiente
				 */
				
				try {
					fichero = new File(rutaFichero);
					//Con una boolean dentro de FileWriter, al volver a ejecutar el programa, escribe al final
					//Si el boolean es false o no hay, el programa sobreescribe el fichero
					fw = new FileWriter(fichero, tipo);
					bw = new BufferedWriter(fw);
				}
				
				/*
				 * En caso que haya excepcion es de tipo IOException y entraría en el catch.
				 */
				catch (IOException ioe) {
					System.out.println("Excepción al crear el FileWriter");
					ioe.printStackTrace(); //Imprime todos los errores que se han producido.
				}
				
				/*
				 * El programa escribe la cadena que queremos en el fichero
				 * Si encuentra una excepción, imprimirá los errores.
				 */
				
				try {
					bw.write(cadena);
					bw.write("\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				//Cierro flujos. Importante!
				//Si no se cierran, consumen recursos.
				try {
					bw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
	
	/**
	 * Función de lectura del fichero de texto creado y escrito anteriormente.
	 * @param rutaFichero ruta del fichero a leer.
	 * @return totalLineas el contenido escrito dentro del archivo.
	 */
	
	public static String lecturaFichero(String rutaFichero) {
		
		/**
		 * BLOQUE DE DECLARACIÓN E INICIALIZACIÓN DE VARIABLES EN EL PROCEDIMIENTO
		 * 
		 * Su uso es exclusivo de este procedimiento
		 */
		
				File fichero = null;
				FileReader fr = null;
				BufferedReader br = null;
				
				String linea = null;
				String totalLineas = "";
				
				/**
				 * BLOQUE DE TRANSFORMACIÓN DE DATOS
				 * 
				 * El código se escribe en un try&catch por las excepciones que pueda haber.
				 * Se le pide al programa que intente crear un fichero en ruta relativa al programa.
				 * A su vez, crea un nuevo lector y un lector buffered más eficiente
				 */
				
				try {
					fichero = new File(rutaFichero);
					fr = new FileReader(fichero);
					br = new BufferedReader(fr);
				} 
				catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				/*
				 * El programa almacena en la variable 'linea' cada una de las líneas escritas en el archivo
				 * Entonces, con un bucle while, mientras linea no sea nula, el programa leerá las líneas
				 * del archivo y las irá concatenando en diferentes líneas en consola.
				 */
				
				try {
					linea = br.readLine();
					while (linea != null) {
						totalLineas = totalLineas+"\n"+linea;
						linea = br.readLine();
					}
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
				
				try {
					fr.close();
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				return totalLineas;
	}
	
}
