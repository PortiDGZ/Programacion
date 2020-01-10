package Ejercicio3;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		int comida;
		String comidatext = null;
		double preciocom = 0;
		double preciobeb = 0;
		String pitufo;
		int bebida;
		String bebidatext;
		String pitufotext;
		
		
		Scanner entradacb = new Scanner(System.in);
		
		System.out.println("¿Qué has comido?: ");
		
		System.out.println("1 - Palmera");
		
		System.out.println("2 - Donut");
		
		System.out.println("3 - Pitufo");
		
		comida = entradacb.nextInt();
		
		switch(comida) {
		
		case 1: preciocom = preciocom + 1.40;
		
				comidatext = "Palmera: ";
		
		break;
		
		case 2: preciocom = preciocom + 1;
		
		comidatext = "Donut";
		
		break;
		
		case 3: System.out.print("¿Era con aceite o con tortilla?: ");
		
		pitufo =  entradacb.next();
		pitufo.toLowerCase();
		
		if(pitufo.contentEquals("aceite")) {
			comidatext = "Pitufo con aceite: ";
			preciocom = preciocom + 1.20;
		}else preciocom = preciocom + 1.60;
		comidatext = "Pitufo con tortilla: ";
		
		break;
		
		}
		
System.out.println("¿Qué has bebido?: ");
		
		System.out.println("1 - Zumo");
		
		System.out.println("2 - Café");
		
		bebida = entradacb.nextInt();
		
		if(bebida == 1) {
			
			bebidatext = "Zumo: ";
			
		}else bebidatext = "Café: ";
		
switch(bebida) {
		
		case 1: preciobeb = preciobeb + 1.50;
		
		break;
		
		case 2: preciobeb = preciobeb + 1.20;
		
		break;
		
		
}

	double total = preciocom + preciobeb;

		System.out.println(comidatext + preciocom + "€");
		
		System.out.println(bebidatext + preciobeb + "€");
		
		System.out.println("Total: " + total + "€");



	}

}
