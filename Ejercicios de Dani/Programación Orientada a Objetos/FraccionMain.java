package ejerciciosTema9;

public class FraccionMain {

	public static void main(String[] args) {
		Fraccion f1 = new Fraccion(5, 7);
		Fraccion f2 = new Fraccion(4, 12);
		
		System.out.println(f1);
		System.out.println(f2);
		
		System.out.println(f1.valor());
		
		f1.suma(f2);
		
		System.out.println(f1);
		
		f1.divide(f2);
		
		System.out.println(f1.valor());
	}

}
