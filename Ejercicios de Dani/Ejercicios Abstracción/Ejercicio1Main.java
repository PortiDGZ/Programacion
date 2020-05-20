package EjerciciosAbstraccion;

public class Ejercicio1Main {

	public static void main(String[] args) {
		// Crear figuras
		Rectangulo r = new Rectangulo(4, 5, 7, 10);
		Cuadrado c = new Cuadrado(20, 20, 5);
		Circunferencia c2 = new Circunferencia(-6, -2, 8);
		
		// Cambiar posici�n
		c2.desplaza(7, -9);
		
		// Ver �rea
		System.out.println("�rea: " + c.area());
		
		// Ver per�metro
		System.out.println("Per�metro: " + c2.perimetro());
		System.out.println("Per�metro: " + r.perimetro());
		
		// Cambiar tama�o
		r.redimensiona(50);
		
		// Ver nuevo per�metro
		System.out.println("Per�metro: " + r.perimetro());
	}

}
