package es.ifp.programacion.uf5.datos.videotutoriales.V07;

/**
 * Clases y metodos genericos: Clase generica Maleta
 */

import java.util.ArrayList;

/**
 * Creacion de clase Maleta, clase generica
 * @param <T> parametro que convierte a la clase en generica
 */
public class Maleta <T> {

	//Creamos un atributo de tipo ArrayList con el parametro <T> para convertirlo en generico
	private ArrayList<T> contenido = new ArrayList<T>();
	
	//Creamos un metodo generico que añade objetos genericos (T objeto)
	public void add(T objecto) {
		contenido.add(objecto);
	}
	
	//Creamos un metodo que devuelve un ArrayList generico con el elemento <T>
	public ArrayList<T> getProducts(){
		return this.contenido;
	}
}
