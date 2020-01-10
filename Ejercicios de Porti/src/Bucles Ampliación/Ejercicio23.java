package Ejercicio5;

public class Ejercicio23 {

	public static void main(String[] args) {
		
		double fact = 1;
		
		double i;
		
		double j;
		
		for(i=5; i <= 25; i++) {
			for(j=1; j<=i; j++) {
				
				fact = fact * j;
				
				System.out.println(fact);
			}
			
			fact = 1;
		}
	}
}
