package Guia2;

import java.util.Scanner;

public class Caso4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese primer n�mero: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Ingrese segundo n�mero: ");
		float n2 = sc.nextFloat();
		
		String rpta = "";
		
		if (n1>n2) {
			rpta="El segundo n�mero es menor: " + n2;
		}
			
	    if (n2>n1) {
	    	rpta="El segundo n�mero es menor: " + n1;
	    }	
	    	
	    if (n1==n2) {
	    	rpta="Ambos son iguales.";
	    }
			
				
		
		System.out.println(rpta);
	}
	

}
