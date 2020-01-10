package Ejercicio3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String dia;
		
		System.out.printf("Escribe el día de la semana: ");
		
Scanner d = new Scanner(System.in);

dia = d.nextLine();
		
	dia = dia.toLowerCase();
	
	d.close();
	
	if("lunes" .equals(dia)) {
		
		System.out.println("Bases de datos.");
	}
	
	if("martes" .equals(dia)) {
		
		System.out.println("Sistemas informáticos.");
	}
	if("miércoles" .equals(dia) || "miercoles" .equals(dia)) {
	
	System.out.println("Bases de datos.");
}

	if("jueves" .equals(dia)) {
	
	System.out.println("Sistemas informáticos.");
}

	
	if("viernes" .equals(dia)) {
		
		System.out.println("Programación.");
}

	if("sabado" .equals(dia) || "sábado" .equals(dia)) {
		
		System.out.println("No hay clase");
}

	if("domingo" .contentEquals(dia)) {
		
		System.out.println("No hay clase");
	}
	
	}

}
