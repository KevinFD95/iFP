package es.ifp.programacion.uf5.datos.videotutoriales.V05;

/**
 * Estructuras de datos - Listas: HashTable y HashMap
 */

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		System.out.println("=====================================================");
		System.out.println(">>>>>>>>>>>>>>>> LISTAS - HASHTABLE");
		
		/**
		 * Estructura de pares clave-valor
		 * No admite null como valor ni clave
		 * No mantiene el orden de insercion
		 * Esta sincronizada
		 */
		
		System.out.println("[HASHTABLE] 1.- Creamos una tabla hash de pares String-String");
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		Scanner sc = new Scanner(System.in);
		
		String k;
		String v;
		
		do {
			System.out.println("Introduzca la clave:");
			k = sc.nextLine();
			System.out.println("Introduzca el valor (-1 para salir):");
			v = sc.nextLine();
			if (!v.equals("-1")) {
				hashTable.put(k, v);
			}
		} while (!v.equals("-1"));
		
		System.out.println("[HASHTABLE] 2.- Recorremos el HashTable con Enumerations");
		
		//ENUMERATIONS
		//Puedes recoger de una tabla bidireccional (HashTable) a una lista unidireccional
		//Pasamos todos los elementos de k a una lista y v a otra
		
		Enumeration<String> keys;
		Enumeration<String> values;
		
		values = hashTable.elements(); //Saco los valores de la hash y las paso a un Enumeration
		
		keys = hashTable.keys(); //Saco las claves de la hash y las paso a un Enumeration
		
		String clave;
		String valor;
		
		while (keys.hasMoreElements()) {
			clave = keys.nextElement();
			valor = values.nextElement();
			System.out.println("Clave: "+clave+" Valor: "+valor);
		}
		
		System.out.println("[HASHTABLE] 3.- Obtener un valor de HashTable");
		
		System.out.println("Introduzca la clave del valor que quiere obtener");
		String op = sc.nextLine();
		
		System.out.println("El valor de la clave "+op+" es: "+hashTable.get(op));
		
		//Se pueden usar metodos para borrar un elemento, limpiar lista, etc. como ArrayList, LinkedList, etc.
		
		System.out.println("=====================================================");
		System.out.println(">>>>>>>>>>>>>>>> LISTAS - HASHMAP");
		
		/**
		 * Estructura de pares clave-valor
		 * Permite nulls en claves y valores
		 * Tiempo constante en funcion del numero de elementos que vamos teniendo
		 * 
		 * No esta sincronizada
		 */
		
		System.out.println("[HASHMAP] 1.- Creamos una tabla HashMap de pares String-String");
		
		HashMap<String, String> map = new HashMap<String, String>();
		String clave2;
		String valor2;
		
		do {
			System.out.println("Introduzca clave para añadir al HashMap:");
			clave2 = sc.nextLine();
			System.out.println("Introduzca clave para añadir al HashMap (-1 para salir):");
			valor2 = sc.nextLine();
			
			if (!valor2.equals("-1")) {
				map.put(clave2, valor2);
			}
		} while (!valor2.equals("-1"));
		
		System.out.println("[HASHMAP] 2.- Recorremos el HashMap");
		
		for (String elemento : map.keySet()) {
			System.out.println("Clave: "+elemento+", Valor: "+map.get(elemento));
		}
		
		System.out.println("[HASHMAP] 3.- Borrado de elemento por su clave");
		
		System.out.println("Introduzca la clave del elemento que quiere borrar:");
		clave2 = sc.nextLine();
		
		String valorBorrado = map.remove(clave2);
		
		System.out.println("El valor borrado es: "+valorBorrado);
		
		for (String elemento : map.keySet()) {
			System.out.println("Clave: "+elemento+", Valor: "+map.get(elemento));
		}
		sc.close();
	}
}
