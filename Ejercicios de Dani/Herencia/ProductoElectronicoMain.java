package ejerciciosHerencia;

import java.util.*;

public class ProductoElectronicoMain {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<ProductoElectronico> carro = new ArrayList<ProductoElectronico>();

	public static void main(String[] args) {
		crearCarro();
		mostrarTicket();
	}

	private static void mostrarTicket() {
		double total = 0;
		
		for(int i = 0; i <= carro.size() - 1; i++) {
			ProductoElectronico producto = carro.get(i);
			total += producto.precioTotal();
			System.out.println(producto);
		}
		
		System.out.println();
		System.out.println("Total: " + total + "€");
	}

	private static void crearCarro() {
		while(pedirAñadir()) {
			añadirProducto();
		}
	}

	private static void añadirProducto() {
		switch(pedirTipo()) {
		case 1:
			añadirImpresora();
			break;
		case 2:
			añadirSwitch();
			break;
		case 3:
			añadirMonitor();
			break;
		default:
			añadirOtro();
			break;
		}
	}

	private static void añadirMonitor() {
		scan.nextLine();
		System.out.println();
		
		System.out.print("Pulgadas: ");
		double pulgadas = scan.nextDouble();
		System.out.println();
		
		System.out.print("Precio: ");
		double precio = scan.nextDouble();
		System.out.println();
		
		System.out.print("Consumo: ");
		double consumo = scan.nextDouble();
		System.out.println();
		
		System.out.print("Cantidad: ");
		int cantidad = scan.nextInt();
		System.out.println();
		
		carro.add(new Monitor(precio, consumo, cantidad, pulgadas));
		
		scan.nextLine();
		System.out.println();
	}

	private static void añadirSwitch() {
		scan.nextLine();
		System.out.println();
		
		System.out.print("Edicion: ");
		String edicion = scan.nextLine();
		System.out.println();
		
		System.out.print("Color de joycon: ");
		String color = scan.nextLine();
		System.out.println();
		
		System.out.print("Precio: ");
		double precio = scan.nextDouble();
		System.out.println();
		
		System.out.print("Consumo: ");
		double consumo = scan.nextDouble();
		System.out.println();
		
		System.out.print("Cantidad: ");
		int cantidad = scan.nextInt();
		System.out.println();
		
		carro.add(new Switch(precio, consumo, cantidad, edicion, color));
		
		scan.nextLine();
		System.out.println();
	}

	private static void añadirImpresora() {
		scan.nextLine();
		System.out.println();
		
		System.out.print("Capacidad: ");
		double capacidad = scan.nextDouble();
		System.out.println();
		
		System.out.print("Precio: ");
		double precio = scan.nextDouble();
		System.out.println();
		
		System.out.print("Consumo: ");
		double consumo = scan.nextDouble();
		System.out.println();
		
		System.out.print("Cantidad: ");
		int cantidad = scan.nextInt();
		System.out.println();
		
		carro.add(new Impresora(precio, consumo, cantidad, capacidad));
		
		scan.nextLine();
		System.out.println();
	}

	private static void añadirOtro() {
		scan.nextLine();
		System.out.println();
		
		System.out.print("Precio: ");
		double precio = scan.nextDouble();
		System.out.println();
		
		System.out.print("Consumo: ");
		double consumo = scan.nextDouble();
		System.out.println();
		
		System.out.print("Cantidad: ");
		int cantidad = scan.nextInt();
		System.out.println();
		
		carro.add(new ProductoElectronico(precio, consumo, cantidad));
		
		scan.nextLine();
		System.out.println();
	}

	private static int pedirTipo() {
		System.out.println("Tipo de producto:");
		System.out.println("1 - Impresora");
		System.out.println("2 - Switch");
		System.out.println("3 - Monitor");
		System.out.println("4 - Otro");
		System.out.println();
		
		return scan.nextInt();
	}

	private static boolean pedirAñadir() {
		System.out.println("¿Añadir producto? (S/N)");
		char respuesta = scan.nextLine().toUpperCase().charAt(0);
		System.out.println();
		
		if(respuesta == 'S') {
			return true;
		}
		
		return false;
	}

}
