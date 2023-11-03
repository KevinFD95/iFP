package es.ifp.programacion.uf4.poo.ejerciciosResueltos.ejercicio4;

/**
 * CLASE EJERCICIOS RESUELTOS 4, 5, 6 Y 7: ENTRENADOR
 * 
 * Clase hija de la clase Persona. Hereda los datos de la clase padre y muestra
 * un dato de ella misma además.
 * 
 * Datos
 * super(nombre, apellidos, dni)
 * int aExp
 * 
 * Constructor con todos los datos de la clase padre y la propia
 * 
 * Métodos get, set y toString
 */

public class Entrenador extends Persona {
	
	//ATRIBUTOS
	
	private int aExp;
	
	//CONSTRUCTORES
	
	public Entrenador(String nombre, String apellidos, String dni, int aExp) {
		super(nombre, apellidos, dni);
		this.aExp = aExp;
	}
	
	//METODOS

	/**
	 * Metodo get que devuelve los años de experiencia del entrenador
	 * @return aExp un int con los años de experiencia del entrenador
	 */
	public int getExp() {
		return this.aExp;
	}
	/**
	 * Metodo set que cambia los años de experiencia del entrenador
	 * @param nuevaExp un int con los nuevos años de experiencia del entrenador
	 */
	public void setExp(int nuevaExp) {
		this.aExp = nuevaExp;
	}
	
	/**
	 * Metodo toString que devuelve un String que reune los datos de la clase padre 
	 * y los años de experiencia del entrenador
	 * 
	 * @return un String con todos los datos del entrenador
	 */
	public String toString() {
		return  super.toString()+"\n"+
				"Años de experiencia: "+this.getExp();
	}
}
