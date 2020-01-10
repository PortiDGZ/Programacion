package Ejercicio4;

	import java.util.Scanner;

	public class Ejercicio16 {

		public static void main(String[] args) {
			
			int num;
			
			int media;
			
			int i = 0;
			
			int cont_i = 0;
			
			int p = 0;
			
			int mayor;
			
			int cont = 0;
			
			int maximo = 0;
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduce numeros (negativo para terminar): ");
			
			do {
				
				num = entrada.nextInt();
				
				if(!(num % 2 == 0)) {
					
					i = i + num;
					
					cont_i = cont_i + 1;
				}
				
				
				

				if(num % 2 == 0) {
					
					p = p + num;
					
				}
				

				if(num % 2 == 0 & num > maximo) {
					
					maximo = num;
					
				}
					
				if(num >= 0) {
					
					cont = cont + 1;
					
					
				}

			}while(num >= 0);
			
			media = i/cont_i;
			
			System.out.println("Ha introducido: " + cont + " numeros");
			
			System.out.println("La media de los impares es " + media);
			
			System.out.println("El máximo de los pares es " + maximo);
		}

	}
