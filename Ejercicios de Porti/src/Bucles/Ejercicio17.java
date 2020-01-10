package Ejercicio4;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		boolean premoh;
		
		for(int i = 2; i<= 100; i++) {
			premoh = true;
			for(int n = i/2; n > 1; n--) {
				
				if(i % n == 0) {
					
					premoh = false;
					
				}
			
			}
			if(premoh) {System.out.println("Los números primos son: " + i);
			
			
		}
		

	}

}
}
