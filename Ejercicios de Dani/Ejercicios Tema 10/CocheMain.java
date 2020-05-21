package Ejercicios;

public class CocheMain {

	public static void main(String[] args) {
		String[] ocupantes = {"Marta", "Jose"};
		Coche coche1 = new Coche("Mercedes", "Clase A", "5482EDF", ocupantes);
		
		System.out.println(coche1);
		
		Coche coche2 = coche1.clone();
		
		System.out.println(coche2);
		
		String[] ocupantes2 = {"Eduardo", "Jose"};
		coche1.setOcupantes(ocupantes2);
		
		System.out.println(coche1);
		System.out.println(coche2);
	}

}
