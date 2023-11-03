package es.ifp.programacion.conceptos.generales;

public class Operadores 
{

	public static void main(String[] args) 
	{
		//Bloque de declaracion de variables
		
		int tipoEnteroA;
		int tipoEnteroB;
		int resultado;
		int x, y;
		
		tipoEnteroA = 4353;
		tipoEnteroB = 564;
		
		//tipoEnteroA++; '++' Suma 1 unidad
		//tipoEnteroA--; '--' Resta 1 unidad
		
		/**Otros operadores aritmeticos:
		 * == igualdad
		 * != distinto
		 * < menor que
		 * > mayor que
		 * <= menor o igual
		 * >= mayor o igual
		 */
		
		/**Operadores logicos
		 * && AND (true && true) -> true
		 * || OR (true || falsa) -> true
		 * ! NOT !false -> true
		 */
		
		/**Operadores de asignacion compuestos
		* x+=y -> x=x+y
		* x-=y -> x=x-y
		* x*=y -> x=x*y
		* x/=y -> x=x/y
		*/
		
		resultado = tipoEnteroA + tipoEnteroB;
		
		System.out.println("Resultado: "+resultado);
	}

}