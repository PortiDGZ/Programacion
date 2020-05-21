package ejerciciosTema9;

public class TestLibro2 {

	public static void main(String[] args) {
		Libro2 b1 = new Libro2("Yerma", "Federico García Lorca", false);
		Libro2 b2 = new Libro2("Luces de Bohemia", "Ramón del Valle Inclán", true);
		Libro2 b3 = new Libro2("Luces de Bohemia", "Ramón del Valle Inclán", true);
		
		System.out.println(b1);
		System.out.println(b2);

		if (!b1.getEstado()) {
			System.out.println("El libro del objeto b1 está prestado.");
		} else {
			System.out.println("El libro del objeto b1 está en la biblioteca.");
		}
		
		b1.setEstado(true);
		
		System.out.println(b1);
		
		if (b1.equals(b2)) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("Son distintos.");
		}
		
		if (b2.equals(b3)) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("Son distintos.");
		}
	}

}
