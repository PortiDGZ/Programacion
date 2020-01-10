package Ejercicios_M�todos;

import java.util.Scanner;

public class Ejercicio6 {

	//Este m�todo implementa el algoritmo que permite pasar de manera directa un n�mero binario a hexadecimal (expresado como String)
	public static String binarioAHexa(int bin) {
		String hex = "";
		int l = Ejercicio1.digitos(bin);
		int bucles = l / 4; //Una iteraci�n por cada 4 cifras
		if(l % 4 != 0) { //Si hay cifras sobrantes se a�ade una iteraci�n para ellas
			bucles++;
		}
		
		for(int i = 1; i <= bucles; i++) { //En cada iteraci�n se convierten 4 cifras a una cifra hexadecimal
			l = Ejercicio1.digitos(bin); //Se obtiene el nuevo n�mero de cifras
			int cifra = Ejercicio1.trozoDeNumero(bin, l - 4, l); //Se toman las 4 �ltimas cifras
			bin = Ejercicio1.trozoDeNumero(bin, 0, l - 5); //Se eliminan dichas cifras del n�mero binario
			
			char cifraHex = cifraBinarioAHex(cifra); //Las 4 cifras tomadas se convierten en una cifra hexadecimal expresada como char
			hex = cifraHex + hex; //Se a�ade al n�mero la cifra obtenida
		}
		
		return hex;
	}
	
	//Este m�todo recibe un n�mero binario de 4 cifras y la convierte a una cifra hexadecimal expresada como char
	private static char cifraBinarioAHex(int bin) {
		char hex = '0';
		
		if(bin >= 1010) { //Los n�meros mayores a 9 se devuelven como letras
			switch(bin) {
			case 1010:
				hex = 'A';
				break;
				
			case 1011:
				hex = 'B';
				break;
				
			case 1100:
				hex = 'C';
				break;
				
			case 1101:
				hex = 'D';
				break;
				
			case 1110:
				hex = 'E';
				break;
				
			case 1111:
				hex = 'F';
				break;
				
			}
		} else { //Los n�meros menores a 10 se devuelven como son
			bin = Ejercicio4.binarioADecimal(bin);
			hex = Integer.toString(bin).charAt(0);
		}
		
		return hex;
	}
	
	//Este m�todo implementa el algoritmo que permite pasar de manera directa un n�mero binario a octal
	public static int binarioAOctal(int bin) {
		int oct = 0;
		int l = Ejercicio1.digitos(bin);
		int bucles = l / 3; //Una iteraci�n por cada 3 cifras
		if(l % 3 != 0) { //Si hay cifras sobrantes se a�ade una iteraci�n para ellas
			bucles++;
		}
		
		for(int i = 1; i <= bucles; i++) { //En cada iteraci�n se convierten 3 cifras a una cifra octal
			l = Ejercicio1.digitos(bin); //Se obtiene el nuevo n�mero de cifras
			int cifra = Ejercicio1.trozoDeNumero(bin, l - 3, l); //Se toman las 3 �ltimas cifras
			bin = Ejercicio1.trozoDeNumero(bin, 0, l - 4); //Se eliminan dichas cifras del n�mero binario
			
			int cifraOct = Ejercicio4.binarioADecimal(cifra); //Las 3 cifras tomadas se convierten en una cifra octal
			oct += cifraOct * Ejercicio1.potencia(10, i - 1); //Se a�ade al n�mero la cifra obtenida
		}
		
		return oct;
	}
	
	//Este m�todo implementa el algoritmo que permite pasar de manera directa un n�mero hexadecimal a binario
	public static int hexaABinario(String hex) {
		hex = hex.toUpperCase();
		int bin = 1; //Se inicializa a un 1 que posteriormente debe ser retirado
		int l = hex.length();
		
		for(int i = 0; i <= l - 1; i++) { //Una iteraci�n por cada cifra
			int cifraHex = charHexACifra(hex.charAt(i)); //Se obtiene el char que representa la cifra hexadecimal y se obtiene su valor como int
			
			int cifraBinario = cifraHexaABinario(cifraHex); //Se convierte la cifra hexadecimal a un n�mero de 4 o menos cifras binario
			
			//Si el n�mero tiene menos de 4 cifras, se a�ade un 0 por cada cifra faltante
			if(cifraBinario <= 111) {
				bin = Ejercicio1.juntaNumeros(bin, 0);
			}
			if(cifraBinario <= 11) {
				bin = Ejercicio1.juntaNumeros(bin, 0);
			}
			if(cifraBinario <= 1) {
				bin = Ejercicio1.juntaNumeros(bin, 0);
			}
			
			bin = Ejercicio1.juntaNumeros(bin, cifraBinario); //Se concatena el n�mero al resultado
		}
		
		bin = Ejercicio1.quitaPorDelante(bin, 1); //Se elimina el 1 sobrante
		
		return bin;
	}
	
	//Este m�todo toma un char de un hexadecimal (expresado como String) y devuelve su valor como integer
	private static int charHexACifra(char hex) {
		if(Character.isDigit(hex)) {
			return Integer.parseInt(hex + ""); //Los numerales se devuelven como son
		} else {
			switch(hex) { //Las letras corresponden a n�meros de 2 cifras
			case 'A':
				return 10;
				
			case 'B':
				return 11;
				
			case 'C':
				return 12;
				
			case 'D':
				return 13;
				
			case 'E':
				return 14;
				
			case 'F':
				return 15;
			}
		}
		
		return 0;
	}
	
	//Este m�todo recibe una cifra en hexadecimal y la convierte a un n�mero binario de 4 cifras
	private static int cifraHexaABinario(int hex) {
		int bin = 0;
		
		if(hex >= 8) {
			bin += 1000;
			hex -= 8;
		}
		if(hex >= 4) {
			bin += 100;
			hex -= 4;
		}
		if(hex >= 2) {
			bin += 10;
			hex -= 2;
		}
		if(hex == 1) {
			bin++;
		}
		
		return bin;
	}
	
	//Este m�todo implementa el algoritmo que permite pasar de manera directa un n�mero octal a binario
	public static int octalABinario(int oct) {
		int bin = 1; //Se inicializa a un 1 que posteriormente debe ser retirado
		int l = Ejercicio1.digitos(oct);
		
		for(int i = 0; i <= l - 1; i++) { //Una iteraci�n por cada cifra
			int cifraOctal = Ejercicio1.digitoN(oct, i); //Se obtiene la cifra octal
			
			int cifraBinario = cifraOctalABinario(cifraOctal);  //Se convierte la cifra octal a un n�mero de 3 o menos cifras binario
			
			//Si el n�mero tiene menos de 3 cifras, se a�ade un 0 por cada cifra faltante
			if(cifraBinario <= 11) {
				bin = Ejercicio1.juntaNumeros(bin, 0);
			}
			if(cifraBinario <= 1) {
				bin = Ejercicio1.juntaNumeros(bin, 0);
			}
			
			bin = Ejercicio1.juntaNumeros(bin, cifraBinario); //Se concatena el n�mero al resultado
		}
		
		bin = Ejercicio1.quitaPorDelante(bin, 1); //Se elimina el 1 sobrante
		
		return bin;
	}
	
	//Este m�todo recibe una cifra en octal y la convierte a un n�mero binario de 3 cifras
	private static int cifraOctalABinario(int oct) {
		int bin = 0;
		
		if(oct >= 4) {
			bin += 100;
			oct -= 4;
		}
		if(oct >= 2) {
			bin += 10;
			oct -= 2;
		}
		if(oct == 1) {
			bin++;
		}
		
		return bin;
	}

	public static void main(String[] args) {
		//Este programa solo implementa conversiones desde o hacia binario. El resto de conversiones se realizan con una conversi�n a binario como paso intermedio.
		
		Scanner scan = new Scanner(System.in);
		
		int opcion;
		
		do {
			int bin = 0, n = 0, oct = 0;
			String hex = "";
			
			System.out.println("Elija una opci�n:");
			System.out.println("1. Binario.");
			System.out.println("2. Octal.");
			System.out.println("3. Decimal.");
			System.out.println("4. Hexadecimal.");
			System.out.println("Otro: Salir.");
			
			opcion = scan.nextInt();
			
			System.out.println();
			
			switch(opcion) {
			case 1:
				System.out.print("Introduzca un n�mero en binario: ");
				bin = scan.nextInt();
				System.out.println();
				break;
				
			case 2:
				System.out.print("Introduzca un n�mero en octal: ");
				oct = scan.nextInt();
				System.out.println();
				break;
				
			case 3:
				System.out.print("Introduzca un n�mero en decimal: ");
				n = scan.nextInt();
				System.out.println();
				break;
				
			case 4:
				System.out.print("Introduzca un n�mero en hexadecimal: ");
				hex = scan.next();
				System.out.println();
				break;
				
			default:
				opcion = 0;
				break;
			}
			
			if(opcion != 0) {
				System.out.println("Convertir en:");
				System.out.println("1. Binario.");
				System.out.println("2. Octal.");
				System.out.println("3. Decimal.");
				System.out.println("4. Hexadecimal.");
				System.out.println("Otro: Salir.");
				
				opcion += scan.nextInt() * 10;
				
				System.out.println();
			
				switch(opcion) {
				case 31:
					n = Ejercicio4.binarioADecimal(bin);
					
					System.out.println("N�mero en decimal: " + n);
					break;
					
				case 21:
					oct = binarioAOctal(bin);
					
					System.out.println("N�mero en octal: " + oct);
					break;
					
				case 41:
					hex = binarioAHexa(bin);
					
					System.out.println("N�mero en hexadecimal: " + hex);
					break;
					
				case 13:
					bin = Ejercicio5.decimalABinario(n);
					
					System.out.println("El n�mero en binario es: " + bin);
					break;
					
				case 23:
					bin = Ejercicio5.decimalABinario(n);
					oct = binarioAOctal(bin);
					
					System.out.println("El n�mero en octal es: " + oct);
					break;
					
				case 43:
					bin = Ejercicio5.decimalABinario(n);
					hex = binarioAHexa(bin);
					
					System.out.println("El n�mero en hexadecimal es: " + hex);
					break;
					
				case 12:
					bin = octalABinario(oct);
					
					System.out.println("El n�mero en binario es: " + bin);
					break;
					
				case 32:
					bin = octalABinario(oct);
					n = Ejercicio4.binarioADecimal(bin);
					
					System.out.println("El n�mero en decimal es: " + n);
					break;
					
				case 42:
					bin = octalABinario(oct);
					hex = binarioAHexa(bin);
					
					System.out.println("El n�mero en hexadecimal es: " + hex);
					break;
					
				case 14:
					bin = hexaABinario(hex);
					
					System.out.println("El n�mero en binario es: " + bin);
					break;
					
				case 24:
					bin = hexaABinario(hex);
					oct = binarioAOctal(bin);
					
					System.out.println("El n�mero en octal es: " + oct);
					break;
					
				case 34:
					bin = hexaABinario(hex);
					n = Ejercicio4.binarioADecimal(bin);
					
					System.out.println("El n�mero en decimal es: " + n);
					break;
					
				default:
					if(opcion == 11 | opcion == 22 | opcion == 33 | opcion == 34) {
						System.out.println("El n�mero no necesita conversi�n.");
					} else {
						opcion = 0;
					}
					break;
				}
	
				System.out.println();
			}
		} while(opcion != 0);
		
		scan.close();
	}
}
