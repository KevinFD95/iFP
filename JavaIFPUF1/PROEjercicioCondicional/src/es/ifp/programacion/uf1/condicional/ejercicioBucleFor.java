package es.ifp.programacion.uf1.condicional;

/**
 * Ejemplo de bucle-for en Java imprimiendo los números
 * Un contador desde un número inicial, con un paso determinado
 * hasta determinado número
 */

public class ejercicioBucleFor {

	public static void main(String[] args) {
		
		//Se puede declarar e inicializar dentro del for de esta manera
		//for (int i=0;i<=10;i++)
		//Se inicia dentro del for si no utilizamos la variable anteriormente
		//El orden es diferente a PSeINT: num inicial; num final; paso
		
		for (int i=2;i<=10;i=i+2) {
			System.out.println("Contador: "+i);
		}
		
	}

}
