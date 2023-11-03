package es.ifp.programacion.rupturasalto;

public class programaPrincipal {

	public static void main(String[] args) {
		
		//Bloque de declaracion e inicializacion de variables
		
		int i=0;
		
		
		//Bloque de transformacion de datos
		
		while (i<=100) {
			
			if (i==90) {
				
				i++;
				continue; //Instrucción de salto
				
			}
			
			if (i==95) {
				break; //Instrucción de ruptura, se sale del bucle *1
			}
				
			System.out.println(i);
			i++;
			
		}

		//*1 con el break continua aquí
		//El 'break' se usa siempre en el 'switch'
	}

}
