package ejerciciosHerencia;

public class ElectrodomesticoMain {
	
	private static Electrodomestico[] lista = new Electrodomestico[10];

	public static void main(String[] args) {
		rellenar();
		System.out.println("Precio de todos los electrodomésticos: " + electros());
		System.out.println("Precio de las lavadoras: " + lavadoras());
		System.out.println("Precio de los televisores: " + teles());
	}

	private static double electros() {
		double total = 0;
		
		for (Electrodomestico elem : lista) {
			total += elem.precioFinal();
		}
		
		return total;
	}
	
	private static double lavadoras() {
		double total = 0;
		
		for (Electrodomestico elem : lista) {
			if (elem instanceof Lavadora) {
				total += elem.precioFinal();
			}
		}
		
		return total;
	}
	
	private static double teles() {
		double total = 0;
		
		for (Electrodomestico elem : lista) {
			if (elem instanceof Television) {
				total += elem.precioFinal();
			}
		}
		
		return total;
	}

	private static void rellenar() {
		lista[0] = new Electrodomestico();
		lista[1] = new Lavadora();
		lista[2] = new Television();
		lista[3] = new Electrodomestico(29, 65);
		lista[4] = new Lavadora(84, 25);
		lista[5] = new Television(65, 33);
		lista[6] = new Electrodomestico(15, "negro", 'E', 42);
		lista[7] = new Electrodomestico(77, "rosa", 'A', 31);
		lista[8] = new Lavadora(24, "blanco", '*', 44, 50);
		lista[9] = new Television(36, "azul", 'D', 63, 150, true);
	}

}
