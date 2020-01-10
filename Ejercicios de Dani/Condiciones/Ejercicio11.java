package ejercicios3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int puntuacion = 0;
		String respuesta;
		
		System.out.println("Este test calculará la probabilidad de que tu pareja te esté siendo infiel.");
		System.out.println("Para cada enunciado, debe contestar v (verdadero) o f (falso).");
		System.out.println("Pulse intro para continuar.");
		scan.nextLine();
		System.out.println();
		
		System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
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
		
		System.out.println("Ha perdido el interés que mostraba anteriormente por ti.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("Ahora se arregla el pelo y se asea con más frecuencia.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("No te deja que mires la agenda de su teléfono móvil.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("Últimamente se preocupa más en cuidad la línea y/o estar bronceado/a.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
		respuesta = scan.nextLine();
		if(respuesta.toLowerCase().equals("v")) {
			puntuacion += 3;
		}
		System.out.println();
		
		System.out.println("Has notado que últimamente se perfuma más.");
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
		
		System.out.println("Puntuación: " + puntuacion);
		
		if(puntuacion <= 10) {
			System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
		}
		else {
			if(puntuacion <= 22) {
				System.out.println("Quizás exista el peligro de otra persona en su vida o en");
				System.out.println("su mente, aunque seguramente será algo sin importancia.");
				System.out.println("No bajes la guardia.");
			}
			else {
				System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo");
				System.out.println("un romance con otra persona. Te aconsejamos que indagues un");
				System.out.println("poco más y averigües qué es lo que está pasando por su cabeza.");
			}
		}
		
		scan.close();
	}
}
