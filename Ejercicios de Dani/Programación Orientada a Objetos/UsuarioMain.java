package ejerciciosTema9;

import java.util.Scanner;

public class UsuarioMain {

	static Scanner scan = new Scanner(System.in);

	static Usuario[] matriz = new Usuario[5];

	public static void main(String[] args) {
		// Llenar matriz
		cargar();
		
		// Mostrar matriz
		mostrar();

		scan.close();
	}

	// Muestra la matriz
	private static void mostrar() {
		for (Usuario elem : matriz) {
			System.out.println(elem);
			System.out.println();
		}
	}

	// Pide por teclado los datos de todos los usuarios
	private static void cargar() {
		for (int i = 0; i <= 4; i++) {
			System.out.println("Usuario " + (i + 1) + ".");
			System.out.println();

			matriz[i] = grabar();
		}
	}

	// Pide por teclado los datos de un usuario
	private static Usuario grabar() {
		String email = pedirString("Email: ", "^.+@.+\\..+$");

		String password;
		String password2;

		do {
			password = pedirString("Contraseña (mínimo 6 caracteres): ", "......+");
			password2 = pedirString("Repetir contraseña: ", ".*");
		} while (!password.equals(password2));

		return new Usuario(email, password);
	}

	// Pide un string por teclado
	private static String pedirString(String s, String regex) {
		String r = "";

		do {
			System.out.print(s);
			r = scan.nextLine();
			System.out.println();
		} while (!r.matches(regex));

		return r;
	}

}
