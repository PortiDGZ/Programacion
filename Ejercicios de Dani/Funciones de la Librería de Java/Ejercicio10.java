package ejerciciosFunciones;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el primer número x: ");
		double x = scan.nextDouble();
		
		System.out.print("Introduce el segundo número y: ");
		double y = scan.nextDouble();
		
		double resultado = x + y;
		
		System.out.println("");
		System.out.printf("Suma x+y: %.2f\n", resultado);
		
		resultado = x - y;
		System.out.printf("Diferencia x-y: %.2f\n", resultado);
		
		resultado = x * y;
		System.out.printf("Producto x*y: %.2f\n", resultado);
		
		resultado = x / y;
		System.out.printf("Cociente x/y: %.2f\n", resultado);
		
		//Ampliación
		
		resultado = Math.sin(x);
		System.out.printf("Seno x: %.2f\n", resultado);
		
		resultado = Math.cos(x);
		System.out.printf("Coseno x: %.2f\n", resultado);
		
		resultado = Math.tan(x);
		System.out.printf("Tangente x: %.2f\n", resultado);
		
		resultado = Math.pow(x, y);
		System.out.printf("Potencia x^y: %.2f\n", resultado);
		
		resultado = Math.sqrt(x);
		System.out.printf("Raíz cuadrada x: %.2f\n", resultado);
		
		resultado = Math.log(x);
		System.out.printf("Logaritmo x (base e): %.2f\n", resultado);
		
		scan.close();
	}
}
