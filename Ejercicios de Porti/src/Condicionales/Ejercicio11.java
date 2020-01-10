package Ejercicio3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		char opc;
		
		int suma = 0;
		
		System.out.println("Comienza el test de infidelidad, responda con V si es verdadero y con F si es falso.");
		
		Scanner elec = new Scanner(System.in);
		
		System.out.println("Tu pareja suele estar mas inquieta de lo normal sin motivo aparente: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
		
			suma = suma + 3;

		} else suma = suma + 0;
		
		System.out.println("Ha aumentado sus gastos de vestuario: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
			
		} else suma = suma + 0;
		
		System.out.println("Ha perdido el interés que mostraba anteriormente por ti: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("Ahora se arregla el pelo y se asea con más frecuencia: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("No te deja que mires la agenda de su teléfono móvil: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		} else suma = suma + 0;
		
		System.out.println("Has notado que últimamente se perfuma más: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma = suma + 0;
		
		System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
		
		opc = elec.nextLine().toUpperCase().charAt(0);
		
		if(opc == 'V') {
			
			suma = suma + 3;
		}else suma  = suma + 0;
		
		if(suma >= 0 & suma <= 10) {
			
			System.out.println("¡Enhorabuena tu pareja parece ser totalmente fiel!");
			
		}
		
		if(suma >= 11 & suma <= 22) {
			
			System.out.println("Quizas exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
			
		}
		
		if(suma >= 22 & suma <= 30) {
			
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza");
		}
	}
	
}
