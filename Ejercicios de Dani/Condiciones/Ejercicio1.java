package ejercicios3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escribe un día de la semana: ");
		String dia = scan.nextLine();
		System.out.println();
		
		if(dia.compareToIgnoreCase("lunes") == 0 | dia.compareToIgnoreCase("miercoles") == 0) {
			System.out.println("A primera hora tienes Bases de Datos.");
		}
		if(dia.compareToIgnoreCase("martes") == 0 | dia.compareToIgnoreCase("jueves") == 0) {
			System.out.println("A primera hora tienes Sistemas Informáticos.");
		}
		if(dia.compareToIgnoreCase("viernes") == 0) {
			System.out.println("A primera hora tienes Entornos de Desarrollo.");
		}
		if(dia.compareToIgnoreCase("sábado") == 0 | dia.compareToIgnoreCase("domingo") == 0) {
			System.out.println("Hoy no tienes clases.");
		}
		
		scan.close();
	}

}
