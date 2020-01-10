package Ejercicio6;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int dado;
		int suma = 0;
		
		
		System.out.println("A continuación se lanzarán tres dados: ");
		
		for(int i= 0; i<3; i++) {
			
			dado = (int) (Math.random() * 6 + 1);
			
			System.out.println(dado);
			
			suma+=dado;
			
			
			
		}
		System.out.println("La suma es: " + suma);
	}

}