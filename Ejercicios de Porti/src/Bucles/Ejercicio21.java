package Ejercicio4;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			
		
			System.out.print("Introduce un n�mero: ");
		  long num1 = entrada.nextLong();
		    
		    System.out.print("Introduce otro n�mero: ");
		    
		    long num2 = entrada.nextLong();
		    
		    long numpares = 0;
		    
		    long numimpares = 0;
		    
		    long numBasura = num1;
		    
		    long reves1 = 0;
		    
		    long numDig1 = 0;
		    
		    while (numBasura > 0){
		      reves1 = ((reves1*10) + (numBasura % 10));
		      numBasura /=10;
		      numDig1++;
		    }
		    numBasura = num2;
		    long reves2 = 0;
		    long numDig2 = 0;
		    while (numBasura > 0){
		      reves2 = ((reves2*10) + (numBasura % 10));
		      numBasura /=10;
		      numDig2++;
		    }
		    long revpar1;
		    long revpar2;
		    for (int i = 1; i <= numDig1+numDig2; i++){
		      revpar1 = (reves1%10)%2;
		      revpar2 = (reves2%10)%2;
		      if ((revpar1 == 0) && (i%2 != 0)){
		        numpares = ((numpares*10) + (reves1 % 10));
		        reves1 /=10;
		      } else if ((revpar1 != 0) && (i%2 != 0)){
		        numimpares = ((numimpares*10) + (reves1 % 10));
		        reves1 /=10;
		      } else if ((revpar2 == 0) && (i%2 == 0)){
		        numpares = ((numpares*10) + (reves2 % 10));
		        reves2 /=10;
		      } else {
		        numimpares = ((numimpares*10) + (reves2 % 10));
		        reves2 /=10;
		      }
		    }
		    System.out.println("El n�mero formado por las cifras pares es: "+numpares);
		    System.out.println("El n�mero formado por las cifras impares es: "+numimpares);
		  }
		}
