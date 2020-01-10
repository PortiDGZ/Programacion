package Ejercicio3;

import java.util.*;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);

			System.out.println("Introduzca la base imponible: ");
			
				double BI=entrada.nextInt();
			
			System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
			
				String IVA=entrada.next();
		
			System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
			
				String codProm=entrada.next();
				
					double precio = 0;
				
					double precioIVA = 0;
				
						switch (IVA) {
					
							case "general":
						
								precioIVA = BI + (BI * 0.21);
						
									break;
							
							case "reducido":
						
								precioIVA = BI + (BI * 0.1);
						
									break;
								
							case "superreducido":
						
								precioIVA = BI + (BI * 0.04);
						
									break;
					
							}
					
						switch (codProm) {
							
							case "nopro":
							
								precio = precioIVA - 0;
								
									break;
									
							case "mitad":
								
								precio = precioIVA / 2;
								
									break;
									
							case "meno5":
								
								precio = precioIVA - 5;
								
									break;
								
							case "5porc":
								
								precio = precioIVA - (precio * 0.05);
								
									break;
							
						}
						
							System.out.println("Base imponible: " + BI);
							
							System.out.println("IVA: " + IVA);
							
							System.out.println("Precio con IVA: " + (precioIVA));
							
							System.out.println("Cód. Promo. " + "(" + codProm + ")" );
							
							System.out.println("TOTAL: " + precio);
	
			}

}