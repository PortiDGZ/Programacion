package ejerciciosFunciones;

public class Ejercicio15 {

	public static void main(String[] args) {
		String palabra = "";
		
		for(int i = 1; i <= 5; i++) {
			char letra = (char) (Math.random() * 26 + 65);
			palabra = palabra + letra;
		}
		
		System.out.println(palabra);
		System.out.println(palabra.toLowerCase());
	}
}
