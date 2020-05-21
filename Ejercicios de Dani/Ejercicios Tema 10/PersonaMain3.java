package Ejercicios;

public class PersonaMain3 {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona("Fernández", "Manuel");
		Persona p3 = new Persona("Gutiérrez", "Lucía", 'M');
		Persona p4 = new Persona("48488732M", "de la Torre", "Marcos", 'V', "29/02/2000", 32.5, 164);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
