package manejoDeExcepciones;

public class Gato {
	
	//Atributos
	private char sexo = 'M';
	
	// Constructor
	public Gato(char sexo) {
		if (sexo == 'H' || sexo == 'M') {
			this.sexo = sexo;
		}
	}
	
	// Getters
	public char getSexo() {
		return sexo;
	}
	
	// Arroja una excepción si no son de sexo distinto
	public Gato apareaCon(Gato pareja) throws ExcepcionApareamientoImposible {
		if(pareja.getSexo() == sexo) {
			throw new ExcepcionApareamientoImposible();
		}
		
		System.out.println("Apareamiento exitoso.");
		
		char s = 'M';
		
		if(Math.random() > 0.5) {
			s = 'H';
		}
		
		return new Gato(s);
	}

}
