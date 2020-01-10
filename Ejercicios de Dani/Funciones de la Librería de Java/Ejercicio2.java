package ejerciciosFunciones;

public class Ejercicio2 {

	public static void main(String[] args) {
		int n = (int) (Math.random() * 13 + 1);
		int p = (int) (Math.random() * 4);
		
		String numero = "";
		
		switch(n) {
		case 1:
			numero = "As";
			break;
		case 11:
			numero = "J";
			break;
		case 12:
			numero = "Q";
			break;
		case 13:
			numero = "K";
			break;
		default:
			numero = Integer.toString(n);
			break;
		}
		
		String palo = "";
		
		switch(p) {
		case 0:
			palo = "picas";
			break;
		case 1:
			palo = "tréboles";
			break;
		case 2:
			palo = "corazones";
			break;
		case 3:
			palo = "diamantes";
			break;
		}
		
		System.out.println(numero + " de " + palo + ".");
	}
}
