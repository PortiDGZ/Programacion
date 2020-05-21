package Ejercicios;

import java.util.*;

public class FechaMain {
	
	private static Scanner scan = new Scanner(System.in);
	private static String[] fecha;
	private static Fecha ini;
	private static Fecha fin;

	public static void main(String[] args) {
		ini = fechaInicial();
		fin = fechaFinal();
		
		mostrarIntermedios();
	}

	private static void mostrarIntermedios() {
		ini = ini.diaSiguiente();
		
		while(ini.fechaMenor(fin)) {
			ini.verFecha();
			System.out.println();
			ini = ini.diaSiguiente();
		}
	}

	private static Fecha fechaFinal() {
		System.out.println("Introduzca la fecha final: ");
		fecha = scan.next().split("/");
		System.out.println();
		return new Fecha(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]));
	}

	private static Fecha fechaInicial() {
		System.out.println("Introduzca la fecha inicial: ");
		fecha = scan.next().split("/");
		System.out.println();
		return new Fecha(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]));
	}

}
