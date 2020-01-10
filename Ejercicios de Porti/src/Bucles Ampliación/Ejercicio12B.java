package Ejercicio5;

public class Ejercicio12B {

	public static void main(String[] args) {
		int i;
		int sumapar = 0;
		int sumaimpar = 0;
		
		i = 25;
		
		while(i >= 25 & i <= 50) {
			
			if(i % 2 == 0) {
				
				sumapar = i + sumapar;
				
			}
			
			if(!(i % 2 == 0) ) {
				
				sumaimpar = i + sumaimpar;
				
			}
			i++;
			
		}
		
		System.out.println(sumapar);
		System.out.println(sumaimpar);

	}
	

}

