package ejerciciosTema9;

public class TestLibro {

	public static void main(String[] args) {
		// Libro nulo
		Libro libroNulo = new Libro();
				
		// Mostrar que el libro es nulo
		System.out.println(libroNulo);
		
		// Libro con parámetros
		Libro l1 = new Libro("Eragon", "Cristopher Paolini", 30 , 5);
		
		// Mostrar el libro
		System.out.println(l1);
		
		// Prestar el libro
		l1.prestamo();
		
		// Mostrar el libro
		System.out.println(l1);
		
		// Devolver el libro
		l1.devolucion();
		
		// Mostrar el libro
		System.out.println(l1);
	}

}
