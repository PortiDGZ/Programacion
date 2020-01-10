package ejercicios3;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 – Programador junior");
		System.out.println("2 – Prog. senior");
		System.out.println("3 – Jefe de proyecto");
		
		System.out.print("Introduzca el cargo del empleado (1 - 3): ");
		int cargo = scan.nextInt();
		
		System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
		int dias = scan.nextInt();
		
		System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
		int estado = scan.nextInt();
		System.out.println();
		
		double sueldo = 0;
		
		switch(cargo) {
		case 1:
			sueldo = 950;
			break;
		case 2:
			sueldo = 1200;
			break;
		case 3:
			sueldo = 1600;	
			break;
		}
		
		double dietas = dias * 30;
		double sueldoBruto = sueldo + dietas;
		int IRPF = 0;
		
		switch(estado) {
		case 1:
			IRPF = 25;
			break;
		case 2:
			IRPF = 20;
			break;
		}
		
		double retencion = sueldoBruto * IRPF / 100;
		double sueldoNeto = sueldoBruto - retencion;
		
		System.out.println("---------------------------------");
		System.out.printf("|%-20s %10.2f€|\n", "Sueldo base", sueldo);
		System.out.printf("|%-8s%2d%-10s %10.2f€|\n", "Dietas (", dias, " viajes)", dietas);
		System.out.println("---------------------------------");
		System.out.printf("|%-20s %10.2f€|\n", "Sueldo bruto", sueldoBruto);
		System.out.printf("|%-15s%2d%-3s %10.2f€|\n", "Reteción IRPF (", IRPF, "%)", dietas);
		System.out.println("---------------------------------");
		System.out.printf("|%-20s %10.2f€|\n", "Sueldo neto", sueldoNeto);
		System.out.println("---------------------------------");
		
		scan.close();
	}
}
