package EjerciciosAbstraccion;

import java.util.ArrayList;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Crear objetos
		Libro l1 = new Libro(1, 1997, "Doble paraíso");
		Libro l2 = new Libro(2, 1957, "Sin tormento");
		Revista r1 = new Revista(3, 2015, "Tentador", 50);
		Revista r2 = new Revista(4, 2018, "La verdad", 138);
		
		// Usar polimorfismo
		ArrayList<Publicacion> a1 = new ArrayList<Publicacion>();
		a1.add(l1);
		a1.add(l2);
		a1.add(r1);
		a1.add(r2);
		
		ArrayList<Prestable> a2 = new ArrayList<Prestable>();
		a2.add(l1);
		a2.add(l2);
		
		// Obtener código
		System.out.println(a1.get(3).getCodigo());
		
		// Obtener prestado
		System.out.println(a2.get(0).prestado());
	}

}
