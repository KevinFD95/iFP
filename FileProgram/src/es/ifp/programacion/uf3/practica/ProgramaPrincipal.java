package es.ifp.programacion.uf3.practica;

/**
 * TAREA PENDIENTE ANTES DE ENTREGAR
 * 
 * REVISAR LOS COMENTARIOS JUNTO AL CÓDIGO
 * PROBAR EL PROGRAMA Y VER SI ES SÓLIDO Y CORREGIR DONDE FALLE
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * PRACTICA UF3 PROGRAMA DE GESTIÓN DE FICHEROS.
 * 
 * Este es un programa que tiene la función de gestionar ficheros ya sea creándolos, editándolos, etc.
 * El programa cuenta con un menú que se repite hasta que se desea salir del programa con la opción adecuada.
 * Tiene cuatro opciones diferentes:
 * 
 * 1. Crear un fichero.
 * 2. Introducir info a un fichero.
 * 3. Leer un fichero.
 * 4. Eliminar un fichero.
 * 
 * El procedimiento principal contiene un bucle que se repite hasta que se sale del programa y, dentro de este bucle,
 * el menú en el que podemos escoger la opción que deseemos.
 * 
 * Cada una de las opciones están escritas al final del código en procedimientos o funciones diferentes.
 * Funciones y procedimientos:
 * 1. menu
 * 2. fichExists
 * 3. crearFich
 * 4. escribirFich
 * 5. leerFich
 * 6. borrarFich
 * @author Kevin Fuentes
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES DEL PROCEDIMIENTO PRINCIPAL DEL PROGRAMA
		 * 
		 * Introducción de las variables utilizadas en el procedimiento principal del programa:
		 * 
		 * 1. Clase Scanner para la introducción de datos del usuario a través del teclado.
		 * 2. Variable tipo String 'opcion' que recoge la opción del menú introducida por el usuario.
		 * 3. Variable tipo String 'ruta' que recoge la ruta del fichero que se quiere procesar con el programa.
		 */
		Scanner sc = new Scanner(System.in);
		String opcion;
		String ruta;
		
		/**
		 * BLOQUE DE INICIO DEL PROGRAMA E INTRODUCCIÓN DE DATOS
		 * 
		 * En este bloque se introduce un bucle do-while que se repetirá siempre que el usuario no introduzca la opción
		 * de salida del programa contenida en un 'case' del 'switch' contenido en el bucle.
		 * 
		 * En el bucle muestra primero el procedimiento 'menu' donde está definido el menú del programa.
		 * El usuario introduce el valor de la opción del menú según desee.
		 * 
		 * A continuación se introduce el 'switch' con las diferentes opciones del programa.
		 */
		do {
			menu();
			opcion = sc.nextLine();
			
			switch (opcion) {
			case "A":
				/**
				 * OPCIÓN CREAR FICHERO
				 * 
				 * En esta opción se comprobará si el fichero que introduce como ruta el usuario existe o no.
				 * Llamada a la función 'fichExists' para comprobar si este fichero existe.
				 * Si no existe, el programa llamará al procedimiento para crearlo 'crearFich' donde podemos elegir
				 * crearlo o no.
				 */
				System.out.println("Crear fichero");
				System.out.println("Introduzca la ruta del fichero:");
				ruta = sc.nextLine();
				if (!fichExists(ruta)) {
					crearFich(ruta, sc);
				}
				System.out.println("");
			break;
			case "B":
				/**
				 * OPCIÓN ESCRIBIR EN FICHERO
				 * 
				 * En esta opción se comprueba si el fichero que se desea modificar existe o no llamando a la función
				 *'fichExists'.
				 *Si el fichero existe, el programa llama al procedimiento 'escribirFich' para escribir en el interior de éste.
				 *Si el fichero no existe, el programa llama al procedimiento 'crearFich' donde podemos elegir crearlo o no.
				 */
				System.out.println("Introducción de información en un fichero");
				System.out.println("Introduzca la ruta del fichero:");
				ruta = sc.nextLine();
				if (fichExists(ruta)) {
					escribirFich(ruta, sc);
				}
				else {
					crearFich(ruta, sc);
					if (fichExists(ruta)) {
						escribirFich(ruta, sc);
					}
				}
				System.out.println("");
			break;
			case "C":
				/**
				 * OPCIÓN LEER UN FICHERO
				 * 
				 * En esta opción se comprueba si el fichero que se desea leer el contenido existe o no llamando a la función
				 * 'fichExists'.
				 * Si el fichero existe, el programa llama a la función 'leerFich' y devuelve el contenido del fichero.
				 * Si el fichero no existe, se llama al procedimiento 'crearFich' donde podemos elegir si crear el fichero o no.
				 */
				System.out.println("Lectura de fichero de texto");
				System.out.println("Introduzca la ruta del fichero:");
				ruta = sc.nextLine();
				if (fichExists(ruta)) {
					System.out.println("El fichero contiene la siguiente información:");
					System.out.println(leerFich(ruta));
				}
				else {
					crearFich(ruta, sc);
					if (fichExists(ruta)) {
						System.out.println("El fichero contiene la siguiente información:");
						System.out.println(leerFich(ruta));
					}
				}
				System.out.println("");
			break;
			case "D":
				/**
				 * OPCIÓN ELIMINAR UN FICHERO
				 * 
				 * En esta opción se comprueba si el fichero que se desea leer el contenido existe o no llamando a la función
				 * 'fichExists'.
				 * Si el fichero existe, el programa llama a la función 'borrarFich' para procesar la eliminación de éste.
				 * Si el fichero no existe, el programa nos muestra un mensaje diciendo que el archivo que deseamos eliminar no 
				 * existe.
				 */
				System.out.println("Eliminar fichero de texto");
				System.out.println("Introduzca la ruta del fichero:");
				ruta = sc.nextLine();
				if (fichExists(ruta)) {
					borrarFich(ruta, sc);
				}
				System.out.println("");
			break;
			case "E", "S":
				/**
				 * OPCIÓN DE SALIDA DEL PROGRAMA
				 * 
				 * En esta opción únicamente se muestra un mensaje donde nos dice que salimos del programa y se cierra el bucle
				 * romper la condición del while del final del bucle.
				 */
				System.out.println("Salir del programa.");
			break;
			default:
				/**
				 * DEFAULT
				 * 
				 * Para cualquier opción que no esté dentro de ningún caso, nos saldrá un mensaje como opción no válida y nos devolverá
				 * al bucle.
				 */
				System.out.println("Opción no válida.");
				System.out.println("Introduzca una opción válida.");
				System.out.println("");
			break;
			}	
		} while (!opcion.equals("S") && !opcion.equals("E"));
		System.out.println("El programa ha finalizado.");
		sc.close();
	}
	
/**
 * PROCEDIMIENTO DEL MENÚ DEL PROGRAMA
 * 
 * En este procedimiento se codifica el menú del programa que se repetirá al principio del bucle 'do-while', antes que introduzcamos
 * la opción del 'switch'.
 */
	public static void menu() {
		System.out.println("===============================");
		System.out.println("Programa de gestión de ficheros");
		System.out.println("===============================");
		System.out.println("A) Crear fichero");
		System.out.println("B) Introducir información en un fichero");
		System.out.println("C) Leer fichero de texto");
		System.out.println("D) Eliminar fichero de texto");
		System.out.println("E) Salir (S)");
		System.out.println("===============================");
		System.out.println("Introduzca la opción que desea realizar:");
	}
	
/**
 * FUNCIÓN DE COMPROBACIÓN DEL ESTADO DE UN FICHERO (EXISTE O NO EXISTE)
 * 
 * Esta función comprueba si el fichero que introducimos en la variable 'ruta' del programa principal existe o no.
 * @param nameF como contenedor de la variable 'ruta' del procedimiento principal.
 * @return creado una variable booleana como comprobación de la existencia del fichero.
 */
	public static boolean fichExists(String nameF) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES DE 'fichExists'
		 * 
		 * 1. Clase File de 'f' para introducir el fichero.
		 * 2. Variable booleana 'creado' para comprobar la existencia del fichero.
		 */
		File f = null;
		boolean creado;
		
		/**
		 * BLOQUE INICIALIZACIÓN DEL FICHERO Y COMPROBACIÓN
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
			System.out.println("El fichero "+nameF+" existe.");
		}
		else {
			creado = false;
			System.out.println("El fichero "+nameF+" no existe.");
		}
		return creado;
	}
	
/**
 * PROCEDIMIENTO DE CREACIÓN DEL FICHERO
 * 
 * Este procedimiento se encarga de crear el fichero que introducimos en el procedimiento principal si la función 'fichExists'
 * devuelve 'creado' como falso.
 * @param nameF como contenedor de la variable 'ruta' del procedimiento principal.
 * @param sc como contenedor de la clase Scanner 'sc' del procedimiento principal.
 */
	public static void crearFich(String nameF, Scanner sc) {
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES DE 'crearFich'
		 * 
		 * 1. Clase File de 'f' para introducir el fichero.
		 * 2. Variable tipo String 'crear' contenedora de la opción si se crea o no el fichero.
		 */
		File f = null;
		String crear;
		
		f = new File(nameF);
		
		/**
		 * BLOQUE CREACIÓN DEL FICHERO
		 * 
		 * Se inicia 'f' como un nuevo fichero con la ruta que llega del procedimiento principal.
		 * 
		 * El programa pregunta si deseamos crear el fichero.
		 * Se inicia un bucle do-while donde elegiremos la opción 'S' o 'N' según queramos crear o no el fichero.
		 * Si introducimos 'S', el programa crea intenta crear el fichero y nos muestra un mensaje si lo ha creado o no.
		 * Si introducimos 'N', el programa no crea el fichero y nos muestra un mensaje como no creado.
		 * Si introducimos un valor que no es ninguno de los anteriores, el bucle se repite para que introduzcamos uno válido.
		 */
		System.out.println("Desea crear el fichero "+nameF+"? (S/N)");
		do {
			crear = sc.nextLine();
			
			if (crear.equals("S")) {
				try {
					f.createNewFile();
					System.out.println("El fichero "+nameF+" ha sido creado correctamente.");
				} 
				catch (IOException ioe) { //Si la creación del fichero falla el programa muestra el siguiente mensaje
					ioe.printStackTrace();
					System.out.println("El fichero "+nameF+" no ha podido ser creado.");
				}
			}
			else {
				if (crear.equals("N")) {
					System.out.println("El fichero "+nameF+" no ha sido creado.");
				}
				else {
					System.out.println("Opción incorrecta, introduzca una opción válida (S/N):");
				}
			}
		} while (!crear.equals("S") && !crear.equals("N"));
	}

/**
 * PROCEDIMIENTO DE MODIFICAR EL CONTENIDO DE UN FICHERO
 * 
 * Este procedimiento se encarga de escribir contenido o sobrescribir el existente de un fichero siempre y cuando exista.
 * @param nameF como contenedor de la variable 'ruta' del procedimiento principal.
 * @param sc como contenedor de la clase Scanner 'sc' del procedimiento principal.
 */
	public static void escribirFich(String nameF, Scanner sc) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES DE 'escribirFich'
		 * 
		 * 1. Clase File 'f' para introducir el fichero.
		 * 2. Clase FileWriter 'fw' para introducir el escritor de texto.
		 * 3. Clase BufferedWriter 'bw' para introducir un escritor más eficiente.
		 * 4. Variable tipo String 'opcion' para almacenar la opción que desea realizar el usuario.
		 * 5. Variable tipo String 'text' para almacenar el texto que desea introducir el usuario al contenido del fichero.
		 * 6. Variable tipo boolean 'masText' para sobrescribir o añadir texto al contenido del fichero.
		 */
		File f = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		String opcion;
		String text = "";
		boolean masText = true;
		
		f = new File(nameF);
		
		/**
		 * BLOQUE DE INTRODUCCIÓN DE DATOS
		 * 
		 * Dentro de un bucle 'do-while' el programa nos reclama la opción que queremos tomar para introducir texto al fichero
		 * y el propio texto que queremos introducir.
		 * 
		 * El programa nos pregunta que deseamos hacer con la variable 'opción': sobrescribir texto, añadir nuevo o salir del programa.
		 * Dependiendo la opción que introduzcamos, entramos en un condicional (if) donde determinamos el estado de la variable boolean 
		 * 'masText' que cambia a verdadero o falso, verdadero añade más contenido al fichero y falso lo reemplaza.
		 * Una vez introducimos la opción, el programa nos reclama el texto que queremos introducir.
		 * Se inicializan las clases FileWriter y BufferedWriter para escribir el texto dentro del fichero. Una vez escrito, se cierran 
		 * los recursos.
		 * 
		 * Mientas la opción que introduzcamos sea 'S', 'A' o cualquier otra, el bucle se repetirá, aunque si se introduce un valor no válido,
		 * el bucle se repité hasta introducir una 'S' o 'A'.
		 * 
		 * El bucle cierra cuando se introduce la opción de salida 'EOF'.
		 */
		do {
			System.out.println("Desea reemplazar la información del fichero (S), añadir nueva (A) o salir del fichero (EOF)?");
			opcion = sc.nextLine();
			
			/**
			 * Si 'opcion' es 'S' o 'A', entramos en el 'if' 
			 * Si 'opcion' es 'S', 'masText' es falso y el texto se sobrescribirá.
			 * Si 'opcion' es 'A', 'masText' es verdadero y el texto se añadirá al final en una nueva línea.
			 * 
			 * Una vez definimos 'masText', el programa pedirá el texto que queremos introducir en el fichero.
			 * Se inicializan las variables del escritor 'fw' y 'bw' para introducir el texto en el fichero.
			 * Una vez se introduce, se cierran los recursos del escritor para que el fichero quede libre y pueda
			 * utilizarse en otras opciones del programa.
			 * 
			 * Si 'opcion' no es ni 'S' ni 'A', saltamos el 'if' y entramos en el 'else'
			 * En el 'else' entramos en el 'if' que contiene si 'opcion' es 'EOF' y cierra el bucle.
			 * Si 'opcion' es cualquier valor no válido, el bucle se repite hasta escoger una opción válida.
			 */
			if (opcion.equals("S") || opcion.equals("A")) {
				if (opcion.equals("S")) {
					masText = false;
				}
				else {
					masText = true;
				}
				System.out.println("Introduzca el texto que desea introducir en el fichero:");
				text = sc.nextLine();
				try {
					fw = new FileWriter(f, masText);
					bw = new BufferedWriter(fw);
					bw.write(text+"\n");
				
					bw.close();
					fw.close();
				} 
				catch (IOException ioe) {
					ioe.printStackTrace();
					System.out.println("El texto no se ha podido introducir en el fichero.");
				}
			}
			else {
				if (opcion.equals("EOF")) {
					System.out.println("Cierre del fichero.");
				}
				else {
					System.out.println("Opción incorrecta, introduzca una opción válida.");
				}
			}
	} while (!opcion.equals("EOF"));
}
	
/**
 * FUNCIÓN DE LECTURA DE FICHERO
 * 
 * Esta función se encarga de leer y devolver el contenido del fichero que escogemos.
 * @param nameF como almacenador de la variable 'ruta' del procedimiento principal.
 * @return totalLineas como String del contenido del fichero.
 */
	public static String leerFich(String nameF) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES DE 'leerFich'
		 * 
		 * 1. Clase File 'f' para introducir el fichero.
		 * 2. Clase FileReader 'fr' para introducir el lector de texto del fichero.
		 * 3. Clase BufferedReader 'br' para introducir un lector más eficiente.
		 * 4. Variable String 'linea' como contenedor de cada línea de contenido del fichero.
		 * 5. Variable String 'totalLineas' como contenedor de todo el contenido del fichero.
		 */
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea = "";
		String totalLineas = "";
		
		/**
		 * BLOQUE DE LECTURA DEL FICHERO.
		 * 
		 * En este bloque se intenta leer el fichero que viene de la variable 'ruta' del procedimiento principal
		 * almacenada en 'nameF' y se inician los lectores 'fr' y 'br'.
		 * Una vez hecho esto, el programa intenta leer el contenido del fichero y lo va almacenando línea por línea en la variable 'linea'.
		 * Cuando ya tiene todo el contenido leído (linea = null), todo el contenido queda almacenado en 'totalLineas' que se devuelve
		 * al procedimiento principal del programa.
		 * 
		 * Una vez se ha leído todo el contenido, se cierran los recursos para que el fichero no quede en uso y se pueda manipular con
		 * cualquier otro procedimiento del programa.
		 */
		try {
			f = new File(nameF);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			try {
				linea = br.readLine();
				while (linea != null) {
					totalLineas += "\n"+linea;
					linea = br.readLine();
				}
				br.close();
				fr.close();
			} 
			catch (IOException ioe) { //Si no se ha podido leer el fichero el programa muestra el siguiente mensaje
				System.out.println("No se ha podido leer el fichero.");
				ioe.printStackTrace();
			}
		} 
		catch (FileNotFoundException fnfe) { //Si no se ha podido leer el fichero porque no se encuenta el programa muestra el siguiente mensaje
			System.out.println("No se ha podido encontrar el fichero.");
			fnfe.printStackTrace();
		}
		return totalLineas;
	}

/**
 * PROCEDIMIENTO ELIMINADOR DE FICHEROS
 * 
 * Este procedimiento se encarga de eliminar un fichero que nosotros introduzcamos en la variable ruta en el procedimiento principal.
 * @param nameF como almacenador de la variable 'ruta' del procedimiento principal.
 * @param sc como contenedor de la clase Scanner 'sc' del procedimiento principal.
 */
	public static void borrarFich(String nameF, Scanner sc) {
		
		/**
		 * BLOQUE DE DECLARACIÓN DE VARIABLES DE 'borrarFich'
		 * 
		 * 1. Clase File 'f' para introducir el fichero.
		 * 2. Variable String para almacenar la confirmación para eliminar el fichero.
		 */
		File f = null;
		String confirm;
		
		f = new File(nameF);
		
		/**
		 * BLOQUE DE ELIMINACIÓN DEL FICHERO.
		 * 
		 * El programa pregunta si de verdad queremos eliminar el fichero.
		 * Entra en un bucle 'do-while' en el cual si no se escoge una de las dos opciones, el programa repite el contenido.
		 * Según si se escoge 'S' o 'N', el programa eliminará o no el archivo y saldrá del bucle.
		 */
		System.out.println("Está seguro que desea eliminar "+f+"? (S/N)");
		do {
			confirm = sc.nextLine();
			if (confirm.equals("S")) {
				f.delete();
				System.out.println("El fichero "+f+" ha sido eliminado.");
			}
			else {
				if (confirm.equals("N")) {
					System.out.println("El fichero "+f+" no ha sido eliminado.");
				}
				else {
					System.out.println("Introduzca una opción válida (S/N):");
				}
			}
		} while (!confirm.equals("S") && !confirm.equals("N"));
	}
}