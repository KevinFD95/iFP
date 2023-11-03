package es.ifp.programacion.uf1.pruebas;

import java.util.Scanner;

public class prueba1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*int numero;
		
		numero = Integer.parseInt(sc.nextLine());
		
		if (numero % 2 == 0)

			  System.out.println("El número es par");

			else

			  System.out.println("El número es impar");*/
		
		int result = calculaFormula();
		System.out.println(result);
		sc.close();
	}

	public static int calculaFormula() {        

		int num = 10;        

		int tmp = 5;          

		String cadena = "3";          

		int temporal=1;         



		temporal = Integer.parseInt(cadena)+temporal;        //3+1=4  

		tmp += num+temporal;        //5+10+4=14

		return 10+5 * temporal+tmp;   //10+5*4+14
	}
	public static int miProcedimiento(String numero, int inte){
		  return 10;
	}
}
