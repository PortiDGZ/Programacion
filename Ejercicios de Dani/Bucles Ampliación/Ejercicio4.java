package ejerciciosAmpliación;

public class Ejercicio4 {

	public static void main(String[] args) {
		String cadena = "aeciobuifraeciobuifraeciobuifraeciobuifraeciobuifraeciobuifraeciobuifraeciobuifraeciobuifraeciobuifr";
		
		int contador = 0;
		
		for(int i = 0; i <= 99; i++) {
			char ch = cadena.toLowerCase().charAt(i);
			if(ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u') {
				contador++;
			}
		}
		
		System.out.println("Hay " + contador + " vocales.");
	}
}
