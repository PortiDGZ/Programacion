package ejerciciosHerencia;

import java.util.*;

public class ColeccionableMain {

	public static void main(String[] args) {
		ArrayList<Coleccionable> coleccion = new ArrayList<Coleccionable>();
		
		coleccion.add(new Billete(4, "Usado en la URSS.", 10));
		coleccion.add(new Moneda(10, "Moneda oficial de Paquistán.", 3, "Cobre"));
		coleccion.add(new Sello(1, "Estampado de la Torre Eiffel.", "Francia"));
		
		for(int i = 0; i <= coleccion.size() - 1; i++) {
			System.out.println(coleccion.get(i));
		}
	}

}
