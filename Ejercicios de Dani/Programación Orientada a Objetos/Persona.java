package ejerciciosTema9;

import java.util.Random;

public class Persona {

	// Constantes
	private static final char HOMBRE = 'H';
	private final int ANOREXIA = -1;
	private final int IDEAL = 0;
	private final int SOBREPESO = 1;
	private final static char[] LETRAS_DNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'V', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
			'Z', 'S', 'Q', 'Y', 'H', 'L', 'C', 'K', 'E' };

	// Atributos
	private String nombre = "";
	private int edad;
	private String DNI = "";
	private char sexo = HOMBRE;
	private double peso;
	private double altura;
	private Random rand = new Random();

	// Constructores
	public Persona() { // Constructor no-arg
		generaDNI();
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		comprobarSexo(sexo);
		generaDNI();
	}

	public Persona(String nombre, int edad, char sexo, String DNI, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		comprobarSexo(sexo);
		this.DNI = DNI;
		this.peso = peso;
		this.altura = altura;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getAnorexia() {
		return ANOREXIA;
	}

	public int getIdeal() {
		return IDEAL;
	}

	public int getSobrepeso() {
		return SOBREPESO;
	}

	public static char getHombre() {
		return HOMBRE;
	}

	public static char[] getLetrasDni() {
		return LETRAS_DNI;
	}

	// Override toString
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	// CalcularIMC: calcula si la persona está en su peso ideal
	public int calcularIMC() {
		double imc = peso / Math.pow(altura, 2);

		if (imc < 20) {
			return ANOREXIA;
		} else if (imc >= 20 && imc <= 25) {
			return IDEAL;
		} else {
			return SOBREPESO;
		}
	}

	// EsMayorDeEdad: true si edad es mayor o igual a 18
	public boolean esMayorDeEdad() {
		if (edad >= 18) {
			return true;
		}
		return false;
	}

	// ComprobarSexo: comprueba que el sexo introducido es correcto
	private void comprobarSexo(char sexo) {
		if (sexo == 'H' || sexo == 'M') {
			this.sexo = sexo;
		}
	}

	// GeneraDNI: crea un número aleatorio de 8 cifras y una letra que le
	// corresponda
	private void generaDNI() {
		int numero = (int) (rand.nextDouble() * Math.pow(10, 7) * 9 + Math.pow(10, 7));
		char letra = generaLetra(numero);
		DNI = numero + "" + letra;
	}

	// GereraLetra: devuelve una letra en base al número
	private char generaLetra(int numero) {
		numero %= 23;

		return LETRAS_DNI[numero];
	}

}
