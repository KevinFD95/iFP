package es.ifp.programacion.uf2.ejerciciosResueltos;

/**
 * Definición de funciones
 * Llamadas a funciones desde el programa principal
 */

public class ejercicio3 {

	public static void main(String[] args) {
		
		//Variables
		
		int num1=10;
		int num2=4;
		int resultado;
		double random;
		
		//Transformación y salida de datos
		
		resultado = sumaDosNumeros(num1, num2);
		System.out.println("Resultado suma = "+resultado);
		
		resultado = restaDosNumeros(num1, num2);
		System.out.println("Resultado resta = "+resultado);
		
		resultado = multiDosNumeros(num1, num2);
		System.out.println("Resultado multiplicación = "+resultado);
		
		random = dameNumeroAleatorio();
		System.out.println("Número aleatorio = "+random);
		
	}

	//Funciones
	
	public static int sumaDosNumeros(int param1, int param2) {
		int result = param1+param2;
		return result;
	}
	
	public static int restaDosNumeros(int param1, int param2) {
		int result = param1-param2;
		return result;
	}
	
	public static int multiDosNumeros(int param1, int param2) {
		int result = param1*param2;
		return result;
	}
	
	public static double dameNumeroAleatorio() {
		return Math.random();
	}
}
