package EjerciciosAbstraccion;

public class Ejercicio1Main {

	public static void main(String[] args) {
		// Crear figuras
		Rectangulo r = new Rectangulo(4, 5, 7, 10);
		Cuadrado c = new Cuadrado(20, 20, 5);
		Circunferencia c2 = new Circunferencia(-6, -2, 8);
		
		// Cambiar posición
		c2.desplaza(7, -9);
		
		// Ver área
		System.out.println("Área: " + c.area());
		
		// Ver perímetro
		System.out.println("Perímetro: " + c2.perimetro());
		System.out.println("Perímetro: " + r.perimetro());
		
		// Cambiar tamaño
		r.redimensiona(50);
		
		// Ver nuevo perímetro
		System.out.println("Perímetro: " + r.perimetro());
	}

}
