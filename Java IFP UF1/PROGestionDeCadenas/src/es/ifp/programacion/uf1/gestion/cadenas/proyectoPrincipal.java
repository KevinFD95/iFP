package es.ifp.programacion.uf1.gestion.cadenas;

/**
 * Ejercicio de ejemplo de la clase 'String' para el uso y la gestión de cadenas
 */

public class proyectoPrincipal {

	public static void main(String[] args) {

		//Creación de cadena
		
		String cadena = "MUSICA";
		boolean tmp;
		int size;
		int i;
		String parte;
		char letra;
		String tipo;
		
		System.out.println("Llamadas a funciones de la clase String");
		System.out.println("=======================================");
		
		//Llamada de funciones, nombreDeLaVariable.funcion();
		
		tmp = cadena.isEmpty();													//Comprueba si la cadena esta vacía o no, respuesta booleana
		System.out.println("La cadena esta vacía? "+tmp);						
		
		size = cadena.length();													//Nos indica la longitud de la cadena, desde 0 a la posición del último carácter
		System.out.println("La longitud de la cadena es: "+size);
		
		tmp = cadena.endsWith("CA");											//Comprueba si es cierto que el final de la cadena son los carácteres que le introducimos
		System.out.println("La cadena termina por CA: "+tmp);
		
		parte = cadena.substring(2,4);											//Crea una cadena dentro de la propia cadena con los carácteres de las posiciones que indicamos
		System.out.println("Dame las posiciones 2 y la anterior a 4: "+parte);
		
		letra = cadena.charAt(3);												//Localiza el carácter de la posición indicada
		System.out.println("El caracter en posicion 3 es: "+letra);
		
		tipo = cadena.concat(" ELECTRÓNICA");									//Añade una cadena como sufijo a la cadena inicial
		System.out.println("El tipo es: "+tipo);
		
		//El equal comprueba, en este caso, que la cadena 'cadena' y la cadena 'parte' sean iguales
		//El valor es booleano y por tanto puede ir en el interior de un 'if'
		if (cadena.equals(parte))
			System.out.println("Las dos cadenas son iguales");
		else
			System.out.println("Las dos cadenas son diferentes");
		
		//Recorrer la variable 'cadena' con 'while'
		
		i=0;
		char c; //Variable que recoge cada uno de los carácteres de la cadena
		
		System.out.println("==============================");
		System.out.println("Escritura de la cadena "+cadena);
		System.out.println("==============================");
		
		//En el while, siempre que 'i' sea más pequeño a 'size' (el tamaño de la cadena), se repetirá el bucle
		while (i<size) {
			c = cadena.charAt(i);	//En esta línea se recoge el valor de c según la posición de la cadena
			//El print escribe los valores en la misma línea, el println los escribe en cada línea por separado
			System.out.print(c);	//Se imprime el valor de 'c' en cada línea mientras dure el bucle
			i++;					//Para evitar un bucle infinito y recoger cada carácter de la cadena, se aumenta en 1 el valor de i cada bucle que pasa
		}
		
		System.out.println(" ");
		System.out.println("==============================");
		
		//Recorremos la variable 'cadena' con bucle 'for'
		
		//Imprimimos el carácter 'c' correspondiente a cada valor de 'j'
		//En el 'for' ya indicamos cada paso por el bucle con el final (j++), no debemos indicarlo al final del bucle como en el 'while'
		for(int j=0;j<size;j++) { 
			c = cadena.charAt(j);
			System.out.print(c);
		}
		
		System.out.println(" ");
		System.out.println("=================================");
		System.out.println("Mostrar la cadena MUSICA al revés");
		System.out.println("=================================");
		
		//Mostrar la cadena al revés con un 'for'
		for(int k=size-1;k>=0;k--) {
			c = cadena.charAt(k);
			System.out.print(c);
		}
		
		System.out.println(" ");
		System.out.println("=======================================");
		System.out.println("Convertir la cadena MUSICA a minúsculas");
		System.out.println("=======================================");
		
		//Convertir los carácteres a minúscula
		String minus = cadena.toLowerCase();
		System.out.print(minus);
		
		System.out.println(" ");
		System.out.println("=======================================");
		System.out.println("Convertir la cadena musica a mayúsculas");
		System.out.println("=======================================");
		
		//Convertir los carácteres a mayúsculas
		String mayus = minus.toUpperCase();
		System.out.print(mayus);
		
	}

}
