package ejerciciosFunciones;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		final double x = 0;
		double f = Math.sqrt(Math.sin(Math.pow(x, 3) + (2/9) * x) + Math.cos(6 * Math.PI  + Math.tan(Math.pow(Math.E, Math.pow(x, 3)))));

		System.out.printf("Resultado: %.2f", f);
	}
}
