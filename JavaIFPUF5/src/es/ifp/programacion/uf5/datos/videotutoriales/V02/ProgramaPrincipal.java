package es.ifp.programacion.uf5.datos.videotutoriales.V02;

/**
 * Creacion de arrays unidirecionales: Vectores
 */

import java.util.Vector;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//DEFINICION DE UN VECTOR
				Vector<String> v;
				Vector<String> vString;
				
				//CONSTRUCCION DE UN VECTOR
				v = new Vector<String>();
				//CONSTRUCTOR CON TAMAÑO INICIAL Y CAPACIDAD DE INCREMENTO
				vString = new Vector<String>(10, 5);
				
				//ASIGNAR VALORES A UN VECTOR
				
				v.add("Hola");
				
				System.out.println("================VECTORES================");
				
				//RECOGER VALORES EN UNA POSICION DETERMINADA
				System.out.println("Elemento en la posicion 0: "+v.get(0));
				
				//RECORRER UN VECTOR
				int size = v.size();
				
				for (int i=0;i<size;i++) {
					System.out.println("Indice: "+i+", Valor: "+size);
				}
				
				vString = recorreVectorYCopia(v);
				
				int sizeS = vString.size();
				
				for (int i=0;i<sizeS;i++) {
					System.out.println("Indice: "+i+", Valor: "+vString.get(i));
				}
				
				System.out.println("========================================");
				System.out.println("==============FIN VECTORES==============");
			}
	
	public static Vector<String> recorreVectorYCopia(Vector<String> v) {
		Vector<String> tmp = new Vector<String>();
		
		int size = v.size();
		
		for (int i=0;i<size;i++) {
			tmp.add(v.get(i));
		}
		
		return tmp;
	}
}
