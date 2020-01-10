package ejercicios3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int puntuacion = 0;
		String respuesta;
		
		System.out.println("Este test calcular� la probabilidad de que tu pareja te est� siendo infiel.");
		System.out.println("Para cada enunciado, debe contestar v (verdadero) o f (falso).");
		System.out.println("Pulse intro para continuar.");
		scan.nextLine();
		System.out.println();
		
		System.out.println("Tu pareja parece estar m�s inquieta de lo normal sin ning�n motivo aparente.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("Ha aumentado sus gastos de vestuario.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("Ha perdido el inter�s que mostraba anteriormente por ti.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("Ahora se arregla el pelo y se asea con m�s frecuencia.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("No te deja que mires la agenda de su tel�fono m�vil.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("A veces tiene llamadas que dice no querer contestar cuando est�s t� delante.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("�ltimamente se preocupa m�s en cuidad la l�nea y/o estar bronceado/a.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho m�s trabajo.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("Has notado que �ltimamente se perfuma m�s.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("Puntuaci�n: " + puntuacion);
		
		if(puntuacion <= 10) {
			System.out.println("�Enhorabuena! Tu pareja parece ser totalmente fiel.");
		}
		else {
			if(puntuacion <= 22) {
				System.out.println("Quiz�s exista el peligro de otra persona en su vida o en");
				System.out.println("su mente, aunque seguramente ser� algo sin importancia.");
				System.out.println("No bajes la guardia.");
			}
			else {
				System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo");
				System.out.println("un romance con otra persona. Te aconsejamos que indagues un");
				System.out.println("poco m�s y averig�es qu� es lo que est� pasando por su cabeza.");
			}
		}
		
		scan.close();
	}
}
