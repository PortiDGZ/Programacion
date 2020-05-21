package ejerciciosHerencia;

import java.util.Scanner;

public class CDMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// CDs
		CD[] discos = new CD[4];
		
		discos[0] = new AudioCD("Música Clásica", 30, "Wolfgang Amadeus Mozart");
		discos[1] = new MP3CD("Rock Mix 2019", 30, "Multiple artists");
		discos[2] = new DatosCD("Imágenes del Amazonas", 2, 1.5);
		discos[3] = new SoftwareCD("Adobe After Effects", 60, "Adobe After Effects 12");
		
		// Buscar
		System.out.print("Introduce el disco: ");
		String disco = scan.nextLine();
		System.out.println();
		
		// Mostrar
		for(CD elem : discos) {
			if (elem.comparar(disco)) {
				System.out.println(elem);
			}
		}
		
		scan.close();
	}

}
