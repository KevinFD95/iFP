package es.ifp.programacion.uf1.condicional;

/**
 * Este ejercicio muestra como anidar diferentes if/else uno dentro de otro
 * Siempre que la condicion de un if sea falso, introducira otro if
 * Ejemplo con las notas academicas
 * 
 * Introduciremos el valor de la nota como número entero a través del Scanner
 * y el programa nos dirá, según la nota, si tenemos un sobresaliente, notable, etc.
 */

import java.util.Scanner;

public class ejercicioAnidamientos 
{

	public static void main(String[] args) 
	{
		//Bloque de declaración e inicialización de variables
		int nota=0;
		Scanner sc = new Scanner(System.in);
		
		//Introducción de datos
		System.out.println("Introduzca el valor de la nota: ");
		nota = Integer.parseInt(sc.nextLine());
		
		//Transformación y salida de datos
		if (nota>10)
		{
			System.out.println("Nota no válida, introduzca un valor MENOR a 10");
		}
		else
		{
			if (nota>=9)
			{
				System.out.println("La nota es "+nota+", por lo tanto, es un SOBRESALIENTE");
			}
			else
			{
				if (nota>=7)
				{
					System.out.println("La nota es "+nota+", por lo tanto, es un NOTABLE");
				}
				else
				{
					if (nota>=6)
					{
						System.out.println("La nota es "+nota+", por lo tanto, es un BIEN");
					}
					else
					{
						if (nota>=5)
						{
							System.out.println("La nota es "+nota+", por lo tanto, es un SUFICIENTE");
						}
						else
						{
							System.out.println("La nota es "+nota+", por lo tanto, es un INSUFICIENTE");
						}
					}
				}
			}
		}
		sc.close();
	}
}
