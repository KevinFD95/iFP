package es.ifp.programacion.uf5.datos.videotutoriales.V04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * LISTAS: ArrayList y LinkedList
 * 
 * Listas unidimensionales
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		System.out.println("=======================================================================");
		System.out.println(">>>>>>>> LISTAS - ARRAYLIST");
		
		//Es una implementacion de la interfaz List basado en arrays
		//Parecido a la clase Vector pero no está sincronizado.
		//Progresion lineal en las operaciones de tiempo.
		
		
		//DEFINICION CREACION, ACCESO, RECORRIDO Y ASIGNACION
		System.out.println("[LISTAS - ARRAYLIST] 1.- Crear un ArrayList");
		//Creamos un objeto ArrayList de elementos <String> con el constructor por defecto
		ArrayList<String> aList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String value;
		
		//Bucle do-while para introducir tantos valores como queramos en el ArrayList
		do {
			System.out.println("[LISTAS - ARRAYLIST] Introduzca el elemento a añadir (-1 para terminar):");
			value = sc.nextLine();
			//Si el valor que introducimos no es -1 entrara en el ArrayList y no se terminara el bucle 
			//en el while
			if (!value.equals("-1")) {
				aList.add(value);
			}
		} while (!value.equals("-1"));
		
		System.out.println("[LISTAS - ARRAYLIST] 2.- Recorrer un ArrayList con un bucle for");
		
		int size = aList.size();
		String tmp = null;
		
		//Recorremos el ArrayList con un bucle for, nos entregara todos los elementos de la lista
		for (int i=0;i<size;i++) {
			tmp = aList.get(i);
			System.out.print(tmp+" ");
		}
		System.out.println("\n");
		
		System.out.println("[LISTAS - ARRAYLIST] 3.- Recorrer un ArrayList con un iterador");
		
		//Defino el Iterador y lo obtengo del ArrayList
		//Otra manera de obtener los elementos del ArrayList
		//El Iterador es un objeto que nos entrega los elementos de una forma mas simple en
		//el codigo
		//El iterador tiene el mismo contenido que el ArrayList (<String>)
		Iterator<String> it = aList.iterator();
		
		//hasNext() devuelve true si hay elementos en el iterador por recorrer, falso sino
		//next() retorna el siguiente elemento en la lista
		//Con un bucle while podemos decirle que mientras hasNext sea true, que nos entregue el
		//siguiente valor de la lista
		//El iterador comprobara si hay un siguiente elemento y nos lo dara.
		while (it.hasNext()) {
			tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println("\n");
		
		System.out.println("[LISTAS - ARRAYLIST] 4.- Comprobar si existe un elemento en la lista");
		
		System.out.println("Introduzca la cadena para comprobar si existe en la lista");
		String palabra = sc.nextLine();
		
		//Pedimos al usuario un elemento y comprobamos si la lista contiene con el metodo contains
		//esa palabra que ha introducido el usuario
		if (aList.contains(palabra)) {
			System.out.println("La cadena "+palabra+" se encuentra en la lista");
		}
		else {
			System.out.println("La cadena "+palabra+" no se encuentra en la lista");
		}
		
		System.out.println("[LISTAS - ARRAYLIST] 5.- Eliminar un elemento del ArrayList");
		
		//Eliminamos un elemento a partir del indice que tiene en la lista, en este caso el 0.
		String elementoBorrado = aList.remove(0);
		System.out.println("Se ha borrado el elemento "+elementoBorrado);
		
		System.out.println("La lista actual es:");
		
		//Recorremos con el iterador, reiniciandolo aqui, la lista otra vez para comprobar que el indice 0 anterior
		//ha sido borrado
		Iterator<String> it2 = aList.iterator();
		while(it2.hasNext()) {
			tmp = it2.next();
			System.out.print(tmp+" ");
		}
		System.out.println("\n");
		
		System.out.println("[LISTAS - ARRAYLIST] 6.- Limpiamos el ArrayList");
		
		//Con el metodo clear eliminamos todos los elementos de una lsita
		aList.clear();
		
		System.out.println("[LISTAS - ARRAYLIST] 7.- Lista limpia");
		
		//Volvemos a comprobar con el iterador, siempre reiniciandolo, que la lista ha sido
		//borrada
		it = aList.iterator();
		while (it.hasNext()) {
			tmp = it.next();
			System.out.println(tmp+" ");
		}
		
		//Mostramos un mensaje con el tamaño de la lista actual
		//El tamaño deberia ser 0 si la lista ha sido borrada
		System.out.println("El tamaño de la lista es: "+aList.size());
		
		System.out.println("=======================================================================");
		
		System.out.println("=======================================================================");
		System.out.println(">>>>>>>> LISTAS - LINKEDLIST");
		
		//MISMO FUNCIONAMIENTO QUE EL ARRAYLIST PERO SE PUEDE RECORRER LA LISTA EN LOS DOS SENTIDOS
		/**
		 * LinkedList es una implementacion del interfaz List utilizando una lista doblemente enlazada
		 * Esto significa que el recorrido de la lista puede hacerse desde el principio o desde el final,
		 * encontrando el indice que se desea buscar de forma mas rapida que un ArrayList.
		 * 
		 * No esta sincronizado
		 */
		
		//DEFINICION, CREACION, ACCESO, RECORRIDO Y ASIGNACION
		System.out.println("[LISTAS - LINKEDLIST] 1.- Crear una LinkedList");
		
		LinkedList<String> dList = new LinkedList<String>();
		
		System.out.println("[LISTAS - LINKEDLIST] 2.- Añadir elementos");
		String elemento;
		
		do {
			System.out.println("Introduzca el valor para añadir a la lista (-1 para terminar):");
			elemento = sc.nextLine();
			if (!elemento.equals("-1")) {
				dList.add(elemento);
			}		
		} while (!elemento.equals("-1"));
		
		System.out.println("[LISTAS - LINKEDLIST] 3.- Obtenemos elementos con un bucle for");
		
		int size2 = dList.size();
		String tmp2;
		
		for (int i=0;i<size2;i++) {
			tmp2 = dList.get(i);
			System.out.print(tmp2+" ");
		}
		System.out.println("\n");
		
		System.out.println("[LISTAS - LINKEDLIST] 4.- Obtenemos elementos con un iterador");
		
		Iterator<String> itl = dList.iterator();
		
		while (itl.hasNext()) {
			tmp2 = itl.next();
			System.out.print(tmp2+" ");
		}
		System.out.println("\n");
		
		System.out.println("[LISTAS - LINKEDLIST] 5.- Comprobar si existe un elemento en la lista");
		
		System.out.println("Introduzca la palabra que quiere buscar en la lista:");
		String palabra2 = sc.nextLine();
		
		if (dList.contains(palabra2)) {
			System.out.println("La palabra "+palabra2+" esta en la lista");
		}
		else {
			System.out.println("La palabra "+palabra2+" no esta en la lista");
		}
		
		System.out.println("[LISTAS - LINKEDLIST] 6.- Eliminar un elemento de la lista");
		
		System.out.println("Introduzca que palabra desea eliminar de la lista:");
		
		String palabra3 = sc.nextLine();
		
		boolean palabraBorrada = dList.remove(palabra3);
		
		if (palabraBorrada) {
			System.out.println("La palabra "+palabra3+" ha sido eliminada");
		}
		else {
			System.out.println("La palabra "+palabra3+" no ha sido eliminada");
		}
		
		itl = dList.iterator();
		
		while (itl.hasNext()) {
			tmp2 = itl.next();
			System.out.print(tmp2+" ");
		}
		System.out.println("\n");
		
		System.out.println("[LISTAS - LINKEDLIST] 7.- Limpiar lista");
		
		dList.clear();
		
		if (dList.size() == 0) {
			System.out.println("La lista ha sido borrada");
			System.out.println("El tamaño de la lista actualmente es: "+dList.size());
		}
		sc.close();
	}
}