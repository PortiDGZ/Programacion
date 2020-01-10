package Ejercicio6;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int rundam;
		
		int randum;
		
		String CHAR;
		
		String STRING = null;
		
		System.out.println("Baraja fransesita UwU");
		while(true) {
		rundam = (int) (Math.random() * 13 + 1);
		
		randum = (int) (Math.random() * 4 + 1);
		
		switch(rundam) {
		
		case 1: CHAR = "A";
		
		break;
		
		case 11: CHAR = "J";
		
		break;
		
		case 12: CHAR = "Q";
		
		break;
		
		case 13: CHAR = "K";
		
		break;
		
		default: CHAR = Integer.toString(rundam);
		
		
		}
		
		switch(randum) {
		
		case 1: STRING = "picas";
				
		break;
		
		case 2: STRING = "corazones";
		
		break;
		
		case 3: STRING = "diamantes";
		
		break;
		
		case 4: STRING = "tréboles";
		
		break;
		
		}
		
		System.out.println(CHAR + " de " + STRING);
	}

}
}
