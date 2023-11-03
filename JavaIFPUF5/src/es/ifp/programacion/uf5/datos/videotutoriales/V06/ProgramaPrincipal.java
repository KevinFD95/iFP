package es.ifp.programacion.uf5.datos.videotutoriales.V06;

/**
 * Estructuras de datos: HashSet, TreeSet y TreeMap
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		System.out.println("================================================");
		System.out.println(">>>>>>>>>> SET");
		
		/**
		 * Implementa la interfaz Set.
		 * Permite elementos null.
		 * No permite duplicados.
		 * No se garantiza el orden de insercion.
		 * No esta sincronizada.
		 */
		
		System.out.println("[HASHSET] 1.- Creamos un set con un HashSet");
		
		HashSet<Object> set = new HashSet<Object>(100);
		
		System.out.println("[HASHSET] 2.- Rellenamos con elementos (0-99)");
		
		for (int i=0;i<100;i++) {
			set.add(i);
		}
		
		System.out.println("[HASHSET] 2.- Rellenamos con elementos (0-99)");
		
		Iterator<Object> it = set.iterator();
		
		Object obj;
		
		while (it.hasNext()) {
			obj = it.next();
			System.out.println("Elemento: "+obj);
		}
		
		System.out.println("================================================");
		System.out.println(">>>>>>>>>> TREEMAP - TREESET");
		
		/**
		 * Mantiene el orden de insercion
		 * Estructura en arbol
		 */
		
		TreeMap<String, String> tMap = new TreeMap<String, String>(); //Multidimensional
		
		TreeSet<String> tSet = new TreeSet<String>(); //Unidimensional
		
		//Mismos metodos que HashMap o HashSet
	}

}
