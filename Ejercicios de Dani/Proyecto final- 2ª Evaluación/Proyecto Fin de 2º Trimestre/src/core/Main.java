package core;

import java.io.*;
import java.util.*;

import productos.*;

public class Main {

	private static Cuenta cuentaActual = null;
	private static Carro carroActual = new Carro();
	public static Scanner scan = new Scanner(System.in);

	// Main
	public static void main(String[] args) {
		// Se inicializa el stock si no existe, o se carga desde un archivo
		inicializar();

		// Crear cuenta, cargar una cuenta o entrar como administrador
		cuenta();

		scan.close();
	}

	// Crear cuenta, cargar una cuenta o entrar como administrador
	private static void cuenta() {
		int opcionCuenta = 0;

		do {
			opcionCuenta = menuCuenta();

			switch (opcionCuenta) {
			case 1:
				cargarCuenta();
				usuario();
				break;
			case 2:
				crearCuenta();
				usuario();
				break;
			case 3:
				administrador();
				break;
			}
		} while (opcionCuenta != 4);
	}

	// Ver stock, a�adir productos al carro, eliminar productos del carro, ver
	// carro, pagar carro, encargar, ver clave, guardar carro, cargar carro, vaciar
	// carro, ver cuenta o a�adir dinero
	private static void usuario() {
		int opcion = 0;

		System.out.println("Bienvenido, " + cuentaActual.getTitular() + ".");
		System.out.println();

		do {
			opcion = menuUsuario();

			switch (opcion) {
			case 1:
				Stock.ver();
				break;
			case 2:
				Stock.ver();
				a�adirAlCarro();
				break;
			case 3:
				Stock.ver();
				eliminarDelCarro();
				break;
			case 4:
				System.out.println(carroActual);
				System.out.println();
				break;
			case 5:
				pagarCarro();
				break;
			case 6:
				cuentaActual.verEncargables();
				seleccionarEncargo();
				break;
			case 7:
				cuentaActual.verDescargables();
				seleccionarClave();
				break;
			case 8:
				try {
					carroActual.crearArchivo();
					System.out.println("Carro guardado.");
				} catch (IOException e) {
					System.out.println("No se ha podido crear carro.");
				}
				System.out.println();
				break;
			case 9:
				cargarCarro();
				break;
			case 10:
				carroActual = new Carro();
				System.out.println("Nuevo carro creado.");
				System.out.println();
				break;
			case 11:
				System.out.println(cuentaActual);
				System.out.println();
				cuentaActual.verAdquiridos();
				break;
			case 12:
				try {
					cuentaActual.a�adirDinero();
				} catch (IOException e) {
					System.out.println("No se ha podido guardar el cambio.");
				}
				System.out.println();
				System.out.println("Dinero a�adido.");
				System.out.println();
				break;
			}
		} while (opcion != 13);
	}

	// Selecciona un producto de la cuenta y lo encarga
	private static void seleccionarEncargo() {
		int tama�o = cuentaActual.getSize();
		if (tama�o > 0) {
			int producto = pedirInt("Elija un producto: ", tama�o);
			try {
				cuentaActual.encargar(producto);
			} catch (IOException e) {
				System.out.println("No se ha podido guardar el cambio.");
			}

		} else {
			System.out.println("No posee ning�n producto.");
		}
		System.out.println();
	}

	// Selecciona un producto de la cuenta y lo encarga
	private static void seleccionarClave() {
		int tama�o = cuentaActual.getSize();
		if (tama�o > 0) {
			int producto = pedirInt("Elija un producto: ", tama�o);

			try {
				cuentaActual.verClave(producto);
			} catch (IOException e) {
				System.out.println("No se ha podido guardar el cambio.");
			}

		} else {
			System.out.println("No posee ning�n producto.");
		}
		System.out.println();
	}

	// Pide un objeto y su cantidad para quitarlos del carro
	private static void eliminarDelCarro() {
		int tama�oStock = Stock.tama�o();
		int producto = pedirInt("Elija un producto: ", tama�oStock);

		Producto p = Stock.getProducto(producto);

		System.out.println("1 - Eliminar una cantidad.");
		System.out.println("2 - Eliminar todos.");
		int opcion = pedirInt("Elija una opci�n: ", 2);

		if (opcion == 1) {
			eliminarCantidad(p);
		} else if (opcion == 2) {
			eliminarTodos(p);
		}
	}

	// Eliminar todas las instancias del producto elegido
	private static void eliminarTodos(Producto p) {
		try {
			carroActual.eliminarTodos(p);
			System.out.println();
			System.out.println("Producto eliminado.");
		} catch (IOException e) {
			System.out.println("El carro no se ha podido guardar.");
		}
		System.out.println();
	}

	// Eliminar una cantidad concreta del producto elegido
	private static void eliminarCantidad(Producto p) {
		int cantidad = pedirInt("Cantidad a eliminar: ", 99);
		try {
			carroActual.eliminar(p, cantidad);
			System.out.println();
			System.out.println("Producto eliminado.");
		} catch (IOException e) {
			System.out.println("El carro no se ha podido guardar.");
		}
		System.out.println();
	}

	// Resta el precio del carro a la cuenta
	private static void pagarCarro() {
		Dinero precio = carroActual.precioTotal();

		System.out.println();

		boolean pagado = cuentaActual.pagar(precio);

		if (pagado) {
			try {
				cuentaActual.a�adirProductos(carroActual);
			} catch (IOException e) {
				System.out.println("No se ha podido guardar el cambio.");
			}
		}
	}

	// Cargar un carro desde un archivo
	private static void cargarCarro() {
		System.out.print("Nombre del carro: ");
		String carro = scan.nextLine();
		System.out.println();

		try (FileInputStream fis = new FileInputStream(new File(carro + ".carro"))) {
			try (ObjectInputStream stream = new ObjectInputStream(fis)) {
				carroActual = (Carro) stream.readObject();
				System.out.println("Carro cargado.");
			} catch (ClassNotFoundException e) {
				System.out.println("Error de entrada/salida.");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Carro no encontrado.");
		} catch (IOException e) {
			System.out.println("Error de entrada/salida.");
		}
		System.out.println();
	}

	// Muestra al usuario las opciones y recoge la elegida
	private static int menuUsuario() {
		int opcion = 0;

		opcionesUsuario();
		opcion = pedirInt("Elige acci�n: ", 13);

		return opcion;
	}

	// Muestra al usuario las opciones
	private static void opcionesUsuario() {
		System.out.println("1 - Ver stock.");
		System.out.println("2 - A�adir producto al carro.");
		System.out.println("3 - Eliminar producto del carro.");
		System.out.println("4 - Ver carro.");
		System.out.println("5 - Pagar carro.");
		System.out.println("6 - Encargar producto.");
		System.out.println("7 - Ver clave de producto.");
		System.out.println("8 - Guardar carro.");
		System.out.println("9 - Cargar carro.");
		System.out.println("10 - Nuevo carro.");
		System.out.println("11 - Ver cuenta.");
		System.out.println("12 - A�adir fondos a la cuenta.");
		System.out.println("13 - Cerrar sesi�n.");
		System.out.println();
	}

	// Pide un objeto y su cantidad para a�adirlos al carro
	private static void a�adirAlCarro() {
		int tama�oStock = Stock.tama�o();
		int producto = pedirInt("Elija un producto: ", tama�oStock);

		Producto p = Stock.getProducto(producto);

		int cantidad = pedirInt("Cantidad del producto: ", 99);

		try {
			carroActual.a�adir(p, cantidad);
			System.out.println();
			System.out.println("Producto a�adido.");
		} catch (IOException e) {
			System.out.println("El carro no se ha podido guardar.");
		}

		System.out.println();
	}

	// Carga cuentaActual desde un archivo
	private static void cargarCuenta() {
		System.out.print("Titular de la cuenta: ");
		String titular = scan.nextLine();
		System.out.println();

		try (FileInputStream fis = new FileInputStream(new File(titular + ".cuenta"))) {
			try (ObjectInputStream stream = new ObjectInputStream(fis)) {
				cuentaActual = (Cuenta) stream.readObject();
			} catch (ClassNotFoundException e) {
				System.out.println("Error de entrada/salida.");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cuenta no encontrada.");
		} catch (IOException e) {
			System.out.println("Error de entrada/salida.");
		}
		System.out.println();
	}

	// Pide los datos de una cuenta y la crea
	private static void crearCuenta() {
		try {
			cuentaActual = new Cuenta();
		} catch (IOException e) {
			System.out.println("Error de entrada/salida.");
		}
		System.out.println();
	}

	// Ver stock, a�adir o quitar productos
	private static void administrador() {
		int opcion = 0;

		do {
			opcion = menuAdministrador();

			switch (opcion) {
			case 1:
				Stock.ver();
				break;
			case 2:
				a�adirAStock();
				break;
			case 3:
				try {
					Stock.eliminar(pedirInt("N�mero de producto a eliminar: ", 4) - 1);
				} catch (IOException e) {
					System.out.println("Error de entrada/salida.");
				}
				break;
			}
		} while (opcion != 4);
	}

	// Pedir y a�adir un producto a stock
	private static void a�adirAStock() {
		int tipo = 0;
		do {
			mostrarTipos();
			tipo = pedirInt("Tipo de producto: ", 4);
		} while (tipo < 1 || tipo > 4);

		a�adir(tipo);

		System.out.println();
	}

	// A�adir un producto a stock
	private static void a�adir(int tipo) {
		Producto p = null;

		switch (tipo) {
		case 1:
			p = new Juego();
			break;
		case 2:
			p = new PC();
			break;
		case 3:
			p = new Pelicula();
			break;
		case 4:
			p = new Suscripcion();
			break;
		}

		try {
			Stock.a�adir(p);
		} catch (IOException e) {
			System.out.println("No se ha podido acceder al stock.");
		}
	}

	private static void mostrarTipos() {
		System.out.println("1 - Juego.");
		System.out.println("2 - PC.");
		System.out.println("3 - Pel�cula.");
		System.out.println("4 - Suscripci�n.");
	}

	// Ver stock, a�adir o quitar productos
	private static int menuAdministrador() {
		int opcion = 0;

		opcionesAdministrador();
		opcion = pedirInt("Elige acci�n: ", 4);

		return opcion;
	}

	// Muestra las opciones en el men� de administrador
	private static void opcionesAdministrador() {
		System.out.println("1 - Ver stock.");
		System.out.println("2 - A�adir producto.");
		System.out.println("3 - Eliminar producto.");
		System.out.println("4 - Cerrar sesi�n.");
	}

	// Crear cuenta, cargar una cuenta o entrar como administrador
	private static int menuCuenta() {
		int opcion = 0;

		opcionesCuenta();
		opcion = pedirInt("Elige acci�n: ", 4);

		return opcion;
	}

	// Muestra un texto y recoge por teclado un integer
	private static int pedirInt(String texto, int max) {
		int opcion = 0;

		do {
			System.out.print(texto);
			try {
				opcion = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("No se ha introducido una opci�n v�lida.");
			}
			Main.scan.nextLine();
		} while (opcion <= 0 || opcion >= max + 1);

		System.out.println();

		return opcion;
	}

	// Muestra las opciones en el men� de cuentas
	private static void opcionesCuenta() {
		System.out.println("1 - Cargar cuenta.");
		System.out.println("2 - Crear nueva cuenta.");
		System.out.println("3 - Entrar como administrador.");
		System.out.println("4 - Salir.");
	}

	// Se inicializa el stock si no existe, o se carga desde un archivo
	private static void inicializar() {
		try {
			Stock.cargarOInicializar();
		} catch (IOException e) {
			System.out.println("No se ha podido acceder al stock.");
		} catch (ClassNotFoundException e) {
			System.out.println("Archivo stock corrupto.");
		}
	}

}
