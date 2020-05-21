package Ejercicios;

public class RectanguloMain {

	public static void main(String[] args) {
		Rectangulo rec = new Rectangulo(5, 8);
		
		System.out.println("Perímetro: " + rec.perimetro());
		
		System.out.println();
		System.out.println("Área: " + rec.area());
		
		System.out.println();
		rec.visualizar();
	}

}
