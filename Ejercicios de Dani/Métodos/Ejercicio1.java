package Ejercicios_M�todos;

public abstract class Ejercicio1 {

	public static boolean esCapicua(int n) {
		if(n == voltea(n)) { //Comprueba si el n�mero es igual a su reverso
			return true;
		}
		
		return false;
	}
	
	public static boolean esPrimo(int n) {
		for(int i = n / 2; i > 1; i--) {
			if(n % i == 0) { //Divide entre todos los anteriores
				return false; //Devuelve false si es divisible entre alguno
			}
		}
		
		return true; //Si no es divisible entre ninguno, devuelve true
	}
	
	public static int siguientePrimo(int n) {
		n++; //Comienza el algoritmo a partir del siguiente
		while(!esPrimo(n)) { //Comprueba si es primo
			n++; //Si no lo es, comprueba el siguiente. Sigue hasta que encuentra alguno primo.
		}
		
		return n;
	}
	
	public static double potencia(double base, int exponente) {
		double pot = 1;
		
		if(exponente >= 0) { //Para exponentes positivos
			for(int i = 1; i <= exponente; i++) {
				pot *= base; //Multiplica por la base tantas veces como indique el exponente
			}
		} else {
			exponente *= -1; //Para exponentes negativos
			for(int i = 1; i <= exponente; i++) {
				pot /= base; //Divide por la base tantas veces como indique el exponente
			}
		}
		
		return pot;
	}
	
	public static int digitos(int n) {
		if(n == 0) {
			return 1; //El cero es un caso especial
		}
		
		int l = 0;
		while(n != 0) { //El bucle termina cuando al n�mero no le quedan cifras.
			n /= 10; //En cada iteraci�n divide entre 10. Al ser int, esto equivale a quitarle la �ltima cifra.
			l++;
		}
		
		return l;
	}
	
	public static int voltea(int n) {
		int volt = 0;
		int l = digitos(n);
		
		for (int i = 0; i < l; i++) {
			int cifra = digitoN(n, i); //Obtenemos la cifra a la derecha
			volt += cifra * potencia(10, i); //La a�adimos a la izquierda del nuevo n�mero
		}
		
		return volt;
	}
	
	public static int digitoN(int numero, int posicion) { //0 si no existe la posici�n
		int l = digitos(numero);
		
		posicion++;
		
		if(posicion > l) { //0 si la posici�n es demasiado alta
			return 0;
		}
		
		//Quitar las cifras a la derecha es tan f�cil como dividir entre 10 por cada cifra que haya
		int cifra = (int) (numero / potencia(10, l - posicion)) - (int) (numero / potencia(10, l - posicion + 1)) * 10;
		//El n�mero sin las cifras a la derecha de la que queremos, menos el mismo n�mero cambiado la �ltima cifra por un 0
		//Por ejemplo, si de 1234 queremos 3, esto equivale a 123 - 120
		//Equivale a quitar las cifras a la izquierda de la que queremos
		
		return cifra;
	}
	
	public static int posicionDeDigito(int numero, int digito) { //-1 si no encuentra.
		int l = digitos(numero);
		
		for(int i = 0; i <= l - 1; i++) { //Itera por cada cifra del n�mero
			if(digitoN(numero, i) == digito) { 
				return i; //Si la cifra actual es igual a la buscada, devuelve el n�mero de iteraci�n
			}
		}
		
		return -1; //-1 si no encuentra.
	}
	
	public static int quitaPorDetras(int numero, int cifras) {
		int l = digitos(numero);
		
		if(cifras >= l) { //Si quitas m�s cifras de las que hay, devuelve 0
			return 0;
		}
		
		int n = trozoDeNumero(numero, 0, l - cifras - 1); //N�mero desde el principio hasta la cifra anterior a la que queremos quitar
		return n;
	}
	
	public static int quitaPorDelante(int numero, int cifras) {
		int l = digitos(numero);
		
		if(cifras >= l) { //Si quitas m�s cifras de las que hay, devuelve 0
			return 0;
		}
		
		int n = trozoDeNumero(numero, cifras, l - 1); //N�mero desde la cifra posterior a la que queremos quitar hasta el final
		return n;
	}
	
	public static int pegaPorDetras(int numero, int cifra) {
		int n = juntaNumeros(numero, cifra);
		return n;
	}
	
	public static int pegaPorDelante(int numero, int cifra) {
		int n = juntaNumeros(cifra, numero);
		return n;
	}
	
	public static int trozoDeNumero(int numero, int i, int f) {
		i = Math.max(i, 0); //La cifra inicial es como m�nimo 0 (la primera)
		f = Math.max(f, 0); //La cifra final es como m�nimo 0 (la primera)
		
		f = Math.min(f + 1, digitos(numero)) - 1; //La cifra final es como m�ximo la longitud del n�mero menos 1 (la �ltima)
		
		int trozo = 0;
		
		for(int e = 0; i <= f; e++) { //Iteramos desde la cifra final a la inicial
			trozo += digitoN(numero, f) * potencia(10, e); //En cada iteraci�n tomamos el n�mero final y lo a�adimos a la izquierda
			f--; //En la siguiente iteraci�n tomar� la cifra a la izquierda de la de esta iteraci�n
		}
		
		return trozo;
	}
	
	public static int juntaNumeros(int n1, int n2) {
		if(n1 * n2 < 0) { //Si tienen distinto signo, se mantiene el signo del primer n�mero
			n2 *= -1;
		}
		
		n1 *= potencia(10, digitos(n2)); //Al n�mero primero le a�adimos a la derecha tantos ceros como cifras tenga el segundo n�mero
		n1 += n2; //Al primer n�mero con los ceros le sumamos el segundo n�mero
		
		//Ej: 123 y 56. 123 se convierte en 12300, y al sumar 56 se queda en 12356.
		
		return n1;
	}
}
