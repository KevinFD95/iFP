package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio4;

/**
 * CLASE EJERCICIOS RESUELTOS 4, 5, 6 Y 7: JUGADORFUTBOL
 * 
 * Clase hija de la clase Persona. Hereda los datos de la clase padre y muestra
 * un dato de ella misma además.
 * 
 * Interface implementada que obliga a implementar el método que contiene.
 * 
 * Datos:
 * super(nombre, apellidos, dni)
 * boolean inter
 * 
 * Constructor con todos los datos de la clase padre y ella misma
 * 
 * Métodos esInter, set y toString
 * Método impuesto por la interface
 */

public class JugadorFutbol extends Persona implements ICompitiendo {
	
	//ATRIBUTOS
	
	private boolean inter;
	
	//CONSTRUCTORES
	
	public JugadorFutbol(String nombre, String apellidos, String dni, boolean inter) {
		super(nombre, apellidos, dni);
		this.inter = inter;
	}
	
	//METODOS

	/**
	 * Metodo esInter que devuelve true si el jugador es internacional o
	 * false si no lo es
	 * @return inter un booleano con true o false
	 */
	public boolean esInter() {
		return inter;
	}

	/**
	 * Metodo set que cambia si el jugador es o no internacional
	 * @param nuevoInter un booleano si el jugador es o no internacional
	 */
	public void setInter(boolean nuevoInter) {
		this.inter = nuevoInter;
	}

	/**
	 * Metodo toString que devuelve los datos del jugador y si es o no internacional
	 * @return un String con los datos del jugador de la clase padre y la propia
	 */
	public String toString() {
		if (this.esInter()) {
			return super.toString()+"\n"+"Es jugador internacional";
		}
		else {
			return super.toString()+"\n"+"NO es jugador internacional";
		}
	}
	
	/**
	 * Metodo impuesto por el Interface
	 */
	public void compitiendo() {
		System.out.println(this.getNombre()+" "+this.getApellidos()+", futbolista, está compitiendo.");
	}
}
