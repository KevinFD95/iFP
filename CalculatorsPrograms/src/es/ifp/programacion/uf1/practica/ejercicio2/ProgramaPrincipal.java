package es.ifp.programacion.uf1.practica.ejercicio2;

import java.util.Scanner;

/**
 * EJERCICIO PRÁCTICO EVALUABLE UF1 / UF2 - CALCULADORA CON FUNCIONES
 * 
 * Este ejercicio es el programa de una calculadora para una empresa de gestión de aguas.
 * Esta calculadora no tiene interfaz gráfica, se ejecuta en consola y se selecciona una opción del menú
 * o se introducen datos a partir del teclado según lo requiera el programa.
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		/**
		 * BLOQUE DE DECLARACIÓN E INICIALIZACIÓN DE VARIABLES
		 * 
		 * Introducimos todas las variables que van a ser utilizadas en el programa:
		 * 
		 * 1. Se introducen las variables de Scanner para que el usuario pueda introducir valores a través del teclado
		 * y String como variable selectora del menú.
		 * 2. Se introducen las variables que almacenarán valores para calcular. Variables de tipo float para todos los 
		 * casos excepto el 'case 5' y una variable de tipo entero para el 'case 5', el cálculo del factorial.
		 * 3. Finalmente, una variable de tipo float donde almacenar el resultado 'result'.
		 */
		
		//1
		Scanner sc = new Scanner(System.in);
		String opcion;
		//2
		float num1=0.0f;
		float num2=0.0f;
		int num3=0;
		//3
		float result;
		
		/**
		 * BLOQUE DE SELECCIÓN DEL MENÚ
		 * 
		 * En este bloque introducimos el menú de nuestra calculadora dentro de un bucle 'do-while'
		 * para que se repita el programa siempre y cuando el usuario no introduzca la opción de salida.
		 */
		
		do {
			
			/**
			 * MENÚ DE LA CALCULADORA
			 * 
			 * Mostramos en consola el menú de la calculadora al inicio del programa y se repetirá después
			 * de cada cálculo que haga el usuario.
			 * 
			 * Una vez mostrado el menú de la calculadora, el usuario podrá introducir un dato que se almacenará
			 * en la variable de tipo String 'opcion' para su uso posterior.
			 */
			
			System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");
			System.out.println(" ");
			System.out.println("Introduzca una opción del menú:");
			System.out.println(" ");
			System.out.println("1. Sumar (+)");
			System.out.println("2. Restar (-)");
			System.out.println("3. Multiplicar (*)");
			System.out.println("4. Dividir (/)");
			System.out.println("5. Factorial (!)");
			System.out.println("0. Salir (S o s)");
			System.out.println(" ");
			System.out.println("Introduzca opción:");
			opcion = sc.nextLine();
			
			/**
			 * BLOQUE DE ENTRADA, TRANSFORMACIÓN Y SALIDA DE DATOS
			 * 
			 * En este bloque introducimos la entrada, transformación y salida de los datos en cada caso que utilizamos
			 * en el programa.
			 * 
			 * El código en este bloque comienza con un switch para crear cada opción del menú seleccionada anteriormente. 
			 * El programa leerá la variable 'opcion' para escoger el 'case' específico del 'switch' y resolver el código 
			 * en cada caso. Si 'opcion' no es ninguno de los casos del 'switch', se resolverá el 'default', la
			 * 'Opción incorrecta'.
			 */
			
			switch (opcion) {
			
			case "1", "+":
				/**
				 * CASE SUMAR
				 * 
				 * Cuando 'opcion' es igual a '1' o '+', el programa entra en este 'case' y se le pide al usuario que 
				 * introduzca los valores de 'num1' y 'num2'.
				 * 
				 * Con esos dos valores, el programa hace una llamada a la función 'sumar' escrita al final del programa
				 * para que resuelva el cálculo correspondiente y devuelva un valor a la variable de tipo float 'result'.
				 * 
				 * Una vez resuelto el 'case', el programa volverá a mostrar el principio del bucle 'do-while'.
				 */
				System.out.println("Sumar"); 
				System.out.println("Introduzca el primer número a operar:");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("Introduzca el segundo número a operar:");
				num2 = Float.parseFloat(sc.nextLine());
				result = sumar(num1, num2);
				System.out.println("===================================");
				System.out.println("La suma de "+num1+" y "+num2+" es "+result);
				System.out.println("===================================");
			break;
			case "2", "-":
				/**
				 * CASE RESTAR
				 * 
				 * Cuando 'opcion' es igual a '2' o '-', el programa entra en este 'case' y se le pide al usuario que 
				 * introduzca los valores de 'num1' y 'num2'.
				 * 
				 * Con esos dos valores, el programa hace una llamada a la función 'restar' escrita al final del programa
				 * para que resuelva el cálculo correspondiente y devuelva un valor a la variable de tipo float 'result'.
				 * 
				 * Una vez resuelto el 'case', el programa volverá a mostrar el principio del bucle 'do-while'.
				 */
				System.out.println("Restar"); 
				System.out.println("Introduzca el primer número a operar:");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("Introduzca el segundo número a operar:");
				num2 = Float.parseFloat(sc.nextLine());
				result = restar(num1, num2);
				System.out.println("===================================");
				System.out.println("La resta de "+num1+" y "+num2+" es "+result);
				System.out.println("===================================");
			break;
			case "3", "*":
				/**
				 * CASE MULTIPLICAR
				 * 
				 * Cuando 'opcion' es igual a '3' o '*', el programa entra en este 'case' y se le pide al usuario que 
				 * introduzca los valores de 'num1' y 'num2'.
				 * 
				 * Con esos dos valores, el programa hace una llamada a la función 'multiplicar' escrita al final del programa
				 * para que resuelva el cálculo correspondiente y devuelva un valor a la variable de tipo float 'result'.
				 * 
				 * Una vez resuelto el 'case', el programa volverá a mostrar el principio del bucle 'do-while'.
				 */
				System.out.println("Multiplicar"); 
				System.out.println("Introduzca el primer número a operar:");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("Introduzca el segundo número a operar:");
				num2 = Float.parseFloat(sc.nextLine());
				result = multiplicar(num1, num2);
				System.out.println("===================================");
				System.out.println("La multiplicación de "+num1+" y "+num2+" es "+result);
				System.out.println("===================================");
			break;
			case "4", "/":
				/**
				 * CASE DIVIDIR
				 * 
				 * Cuando 'opcion' es igual a '4' o '/', el programa entra en este 'case' y se le pide al usuario que 
				 * introduzca los valores de 'num1' y 'num2'.
				 * 
				 * Con esos dos valores, el programa hace una llamada a la función 'dividir' escrita al final del programa
				 * para que resuelva el cálculo correspondiente y devuelva un valor a la variable de tipo float 'result'.
				 * 
				 * Una vez resuelto el 'case', el programa volverá a mostrar el principio del bucle 'do-while'.
				 */
				System.out.println("Dividir"); 
				System.out.println("Introduzca el primer número a operar:");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("Introduzca el segundo número a operar:");
				num2 = Float.parseFloat(sc.nextLine());
				result = dividir(num1, num2);
				System.out.println("===================================");
				System.out.println("La división de "+num1+" y "+num2+" es "+result);
				System.out.println("===================================");
			break;
			case "5", "!":
				/**
				 * CASE DIVIDIR
				 * 
				 * Cuando 'opcion' es igual a '5' o '!', el programa entra en este 'case' y se le pide al usuario que 
				 * introduzca el valor de 'num3'.
				 * 
				 * Con ese valor, el programa hace una llamada a la función 'factorial' escrita al final del programa
				 * para que resuelva el cálculo correspondiente y devuelva un valor a la variable de tipo entero 'result'.\
				 * 
				 * Una particularidad del cálculo factorial es que no puede hacerse de números negativos o '0', así que
				 * con un while se hace repetir la entrada del
				 * 
				 * Una vez resuelto el 'case', el programa volverá a mostrar el principio del bucle 'do-while'.
				 */
					System.out.println("Factorial"); 
					System.out.println("Introduzca el número entero a operar:");
					num3 = Integer.parseInt(sc.nextLine());
					while (num3<=0) {
					System.out.println("Error, valor no válido. Introduzca un valor superior a 0");
					num3 = Integer.parseInt(sc.nextLine());
					}
					result = factorial(num3);
					System.out.println("===================================");
					System.out.println("La factorial de "+num3+" es "+result);
					System.out.println("===================================");
			break;
			case "0", "s", "S":
				/**
				 * CASE SALIR
				 * 
				 * Cuando 'opcion' es igual a '0' o 's' o 'S', el programa entra en este 'case' y el programa mostrará 
				 * únicamente el mensaje de la opción "Salir" y saldrá del bucle 'do-while', con lo que finalizará el
				 * programa.
				 */
				System.out.println("Salir");
			break;
			default:
				/**
				 * DEFAULT
				 * 
				 * Cuando 'opcion' no coincide con ninguno de los valores de cada caso, el programa entra en este 'case' y se
				 * mostrará el mensaje siguiente.
				 * 
				 * Una vez resuelto el 'case', el programa volverá a mostrar el principio del bucle 'do-while'.
				 */
				System.out.println("Opción incorrecta");
			break;
			}
			/**
			 * CONDICIÓN DE SALIDA DEL BUCLE
			 * 
			 * El programa se mantendrá en bucle mientras la variable 'opcion' no sea '0' y no sea 's' y no sea 'S'.
			 * Si la variable 'opcion' es uno de los valores anteriores, un valor del caso de salida, el 'while' es falso y
			 * el bucle se termina.
			 */
		} while (!opcion.equals("0") && !opcion.equals("s") && !opcion.equals("S"));
		/**
		 * CIERRE DEL PROGRAMA
		 * 
		 * Se mostrará un mensaje de cierre del programa una vez el bucle termine y cerramos la variable 'sc' del Scanner, 
		 * ya que no se utilizará más.
		 */
		System.out.println("El programa ha finalizado");
		sc.close();
	}
	
	/**
	 * CONSTRUCCIÓN DE FUNCIONES
	 * 
	 * Cada función escrita a continuación obtendrá los valores introducidos en el 'case' dónde es llamada y devolverá el 
	 * resultado del cálculo a la variable 'result'.
	 */
	
	/**
	 * FUNCIÓN SUMAR
	 * 
	 * En esta función resolvemos la suma entre los valores introducidos en el 'case 1'.
	 * 'num1' y 'num2' serán introducidos en 'param1' y 'param2' como variables de tipo float yse devolverá la variable 
	 * 'resultado' de la función, también de tipo float, como valor a la variable 'result' del
	 * 'case'.
	 */
	
	public static float sumar(float param1, float param2) {
		
		float resultado = param1+param2;
		return resultado;
		
	}
	
	/**
	 * FUNCIÓN RESTAR
	 * 
	 * En esta función resolvemos la resta entre los valores introducidos en el 'case 2'.
	 * 'num1' y 'num2' serán introducidos en 'param1' y 'param2' como variables de tipo float yse devolverá la variable 
	 * 'resultado' de la función, también de tipo float, como valor a la variable 'result' del
	 * 'case'.
	 */
	
	public static float restar(float param1, float param2) {
		
		float resultado = param1-param2;
		return resultado;
		
	}
	
	/**
	 * FUNCIÓN MULTIPLICAR
	 * 
	 * En esta función resolvemos la multiplicación entre los valores introducidos en el 'case 3'.
	 * 'num1' y 'num2' serán introducidos en 'param1' y 'param2' como variables de tipo float yse devolverá la variable 
	 * 'resultado' de la función, también de tipo float, como valor a la variable 'result' del
	 * 'case'.
	 */
	
	public static float multiplicar(float param1, float param2) {
		
		float resultado = param1*param2;
		return resultado;
		
	}

	/**
	 * FUNCIÓN DIVIDIR
	 * 
	 * En esta función resolvemos la división entre los valores introducidos en el 'case 4'.
	 * 'num1' y 'num2' serán introducidos en 'param1' y 'param2' como variables de tipo float yse devolverá la variable 
	 * 'resultado' de la función, también de tipo float, como valor a la variable 'result' del
	 * 'case'.
	 */
	
	public static float dividir(float param1, float param2) {
		
		float resultado = param1/param2;
		return resultado;
		
	}
	
	/**
	 * FUNCIÓN FACTORIAL
	 * 
	 * En esta función resolvemos el factorial del valor introducido en el 'case 5'.
	 * 'num3' será introducido en 'n' como variable de tipo int y se calculará el factorial siempre y cuando el valor no 
	 * sea 1.
	 * 
	 * El valor de 'num3' no puede ser negativo o '0', por lo tanto, siempre llegará un número mayor o igual a 1.
	 * 
	 * Se utilizará un if-else para que: cuando el valor de 'n' sea 1, se devolverá el propio número según la definición 
	 * del factorial. En caso contrario se calculará el factorial del número introducido con el cálculo correspondiente a 
	 * éste. Una función recursiva donde en el 'else' la función se llama a sí misma y entra en bucle. 
	 * 
	 * Cuando 'n' finalmente es '1', sale del bucle y vuelve al 'case' con el resultado acumulado del bucle.
	 */
	
	public static int factorial(int n) {
		
		if (n == 1) {
			return 1;
		}
		else {
			return n * factorial(n - 1);
		}
	}
}
