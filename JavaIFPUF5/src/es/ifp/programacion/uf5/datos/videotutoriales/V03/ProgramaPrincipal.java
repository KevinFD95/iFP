package es.ifp.programacion.uf5.datos.videotutoriales.V03;

/**
 * ARRAY MULTIDIMENSIONALES: MATRICES
 */

import java.util.Scanner;

/**
 * Creacion de arrays multidimensionales: Matrices
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
				
		System.out.println("========================================");
		System.out.println(">>>>>>>>>>>>>> MATRICES");
		
		//DEFINICION, CREACION, ACCESO, RECORRIDO Y ASIGNACION
		//DEFINICION DE MATRICES
		System.out.println("[MATRICES] 1.- Recogemos numero de filas y columnas para crear la matriz");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero de filas:");
		int nFilas = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el numero de columnas:");
		int nColumnas = Integer.parseInt(sc.nextLine());
		
		//Definir y construir la matriz
		//Es necesario definir su tamaño previamente
		double[][] matrizDouble = new double[nFilas][nColumnas];
		
		System.out.println("Introduzca un valor inicial para la matriz");
		double vInicial = Double.parseDouble(sc.nextLine());
		
		//Rellenar la matriz con el valor inicial
		
		for (int i=0;i<nFilas;i++) {
			for (int j=0;j<nColumnas;j++) {
				matrizDouble[i][j] = vInicial;
			}
		}
		
		//RECORREMOS LA MATRIZ
		System.out.println("[MATRICES] 2.- Recorremos la matriz");
		System.out.println("\n");
		
		for (int i=0;i<nFilas;i++) {
			for (int j=0;j<nColumnas;j++) {
				System.out.println("Celda: "+i+" "+j+" = ["+matrizDouble[i][j]+"]");
			}
			System.out.println("\n");
		}
		
		//RELLENAR LA MATRIZ CON NUMEROS ALEATORIOS
		System.out.println("[MATRICES] 3.- Rellenamos la matriz con valores aleatorios");
		
		for (int i=0;i<nFilas;i++) {
			for (int j=0;j<nColumnas;j++) {
				matrizDouble[i][j] = getNumeroAleatorio();
			}
		}
		
		//RECORRER LA MATRIZ MOSTRANDO LOS NUMEROS ALEATORIOS
		System.out.println("[MATRICES] 4.- Recorremos la matriz");
		System.out.println("\n");
		
		for (int i=0;i<nFilas;i++) {
			for (int j=0;j<nColumnas;j++) {
				System.out.println("Celda: "+i+" "+j+" = ["+matrizDouble[i][j]+"]");
			}
			System.out.println("\n");
		}
		sc.close();
	}

	public static double getNumeroAleatorio() {
		return Math.random();
	}
}
