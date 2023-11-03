package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio4;

/**
 * CLASE EJERCICIOS RESUELTOS 4, 5, 6 Y 7: NADADOR
 * 
 * Clase hija de la clase Persona. Hereda los datos de la clase padre y muestra
 * datos de ella misma además.
 * 
 * Interface implementada que obliga a implementar el método que contiene.
 * 
 * Datos:
 * super(nombre, apellidos, dni)
 * float altura
 * float peso
 * 
 * Constructor con todos los datos de la clase padre y ella misma
 * 
 * Métodos get, set y toString
 * Método impuesto por la interface
 */

public class Nadador extends Persona implements ICompitiendo {

	//ATRIBUTOS
	
	private float altura;
	private float peso;
	
	//CONSTRUCTORES
	
	public Nadador(String nombre, String apellidos, String dni, float altura, float peso) {
		super(nombre, apellidos, dni);
		this.altura = altura;
		this.peso = peso;
	}
	
	//METODOS

	/**
	 * Metodo get que devuelve la altura del nadador
	 * @return altura un float con la altura del nadador
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * Metodo set que cambia la altura del nadador
	 * @param nuevaAltura un float con la nueva altura del nadador
	 */
	public void setAltura(float nuevaAltura) {
		this.altura = nuevaAltura;
	}

	/**
	 * Metodo get que devuelve el peso del nadador
	 * @return peso un float con el peso del nadador
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * Metodo set que cambia el peso del nadador
	 * @param nuevoPeso un float con el nuevo peso del nadador
	 */
	public void setPeso(float nuevoPeso) {
		this.peso = nuevoPeso;
	}
	
	/**
	 * Metodo toString que reune todos los datos del nadador
	 * @return un String con los datos del nadador de la clase padre y esta clase.
	 */
	public String toString() {
		return  super.toString()+"\n"+
				"Altura: "+this.getAltura()+"\n"+
				"Peso: "+this.getPeso();
	}
	
	/**
	 * Metodo impuesto por el Interface
	 */
	public void compitiendo() {
		System.out.println(this.getNombre()+" "+this.getApellidos()+", nadador, está compitiendo.");
	}
}