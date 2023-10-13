package es.ifp.programacion.uf3.reto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * RETO UF3 PROGRAMA DE GESTIÓN DE FICHEROS SIN EL USO DE LA CLASE SCANNER
 * 
 * Este programa tiene la función de crear y escribir en un fichero de texto introduciendo datos a través del teclado
 * sin el uso de la clase Scanner, utilizando la clase InputStreamReader.
 * 
 * Introducimos la clase InputStreamReader para introducir datos a través del teclado que serán leídos por la clase
 * BufferedReader de la siguiente manera:
 * 		InputStreamReader isr = new InputStreamReader(System.in) -> De esta manera introducimos en la variable 'isr'
 * 																	el input de datos a través del teclado.
 * 		BufferedReader br = new BufferedReader(isr) -> 	De esta manera indicamos al BufferedReader que lea los datos
 * 														introducidos en el InputStreamReader.
 * 
 * El programa tiene un menú con tres opciones diferentes: crear un fichero, escribir en un fichero y salir del programa.
 * Las dos opciones que se encargan de crear y modificar ficheros están definidas en dos procedimientos distintos y son
 * llamados en el procedimiento principal en cada una de las opciones del menú.
 * 
 * Antes de realizar ninguna opción, el programa llama a la función 'fichExists' que se encarga de identificar si el
 * fichero que queremos crear o modificar existe o no. 
 * Si queremos crearlo y existe, el programa no llama al procedimiento de crear en la primera opción.
 * Si queremos escribir en un fichero y no existe, el programa llama al procedimiento de crear y, si se crea, llama
 * al procedimiento de escribir en el fichero. Si no se crea, sale de la segunda opción.
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {

		/**
		 * BLOQUE DE DECLARACIÓN E INICIALIZACIÓN DE VARIABLES
		 * 
		 * 1. Clase InputStreamReader 'isr' para la lectura de la información que introducimos a través del teclado.
		 * 2. Clase BufferedReader 'bri' para la lectura de información de la Clase InputStreamReader.
		 * 3. Variable tipo String 'opcion' que contiene la opción que escogemos para el menú.
		 * 4. Variable tipo String 'ruta' que contiene la ruta del fichero que vamos a procesar en el programa.
		 * 5. Variable tipo String 'texto' que contiene el texto que introducimos en el fichero.
		 * 
		 * Introducción del InputStreamReader con 'System.in' para la introducción de datos a través del teclado.
		 * Introducción del BufferedReader para la lectura del InputStreamReader.
		 */
		InputStreamReader isr = null;
		BufferedReader bri = null;
		String opcion = null;
		String ruta = "";
		String texto = "";
		
		isr = new InputStreamReader(System.in);
		bri = new BufferedReader(isr);
		
		/**
		 * BLOQUE DE INICIO DEL PROGRAMA E INTRODUCCIÓN DE DATOS
		 * 
		 * El programa empieza con un bucle 'do-while' que se repetirá hasta que el usuario introduzca la opción de salida
		 * en la variable 'opcion'.
		 * 
		 * Se muestra el menú codificado en el procedimiento 'menu()' posterior al procedimiento principal.
		 * Introducimos la variable 'opcion' a través del teclado, ésta es leída por el BufferedReader.
		 * 
		 * Una vez introducimos la variable 'opcion' el programa entra en el 'case' correspondiente de un 'switch' que
		 * ejecutará las órdenes y procedimientos correspondientes.
		 * 
		 * Una vez terminada la opción escogida, el programa vuelve al principio. Esto ocurre hasta que se introduzca en
		 * 'opcion' el valor de salida.
		 * 
		 * Si el valor introducido no es ningún valor de algún 'case', el programa mostrará el 'default' del 'switch' y
		 * volverá a reclamar el valor de la variable 'opcion'.
		 * 
		 * Finalmente cerramos los recursos del InputStreamReader y el BufferedReader para evitar errores.
		 */
		do {
			menu();
			/**
			 * INTRODUCCIÓN DE 'opcion'
			 * 
			 * El programa intenta leer la variable 'opcion' que introducimos a través del teclado. Sino es posible, muestra
			 * un mensaje y los errores en la consola.
			 */
			try {
				opcion = bri.readLine();
			} 
			catch (IOException ioe) {
				ioe.printStackTrace();
				System.out.println("Error al leer la opción.");
			}
			/**
			 * SWITCH CON LAS OPCIONES DEL PROGRAMA
			 */
			switch (opcion) {
			case "A", "a":
				/**
				 * OPCIÓN "A": CREACIÓN DE FICHEROS
				 * 
				 * En esta opción el programa nos reclama introducir la ruta del fichero comprueba si existe o no el fichero 
				 * llamando a la función 'fichExists'. En caso de que el fichero no exista, llama al procedimiento 'crearFich' 
				 * para poder crearlo.
				 * Si no es posible ejecutar el 'try', el programa muestra el error al leer la ruta.
				 */
				System.out.println("Crear fichero");
				System.out.println("Introduzca la ruta del fichero:");
				try {
					ruta = bri.readLine();
					if (!fichExists(ruta)) {
						crearFich(ruta, bri);
					}
				} 
				catch (IOException ioe) {
					ioe.printStackTrace();
					System.out.println("Error al leer la ruta.");
				}
				System.out.println("");
			break;
			case "B", "b":
				/**
				 * OPCIÓN B: ESCRIBIR EN UN FICHERO
				 * 
				 * En esta opción el programa reclama la ruta del fichero y el texto que deseamos introducir en el fichero.
				 * Si falla el intento de introducción de la ruta o el texto, el programa muestra un mensaje de error y
				 * muestra el error en consola.
				 * La introducción del texto está en el interior de un bucle 'do-while' haciendo que podamos introducir
				 * texto en el contenido del fichero siempre y cuando la variable 'texto' no sea la clave de salida 'EOF'.
				 * Una vez introducimos el texto, el programa comprueba si el fichero que hemos introducido en 'ruta' existe.
				 * Si no existe, el programa llama al procedimiento 'crearFich' para poder crearlo. Cuando el fichero existe,
				 * se llama al procedimiento 'escribirFich'.
				 * Si el fichero existe, directamente se llama al procedimiento 'escribirFich'.
				 */
				System.out.println("Escribir en fichero");
				System.out.println("Introduzca la ruta del fichero:");
				try {
					ruta = bri.readLine();
				} 
				catch (IOException ioe) {
					ioe.printStackTrace();
					System.out.println("Error al leer la ruta.");
				}
				do {
					try {
						System.out.println("Introduzca el texto o la opción de salida (EOF):");
						texto = bri.readLine();
					} 
					catch (IOException ioe) {
						ioe.printStackTrace();
						System.out.println("Error al leer el texto.");
					}
					if (texto.equals("EOF")) {
						System.out.println("Cierre del fichero.");
					}
					else {
						if (fichExists(ruta)) {
							escribirFich(ruta, bri, texto);
						}
						else {
							crearFich(ruta, bri);
							if (fichExists(ruta)) {
								escribirFich(ruta, bri, texto);
							}
						}
					}
				} while (!texto.equals("EOF") && fichExists(ruta));
				System.out.println("");
			break;
			case "C", "c","S", "s":
				/**
				 * OPCIÓN C: SALIR DEL PROGRAMA
				 * 
				 * En esta opción el programa muestra un mensaje de salida del programa y sale del bucle 'do-while' que 
				 * contiene el programa, finalizando así el programa en consola.
				 */
				System.out.println("Salir del programa");
				System.out.println("");
			break;
			default:
				/**
				 * DEFAULT
				 * 
				 * Siempre que en 'opcion' se introduzca un valor no válido, el programa entrará en esta opción y volverá
				 * al inicio.
				 */
				System.out.println("Opción introducida incorrecta.");
				System.out.println("Introduzca una opción válida.");
				System.out.println("");
			break;
			}
		} while (!opcion.equals("C") && !opcion.equals("c") && !opcion.equals("S") && !opcion.equals("s"));
		System.out.println("El programa ha finalizado.");
		try {
			bri.close();
			isr.close();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

/**
 * PROCEDIMIENTO 'menu'
 * 
 * Procedimiento que muestra el menú del programa donde es llamado en el procedimiento principal
 */
	public static void menu() {
		
		System.out.println("============================");
		System.out.println("==PROGRAMA EDITOR DE TEXTO==");
		System.out.println("============================");
		System.out.println("");
		System.out.println("A) Crear fichero");
		System.out.println("B) Escribir en fichero");
		System.out.println("C) Salir del programa");
		System.out.println("");
		System.out.println("Introduzca la opción deseada:");
	}

/**
 * FUNCIÓN DE COMPROBACIÓN DEL ESTADO DEL FICHERO
 *
 * Esta función devuelve el resultado de una variable booleana que demuestra la existencia o no del fichero.
 * @param nameF como string de 'ruta' en el procedimiento principal.
 * @return creado como booleana que demuestra la existe o no del fichero.
 */
	public static boolean fichExists(String nameF) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES EN 'fichExists'
		 * 
		 * 1. Clase File de 'f' para introducir el fichero.
		 * 2. Variable booleana 'creado' que almacena el estado del fichero (existe o no).
		 */
		File f = null;
		boolean creado = false;
		
		/**
		 * BLOQUE DE INICIALIZACIÓN DEL FICHERO Y COMPROBACIÓN
		 * 
		 * Se inicia 'f' como un nuevo fichero con la variable 'ruta' que llega del procedimiento principal.
		 * Si el fichero existe, 'creado' es verdadero y el programa nos dice que el fichero existe.
		 * Si el fichero no existe, 'creado' es falso y el programa nos dice que el fichero no existe.
		 * 
		 * Finalmente se devuelve la booleana 'creado' al procedimiento principal.
		 */
		f = new File(nameF);
		
		if (f.exists()) {
			creado = true;
			System.out.println("El fichero existe.");
		}
		else {
			creado = false;
			System.out.println("El fichero no existe.");
		}
		return creado;
	}

/**
 * PROCEDIMIENTO DE CREACIÓN DEL FICHERO
 * 
 * Este procedimiento se encarga de crear el fichero que introducimos en el procedimiento principal si la función 'fichExists'
 * devuelve 'creado' como falso.
 * @param nameF como contenedor de la variable 'ruta' del procedimiento principal.
 * @param bri como contenedor de la clase BufferedReader del procedimiento principal.
 */
	public static void crearFich(String nameF, BufferedReader bri) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES DE 'crearFich'
		 * 
		 * 1. Clase File de 'f' para introducir el fichero.
		 * 2. Variable tipo String 'confirm' contenedora de la opción si se crea o no el fichero.
		 * 
		 * Se inicia 'f' como un nuevo fichero con la ruta que llega del procedimiento principal.
		 */
		File f = null;
		String confirm = "";
		
		f = new File(nameF);
		
		/**
		 * BLOQUE DE CREACIÓN DEL FICHERO
		 * 
		 * El programa pregunta si deseamos crear el fichero.
		 * Se inicia un bucle do-while donde elegiremos la opción 'S' o 'N' según queramos crear o no el fichero.
		 * Si introducimos 'S', el programa crea intenta crear el fichero y nos muestra un mensaje si lo ha creado o no.
		 * Si introducimos 'N', el programa no crea el fichero y nos muestra un mensaje como no creado.
		 * Si introducimos un valor que no es ninguno de los anteriores, el bucle se repite para que introduzcamos uno válido.
		 */
		System.out.println("Desea crear el fichero "+nameF+"? (S/N)");
		do {
			try {
				confirm = bri.readLine();
			} 
			catch (IOException ioe) {
				ioe.printStackTrace();
				System.out.println("Error al leer confirmación.");
			}
			if (confirm.equals("S")) {
				try {
					f.createNewFile();
					System.out.println("El fichero "+nameF+" ha sido creado con éxito.");
				} 
				catch (IOException ioe) {
					ioe.printStackTrace();
					System.out.println("Error al crear el fichero.");
				}
			}
			else {
				if (confirm.equals("N")) {
					System.out.println("El fichero no ha sido creado.");
				}
				else {
					System.out.println("Introduzca una opción válida (S/N):");
				}
			}
		} while (!confirm.equals("S") && !confirm.equals("N"));
	}

/**
 * PROCEDIMIENTO PARA ESCRIBIR Y MODIFICAR TEXTO EN EL FICHERO
 * 
 * Este procedimiento se encarga de escribir el texto que introducimos en el fichero, ambos introducidos en el procedimiento principal.
 * @param nameF como contenedor de la variable 'ruta' del procedimiento principal.
 * @param bri como contenedor de la clase BufferedReader del procedimiento principal.
 * @param texto como contenedor de la variable 'texto' del procedimiento principal.
 */
	public static void escribirFich(String nameF, BufferedReader bri, String texto) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES DE 'escribirFich'
		 * 
		 * 1. Clase File 'f' para introducir el fichero.
		 * 2. Variable tipo 'String' 'opcion' para introducir la opción del menú codificado a continuación.
		 * 3. Variable tipo 'boolean' 'mtext' para modificar la introducción de texto en el fichero (mtext = false para sobreescribir,
		 * mtext = true para introducir texto al final del fichero).
		 * 4. Clase FileWriter 'fw' para introducir el escritor.
		 * 5. Clase BufferedWriter 'bw' como escritor más eficiente.
		 */
		File f = null;
		String opcion = "";
		boolean mtext = true;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		/**
		 * BLOQUE DE INTRODUCCIÓN DE TEXTO EN EL FICHERO
		 * 
		 * Este bloque contiene un bucle 'do-while' que hará que se repita un menú si la opción que introducimos en la variable 'opcion'
		 * no es ni "A" ni "S". Saldrá del bucle si introducimos la opción correcta.
		 * 
		 * Si introducimos la opción correcta, el programa entra en un 'if' donde por "A", 'mtext' sera verdadero y, por lo tanto, se
		 * añadirá el texto que hemos introducido en el procedimiento principal al final del fichero.
		 * Si 'opcion' es "S", la variable 'mtext' será falsa y el texto sustituirá el contenido del fichero.
		 * 
		 * Una vez definida la variable 'mtext', el programa intentará escribir en el fichero el texto.
		 * Si el programa no pudiera leer el valor de 'opcion' o no pudiera escribir en el fichero, saldrá el mensaje de error 
		 * correspondiente.
		 */
		do {
			System.out.println("Introduzca que desea hacer:");
			System.out.println("1. Añadir texto al fichero (A)");
			System.out.println("2. Sobreescribir fichero (S)");
			System.out.println("");
			System.out.println("Introduzca una opción:");
			try {
				opcion = bri.readLine();
			} 
			catch (IOException ioe) {
				ioe.printStackTrace();
				System.out.println("Error al leer opción.");
			}
			if (opcion.equals("A") || opcion.equals("S")) {
				if (opcion.equals("A")) {
					mtext = true;
				}
				else {
					mtext = false;
				}
				try {
					f = new File(nameF);
					fw = new FileWriter(f, mtext);
					bw = new BufferedWriter(fw);
					bw.write(texto+"\n");
					
					bw.close();
					fw.close();
				} 
				catch (IOException ioe) {
					ioe.printStackTrace();
					System.out.println("Error al leer el texto, no se ha podido escribir en el fichero.");
				}
			}
			else {
				System.out.println("Opción incorrecta");
			}
		} while (!opcion.equals("S") && !opcion.equals("A"));
	}
}
