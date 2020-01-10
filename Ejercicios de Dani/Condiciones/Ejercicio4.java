package ejercicios3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número de horas: ");
		int horas = scan.nextInt();
		int sueldo;
		
		if(horas > 40) {
			sueldo = 480;
			sueldo += (horas - 40) * 16;
		} else {
			sueldo = horas * 12;
		}
		
		System.out.print("Salario: " + sueldo + "€");
		
		scan.close();
	}

}
