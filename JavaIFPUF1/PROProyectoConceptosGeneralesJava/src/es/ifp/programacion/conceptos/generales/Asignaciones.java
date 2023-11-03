package es.ifp.programacion.conceptos.generales;

public class Asignaciones 
{

	public static void main(String[] args) 
	{
		//Bloque de declaracion de variables
		//Tipos de datos primitivos
		
		boolean tipoBooleano; 	//Ocupa 1 bit. Puede tomar valor true o false
		char tipoChar; 			//Ocupa 16 bits. Puede tomar un valor de un caracter Unicode
		byte tipoByte;			//Ocupa 8 bits. Entero con signo. (-128 a 128)
		short tipoShort;		//Ocupa 16 bits. Entero con signo. (-32768 a 32768)
		int tipoEntero;			//Ocupa 32 bits. Entero con signo (-2147483648 a 2147483648)
		long tipoLong;			//Ocupa 64 bits. Entero con signo. (-9223372036854775807 a 9223372036854775807)
		float tipoFloat;		//Ocupa 32 bits. Coma flotante (reales) (+-3.40282347E+38 a +-1.40239846E-45)
		double tipoDouble, tipoDouble2, tipoDouble3, tipoDouble4;		//Ocupa 64 bits. Coma flotante precision doble (reales)
		
		//Algunos ejemplos de asignacion de valores a los tipos de datos primitivos
		
		tipoBooleano = true;
		
		tipoChar = 'a';
		
		
		tipoByte = 123;
		
		tipoShort = 32763;
		
		tipoEntero = 435353434;
		
		
		tipoLong = 567L;
		
		
		tipoFloat = 15.7f;
		
		tipoFloat = 15.7f;
		
		
		tipoDouble = 15.2;
		
		tipoDouble2 = 15.2D;
		
		tipoDouble3 = 1.52e1;
		
		tipoDouble4 = 0.152E2;
	}

}