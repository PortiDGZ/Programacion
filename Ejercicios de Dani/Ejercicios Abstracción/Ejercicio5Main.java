package EjerciciosAbstraccion;

public class Ejercicio5Main {

	public static void main(String[] args) {
		// Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada
		// uno
		Serie[] series = new Serie[5];
		Videojuego[] juegos = new Videojuego[5];

		// Crea un objeto en cada posición del array, con los valores que desees, puedes
		// usar distintos constructores
		series[0] = new Serie();
		series[1] = new Serie("Perdición anticipada", "Lucas Sein");
		series[2] = new Serie("Amigo de un robot", "Íñigo Pope");
		series[3] = new Serie("Tarde o temprano", 7, "Fantasía", "Íñigo Pope");
		series[4] = new Serie("Perdón, pues he pecado", 1, "Comedia", "Melanie Bergman");

		juegos[0] = new Videojuego();
		juegos[1] = new Videojuego("Xenogears", 60);
		juegos[2] = new Videojuego("Undertale", 10);
		juegos[3] = new Videojuego("Mass Effect 3", 30, "Third Person Shooter", "BioWare");
		juegos[4] = new Videojuego("Sekiro: Shadows Die Twice", 50, "Acción, sigilo", "From Software");

		// Entrega algunos Videojuegos y Series con el método entregar()
		series[1].entregar();
		series[2].entregar();
		juegos[0].entregar();
		juegos[4].entregar();

		// Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos
		System.out.println("Entregados: " + devolver(series, juegos));
		System.out.println();

		// Por último, indica el Videojuego tiene más horas estimadas y la serie con más
		// temporadas. Muéstralos en pantalla con toda su información (usa el método
		// toString())
		System.out.println("Juego con más horas estimadas:");
		System.out.println(mayor(juegos));
		
		System.out.println();
		
		System.out.println("Serie con más temporadas:");
		System.out.println(mayor(series));
	}

	// Devuelve el mayor Entregable del array usando compareTo
	private static Entregable mayor(Entregable[] array) {
		Entregable mayor = array[0];
		
		for(int i = 1; i <= array.length - 1; i++) {
			if(array[i - 1].compareTo(array[i]) < 0) {
				mayor = array[i];
			}
		}
		
		return mayor;
	}

	// Devuelve los Entregables entregados y los cuenta
	private static int devolver(Serie[] series, Videojuego[] juegos) {
		int total = 0;

		for (Entregable elem : series) {
			if (elem.isEntregado()) {
				total++;
				elem.devolver();
			}
		}

		for (Entregable elem : juegos) {
			if (elem.isEntregado()) {
				total++;
				elem.devolver();
			}
		}

		return total;
	}

}
