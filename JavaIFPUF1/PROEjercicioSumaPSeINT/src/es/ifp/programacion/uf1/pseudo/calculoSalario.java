package es.ifp.programacion.uf1.pseudo;

import java.util.Scanner;

public class calculoSalario 
{

	public static void main(String[] args) 
	{
		//Bloque de variables, definido e inicializado
		
		int numHoras=0;
		float precioHora=0.0f;
		float salario=0.0f;
		Scanner sc = new Scanner(System.in);
		
		
		//Bloque Introduccion de datos
		
		System.out.println("Introduzca el numero de horas: ");
		numHoras = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca el precio por hora: ");
		precioHora = Float.parseFloat(sc.nextLine());
		
		//Bloque de transformacion
		
		salario = numHoras * precioHora;
		
		
		//Bloque Salida de datos
		
		System.out.println("El salario es: "+salario);
		sc.close();
		
	}

}
