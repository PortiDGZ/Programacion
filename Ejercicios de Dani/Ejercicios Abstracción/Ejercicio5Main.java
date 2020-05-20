package EjerciciosAbstraccion;

public class Ejercicio5Main {

	public static void main(String[] args) {
		// Crea dos arrays, uno de�Series�y otro de�Videojuegos, de 5 posiciones cada
		// uno
		Serie[] series = new Serie[5];
		Videojuego[] juegos = new Videojuego[5];

		// Crea un objeto en cada posici�n del array, con los valores que desees, puedes
		// usar distintos constructores
		series[0] = new Serie();
		series[1] = new Serie("Perdici�n anticipada", "Lucas Sein");
		series[2] = new Serie("Amigo de un robot", "��igo Pope");
		series[3] = new Serie("Tarde o temprano", 7, "Fantas�a", "��igo Pope");
		series[4] = new Serie("Perd�n, pues he pecado", 1, "Comedia", "Melanie Bergman");

		juegos[0] = new Videojuego();
		juegos[1] = new Videojuego("Xenogears", 60);
		juegos[2] = new Videojuego("Undertale", 10);
		juegos[3] = new Videojuego("Mass Effect 3", 30, "Third Person Shooter", "BioWare");
		juegos[4] = new Videojuego("Sekiro: Shadows Die Twice", 50, "Acci�n, sigilo", "From Software");

		// Entrega algunos�Videojuegos�y�Series�con el m�todo�entregar()
		series[1].entregar();
		series[2].entregar();
		juegos[0].entregar();
		juegos[4].entregar();

		// Cuenta cuantos�Series�y�Videojuegos�hay entregados. Al contarlos, devu�lvelos
		System.out.println("Entregados: " + devolver(series, juegos));
		System.out.println();

		// Por �ltimo, indica el�Videojuego�tiene m�s horas estimadas y la serie con m�s
		// temporadas. Mu�stralos en pantalla con toda su informaci�n (usa el m�todo
		// toString())
		System.out.println("Juego con m�s horas estimadas:");
		System.out.println(mayor(juegos));
		
		System.out.println();
		
		System.out.println("Serie con m�s temporadas:");
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
