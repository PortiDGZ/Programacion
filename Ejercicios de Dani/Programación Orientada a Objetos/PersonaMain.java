package ejerciciosTema9;

public class PersonaMain {

	public static void main(String[] args) {
		// Usar los distintos constructores
		Persona p1 = new Persona();
		Persona p2 = new Persona("María", 23, 'M');
		Persona p3 = new Persona("Miguel", 15, 'H', "78894568F", 65, 1.58);
		
		// Mostrar las personas
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		// IMC de Miguel
		System.out.println(p3.calcularIMC() == 1?"Sobrepeso.":"No sobrepeso.");
		
		// ¿Es María mayor de edad?
		System.out.println(p2.esMayorDeEdad()?"Mayor de edad.":"Menor de edad.");
	}

}
