package ejerciciosFunciones;

public class Ejercicio6 {

	public static void main(String[] args) {
		int sus = 0;
		int suf = 0;
		int bien = 0;
		int not = 0;
		int sobr = 0;
		
		for(int i = 1; i <= 20; i++) {
			int nota = (int) (Math.random() * 11);
			String snota = "";
			
			if(nota < 5) {
				snota = "Suspenso.";
				sus++;
			} else {
				if(nota == 5) {
					snota = "Suficiente.";
					suf++;
				} else {
					if(nota == 6) {
						snota = "Bien.";
						bien++;
					} else {
						if(nota <= 8) {
							snota = "Notable.";
							not++;
						} else {
								snota = "Sobresaliente.";
								sobr++;
							}
					}
				}
			}
			
			System.out.println(snota);
		}
		
		System.out.println();
		System.out.println("Suspensos: " + sus);
		System.out.println("Suficientes: " + suf);
		System.out.println("Bien: " + bien);
		System.out.println("Notables: " + not);
		System.out.println("Sobresalientes: " + sobr);
	}
}
