package ejerciciosFunciones;

public class Ejercicio17 {

	public static void main(String[] args) {
		int numero = (int) (Math.random() * 6);
		
		char letra = 0;
		switch(numero) {
			case 0:
				letra = '*';
				break;
			case 1:
				letra = '-';
				break;
			case 2:
				letra = '=';
				break;
			case 3:
				letra = '.';
				break;
			case 4:
				letra = '|';
				break;
			case 5:
				letra = '@';
				break;
			}

	
		for(int i = 1; i <= 5; i++) {
			System.out.print(letra);
		}
	}
}
