package Ejercicio3;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int cargoemp;
		double diasviaje;
		int e_civil;
		double sueldo_b = 0;
		String IRPF;
		double sueldo_neto = 0;
		
		
		Scanner cargo = new Scanner(System.in);
		
		System.out.println("1 - Programador Junior");
		
		System.out.println("2 - Programador Senior");
		
		System.out.println("3 - Jefe de proyecto");
		
		System.out.print("Cuál es el cargo del empleado: ");
		
		cargoemp = cargo.nextInt();
		
		System.out.print("Cuantos dias has estado de viaje: ");
		
		diasviaje = cargo.nextDouble();
		
		System.out.print("Cuál es su estado civil (1 - Soltero, 2 - Casado): ");
		
		e_civil = cargo.nextInt();
		
		if(e_civil == 1) {
			
			IRPF = "(25%)";
			
			
		}else IRPF = "(20%)";
		
		switch(cargoemp) {
		
		case 1: sueldo_b = 950;
		
		break;
		
		case 2: sueldo_b = 1200;
		
		break;
		
		case 3: sueldo_b = 1600;
		
		break;
		
		}
		
		double sueldo_bruto = sueldo_b + (30 * diasviaje);
		
		switch(e_civil) {
		
		case 1: sueldo_neto = sueldo_bruto - (sueldo_bruto * 0.25);
		
		case 2: sueldo_neto = sueldo_bruto - (sueldo_bruto * 0.20);
		
		}
		
		
		
System.out.println("----------------------------");
			
			System.out.println("| Sueldo Base" + "        " + sueldo_b + "  |");
			
			
			System.out.println("| Dietas " + "(" + diasviaje + " viajes) " + (diasviaje * 30)  + "  |");
			
			System.out.println("|---------------------------|");
			
			System.out.println("| Sueldo bruto" + " " +  " " +  "     " + sueldo_bruto + " |");
			
			System.out.println("| Retención IRPF" + IRPF + " " + (sueldo_bruto * 0.25) + " |" );

			System.out.println("|---------------------------|");
			
			System.out.println("| Sueldo Neto" + " " + " " + "       " + sueldo_neto + " |" );
			
			System.out.println("-----------------------------");
	
		
		
	}
}
