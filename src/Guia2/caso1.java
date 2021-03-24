package Guia2;

import java.util.Scanner;

public class caso1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese su edad: ");
	int e = sc.nextInt();
	
	if (e>=18)
	    System.out.println("Es mayor de edad");
	
	else
		System.out.println("Es menor de edad");
	
	

}
}