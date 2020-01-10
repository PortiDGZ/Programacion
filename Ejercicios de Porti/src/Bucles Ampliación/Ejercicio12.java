package Ejercicio5;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		int i;
		
		int sumapar = 0;
		
		int sumaimpar = 0;
		
		
		
		for(i = 25; i<=50; i++) {
			
			if(i % 2 == 0) {
				
				sumapar = i + sumapar;
				
			}
			
			if(!(i % 2 == 0) ) {
				
				sumaimpar = i + sumaimpar;
				
			}
			
		}
		
		System.out.println(sumapar);
		System.out.println(sumaimpar);
		
	}
}