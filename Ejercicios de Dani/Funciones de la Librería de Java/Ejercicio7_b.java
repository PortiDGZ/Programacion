package ejerciciosFunciones;

public class Ejercicio7_b {

	public static void main(String[] args) {
		int compases = (int) (Math.random() * 7 + 1);
		String primera = "";
		
		for(int i = 1; i <= compases; i++) {
			for(int j = 1; j <= 4; j++) {
				int nota = (int) (Math.random() * 7 + 1);
				String mus = "";
				
				switch(nota) {
				case 1:
					mus = "do";
					break;
				case 2:
					mus = "re";
					break;
				case 3:
					mus = "mi";
					break;
				case 4:
					mus = "fa";
					break;
				case 5:
					mus = "sol";
					break;
				case 6:
					mus = "la";
					break;
				case 7:
					mus = "si";
					break;
				}
				
				if(i == compases & j == 4) {
					mus = primera;
				}
				
				System.out.print(mus);
				System.out.print(" ");
				
				if(i == 1 & j == 1) {
					primera = mus;
				}
			}
			
			if(i == compases) {
				System.out.print("||");
			} else {
				System.out.print("| ");
			}
		}
	}
}
