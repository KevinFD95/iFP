package es.ifp.programacion.uf2.modular;

public class ejercicioProgramacionModular {

	public static void main(String[] args) {
		
		/**
		 * Declaración e inicialización de variables
		 */
		int num=10;
		int num2=20;
		int resultado;
		
		//Llamo a la función sumaDosNumeros
		resultado = sumaDosNumeros(num, num2);
		
		System.out.println("El resultado de la suma num1 y num2 es "+resultado);
		
		//Llamo al procedimiento procEscribeNumero
		procEscribeNumero(33);
		
		//Llamo al procedimiento procEscribeHola
		procEscribeHola();
		
		//Llama a la funcion funcRetornaNumero
		resultado = funcRetornaNumero();
		System.out.println("El valor retornado por la funcion funcRetornaNumero es "+resultado);
	}
	
	/**
	 * Funcion que dados dos números realiza la suma de ellos
	 * @return un int con la suma de los dos números
	 */
	
	public static int sumaDosNumeros(int param1, int param2) { //Salida de la función de un int con la entrada de 2 argumentos o parámetros
		int result;
		result = param1+param2;
		//Retorna la variable result ya que es el mismo tipo introducido en la función, tiene que coincidir con la definición de la función
		return result; //En una función (donde definimos la salida 'int' en este caso) debemos utilizar siempre 'return'
	}
	
	/**
	 * Procedimiento que escribe en consola el valor pasado como parámetro o argumento.
	 * @param param1 valor entero que entra en la función y se imprime en consola
	 */
	
	public static void procEscribeNumero(int param1) {
		
		System.out.println("El valor pasado a procEscribeNumero es: "+param1);
	}
	
	/**
	 * Un procedimiento que escribe en consola
	 */
	
	public static void procEscribeHola() {
		System.out.println("Hola");
	}
	
	/**
	 * Función que retorna el valor 44
	 * @return un entero con valor 44
	 */
	
	public static int funcRetornaNumero() {
		return 44;
	}
	
}
