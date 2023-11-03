package es.ifp.programacion.uf5.datos.videotutoriales.V01;

/**
 * Creacion de arrays unidimensionales
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		System.out.println("=================ARRAYS=================");
		
		/**
		 * DEFINICION DE UN ARRAY
		 * Definimos un array de enteros int con [] para contener enteros.
		 */
		int[] arrayEnteros;
		
		/**
		 * DEFINICION E INICIALIZACION DE ARRAY DE CARACTERES
		 * Definimos un array de caracteres char con [] para contener caracteres.
		 */
		//char[] arrayCaracteres = {'a', 'e', 'i', 'o', 'u'};
		
		/**
		 * CONSTRUIR UN ARRAY
		 * Inicializamos el array con un valor para el indice. Cuantos valores 
		 * almacena el array.
		 */
		arrayEnteros = new int[10];
		
		/**
		 * ASIGNACION DE VALORES
		 * Asignamos valores a dos indices o posiciones diferentes del array
		 * Siempre empieza por el indice 0 hasta n-1, siendo n el numero
		 * total de valores del array.
		 */
		arrayEnteros[0] = 3;
		arrayEnteros[9] = 9;
		
		System.out.println("Recorrido de un array");
		
		/**
		 * RECORRER UN ARRAY
		 * Nos da los valores que contiene el array segun el indice de
		 * cada valor.
		 * 
		 * Usamos un bucle for porque sabemos la cantidad de valores que hay.
		 */
		
		for (int i=0;i<arrayEnteros.length;i++) {
			System.out.println("Indice: "+i+", Valor: "+arrayEnteros[i]);
		}
		
		//Genera excepcion ya que salgo fuera del ragon del array.
		//Si nos salimos del rango nos da un error.
		try {
			System.out.println("Acesso a una posicion incorrecta");
			System.out.println("Indice 12: "+arrayEnteros[10]);
		}
		catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR: Acceso a indice fuera de rango");
		}
		
		//USO DE FUNCIONES PARA CREAR UN ARRAY, INICIALIZARLO E IMPRIMIRLO
		System.out.println("Creamos, inicializamos e imprimimos un array");
		arrayEnteros = creaInicializaArray(20, 1);
		
		imprimeArray(arrayEnteros);
		
		System.out.println("========================================");
		System.out.println("===============FIN ARRAYS===============");
	}
	
	/**
	 * METODO QUE IMPRIME UN ARRAY
	 * @param array Array de enteros
	 */
	public static void imprimeArray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.println("Indice: "+i+", Valor: "+array[i]);
		}
	}

	/**
	 * METODO QUE CREA UN ARRAY
	 * @param size int con el tamaño del array
	 * @return un array con el tamaño indicado
	 */
	public static int[] creaArray(int size) {
		return new int[size];
	}
	
	/**
	 * METODO QUE CREA E INICIALIZA UN ARRAY
	 * @param size int con el tamaño del array
	 * @param valorInicial int con el valor inicial del array
	 * @return un array con el tamaño y valor inicial indicados
	 */
	public static int[] creaInicializaArray(int size, int valorInicial) {
		int[] tmp = new int[size];
		
		for (int i=0;i<tmp.length;i++) {
			tmp[5] = valorInicial;
		}
		return tmp;
	}
}