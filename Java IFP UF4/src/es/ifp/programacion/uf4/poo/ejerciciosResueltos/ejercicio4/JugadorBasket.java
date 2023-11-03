package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio4;

/**
 * CLASE EJERCICIOS RESUELTOS 4, 5, 6 Y 7: JUGADORBASKET
 * 
 * Clase hija de la clase Persona. Hereda los datos de la clase padre y muestra
 * un dato de ella misma además.
 * 
 * Interface implementada que obliga a implementar el método que contiene.
 * 
 * Datos:
 * super(nombre, apellidos, dni)
 * int dorsal
 * 
 * Constructor con todos los datos de la clase padre y ella misma
 * 
 * Métodos get, set y toString
 * Método impuesto por la interface
 */

public class JugadorBasket extends Persona implements ICompitiendo {

	//ATRIBUTOS
	
	private int dorsal;
	
	//CONSTRUCTORES
	
	public JugadorBasket(String nombre, String apellidos, String dni, int dorsal) {
		super(nombre, apellidos, dni);
		this.dorsal = dorsal;
	}
	
	//METODOS
	/**
	 * Metodo get con el dorsal del jugador de basket
	 * @return dorsal un int con el numero de dorsal del jugador
	 */
	public int getDorsal() {
		return this.dorsal;
	}
	/**
	 * Metodo set que cambia el dorsal del jugador
	 * @param nuevoDorsal un int con el nuevo dorsal del jugador
	 */
	public void setDorsal(int nuevoDorsal) {
		this.dorsal = nuevoDorsal;
	}
	
	/**
	 * Metodo toString que reune los datos de la clase padre y de esta del jugador
	 * @return un String con todos los datos del jugador
	 */
	public String toString() {
		return  super.toString()+"\n"+
				"Dorsal: "+this.getDorsal();
	}
	
	/**
	 * Metodo impuesto por la Interface
	 * Muestra si el jugador está compitiendo o no
	 */
	public void compitiendo() {
		System.out.println(this.getNombre()+" "+this.getApellidos()+", jugador de baloncesto, está compitiendo.");
	}
}
