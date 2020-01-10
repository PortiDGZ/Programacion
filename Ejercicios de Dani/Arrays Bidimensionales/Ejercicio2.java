package arraysBidimensionales;

import java.util.Scanner;

public class Ejercicio2 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] tabla = new int[4][5];

		rellenarPorTeclado(tabla);
		
		System.out.println();

		printSumatorio(tabla);

		scan.close();
	}

	public static void rellenarPorTeclado(int[][] tabla) {
		for (int i = 0; i <= tabla.length - 1; i++) {
			for (int j = 0; j <= tabla[i].length - 1; j++) {
				tabla[i][j] = arraysUnidimensionales.Ejercicio3.pedirInt();
			}
		}
	}
	
	public static void printFila(int[] tabla) {
		for(int i = 0; i <= tabla.length - 1; i++) {
			System.out.print(tabla[i]);
			System.out.print(", ");
		}
		
		int total = sumatorio(tabla);
		
		System.out.print(total);
	}

	public static void printSumatorio(int[][] tabla) {
		for (int i = 0; i <= tabla.length - 1; i++) {
			printFila(tabla[i]);
			System.out.println();
		}
		
		printSumatorioColumnas(tabla);
	}

	public static void printSumatorioColumnas(int[][] tabla) {
		int[] columnas = new int[tabla[0].length];
		
		for (int i = 0; i <= tabla.length - 1; i++) {
			for (int j = 0; j <= tabla[i].length - 1; j++) {
				columnas[j] += tabla[i][j];
			}
		}
		
		printFila(columnas);
	}

	public static int sumatorio(int[] tabla) {
		int total = 0;
		
		for (int elem : tabla) {
			total += elem;
		}
		
		return total;
	}

}
