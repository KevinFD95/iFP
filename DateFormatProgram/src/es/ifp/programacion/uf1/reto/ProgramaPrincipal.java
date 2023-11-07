package es.ifp.programacion.uf1.reto;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		/**
		 * BLOQUE DE DEFINICIÓN DE VARIABLES
		 * 
		 * Definición de 2 variables de tipo Entero (int) que introducirá el usuario a partir del 'Scanner'.
		 * Definición de la variable de tipo String para el almacenamiento del resultado de la función "mesEscrito".
		 * Definición del 'Scanner' para la introducción de datos del usuario a través del teclado.
		 */
		
		int mesNum;
		int dia;
		
		String mesNombre;
		Scanner sc = new Scanner(System.in);
		
		/**
		 * BLOQUE DE INTRODUCCIÓN DE DATOS
		 * 
		 * En este bloque se introduce el inicio del programa y se le pide al usuario que introduzca el número del
		 * mes y del día.
		 * 
		 * Si el número del mes es incorrecto, el programa pedirá que se introduzca un valor válido.
		 */
		
		encabezadoProg();
		
		System.out.print("Introduzca el mes: ");
		mesNum = Integer.parseInt(sc.nextLine());
		while (mesNum<1 || mesNum>12) {
			System.out.print("Introduzca un mes válido (valor del 1 al 12): ");
			mesNum = Integer.parseInt(sc.nextLine());
		}
		mesNombre = mesEscrito(mesNum);
		
		System.out.print("Introduzca el día: ");
		dia = Integer.parseInt(sc.nextLine());
		
		/**
		 * BLOQUE DE TRANSFORMACIÓN Y SALIDA DE DATOS
		 * 
		 * Dependiendo el número del mes, el programa entrará en un condicional donde identificará y dará salida de
		 * texto si la fecha es correcta y cerrará el programa proporcionando la fecha. En caso contrario, el programa
		 * cerrará indicando que la fecha es incorrecta.
		 */
		
		if (mesNum==2&&dia>0&&dia<=28) {
			System.out.print("La fecha introducida es: "+dia+" de "+mesNombre);
		}
		else {
			if ((mesNum==4||mesNum==6||mesNum==9||mesNum==11)&&dia>0&&dia<=30) {
				System.out.print("La fecha introducida es: "+dia+" de "+mesNombre);
			}
			else {
				if ((mesNum==1||mesNum==3||mesNum==5||mesNum==7||mesNum==8||mesNum==10||mesNum==12)&&dia>0&&dia<=31) {
					System.out.print("La fecha introducida es: "+dia+" de "+mesNombre);
				}
				else {
					System.out.println("La fecha introducida es incorrecta");
					pieProg();
				}
			}
		}
		sc.close();
	}

	/**
	 * BLOQUE DE PROCEDIMIENTOS
	 * 
	 * En este bloque fuera del procedimiento principal del programa se encuentran los diferentes procedimientos
	 * que llamará el programa donde se requiera.
	 */
	
	public static void encabezadoProg() {
		System.out.println("============================");
		System.out.println("=====Escritor de fechas=====");
		System.out.println("============================");
	}
	public static void pieProg() {
		System.out.println("==========================");
		System.out.println("=====Fin del programa=====");
		System.out.println("==========================");
	}
	
	/**
	 * BLOQUE DE PROCEDIMIENTOS
	 * 
	 * En este bloque fuera del procedimiento principal del programa se encuentran las diferentes funciones
	 * que llamará el programa donde se requiera.
	 */
	
	public static String mesEscrito(int n) {
		
		do {
			switch (n) {
			case 1:
			return "Enero";
			case 2:
			return "Febrero";
			case 3:
			return "Marzo";
			case 4:
			return "Abril";
			case 5:
			return "Mayo";
			case 6:
			return "Junio";
			case 7:
			return "Julio";
			case 8:
			return "Agosto";
			case 9:
			return "Septiembre";
			case 10:
			return "Octubre";
			case 11:
			return "Noviembre";
			case 12:
			return "Diciembre";
			}
		} while (n<0 || n>12);
		return null;
	}
}
