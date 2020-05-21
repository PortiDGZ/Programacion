package ejerciciosTema9;

public class TestSemaforo {

	public static void main(String[] args) {
		Semaforo miSemaforo = new Semaforo();
		Semaforo semaforoDeMiCalle = new Semaforo();
		Semaforo otroSemaforo = new Semaforo();
		
		miSemaforo.setColor("rojo");
		otroSemaforo.setColor("verde");
		
		System.out.println(otroSemaforo.getColor());
		System.out.println(semaforoDeMiCalle.getColor());

		if (miSemaforo.getColor().equals("rojo")) {
			System.out.println("No pasar.");
		}
		
		if (miSemaforo.puedoPasar()) {
			System.out.println("Puedes pasar.");
		} else {
			System.out.println("No puedes pasar.");
		}
		
		System.out.println("\n" + miSemaforo);
		System.out.println("\n" + otroSemaforo);
		System.out.println("\n" + semaforoDeMiCalle);

	}

}
