package ejercicios3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Qué mes naciste?");
		int mes = scan.nextInt();
		System.out.println();
		
		System.out.println("¿Qué día naciste?");
		int dia = scan.nextInt();
		System.out.println();
		
		if(mes == 2) { //Los bisiestos no existen
			if(dia == 29) {
				dia = 28;
			}
		}
		
		if(mes >= 2) { //Febrero
			dia += 31;
		}
		if(mes >= 3) {
			dia += 28;
		}
		if(mes >= 4) { //Abril
			dia += 31;
		}
		if(mes >= 5) {
			dia += 30;
		}
		if(mes >= 6) { //Junio
			dia += 31;
		}
		if(mes >= 7) {
			dia += 30;
		}
		if(mes >= 8) { //Agosto
			dia += 31;
		}
		if(mes >= 9) {
			dia += 31;
		}
		if(mes >= 10) { //Octubre
			dia += 30;
		}
		if(mes >= 11) {
			dia += 31;
		}
		if(mes >= 12) { //Diciembre
			dia += 30;
		}
		
		if(dia >= 80 & dia < 111) {
			System.out.println("Tu horóscopo es Aries.");
		} else {
			if(dia >= 111 & dia < 142) { 
				System.out.println("Tu horóscopo es Tauro.");
			} else {
				if(dia >= 142 & dia < 151) {
					System.out.println("Tu horóscopo es Géminis.");
				} else {
					if(dia >= 151 & dia < 204) { 
						System.out.println("Tu horóscopo es Cáncer.");
					} else {
						if(dia >= 204 & dia < 235) {
							System.out.println("Tu horóscopo es Leo.");
						} else {
							if(dia >= 235 & dia < 266) { 
								System.out.println("Tu horóscopo es Virgo.");
							} else {
								if(dia >= 266 & dia < 296) {
									System.out.println("Tu horóscopo es Libra.");
								} else {
									if(dia >= 296 & dia < 327) { 
										System.out.println("Tu horóscopo es Escorpio.");
									} else {
										if(dia >= 327 & dia < 356) {
											System.out.println("Tu horóscopo es Sagitario.");
										} else {
											if(dia >= 356 | dia < 21) { 
												System.out.println("Tu horóscopo es Capricornio.");
											} else {
												if(dia >= 21 & dia < 50) {
													System.out.println("Tu horóscopo es Acuario.");
												} else {
													if(dia >= 50 & dia < 80) { 
														System.out.println("Tu horóscopo es Piscis.");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	
	
		scan.close();
	}
}
