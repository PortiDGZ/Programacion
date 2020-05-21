package ejerciciosTema9;

import java.awt.geom.*;
import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Random
		Random rand = new Random();
		
		// Punto 1
		Point2D p1 = new Point2D.Double(rand.nextDouble() * 100, rand.nextDouble() * 100);
		
		// Punto 2
		Point2D p2 = new Point2D.Double(rand.nextDouble() * 100, rand.nextDouble() * 100);
		
		// Distancia
		System.out.println("Distancia: " + p1.distance(p2));
		
		// Punto medio
		System.out.println("Punto medio: " );
	}

}
