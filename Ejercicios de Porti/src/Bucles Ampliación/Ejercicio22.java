package Ejercicio5;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		char CHAR = 32;
		
		for(int i = 0; i<255;i++) {
			if(i%10 == 0) {
				
				System.out.println();
				
			}
			
			System.out.print(CHAR++);
		}
		

	}

}
