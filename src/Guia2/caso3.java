package Guia2;

import java.util.Scanner;

public class caso3 {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese primer n�mero:");
		int n1 = sc.nextInt();
		
		System.out.println("Ingrese segundo n�mero:");
		int n2 = sc.nextInt();
		
		
		String mensaje = "";
		
		if (n1 == n2)
			mensaje = "Los n�meros son iguales";
		else if (n1 > n2)
			mensaje = "El n�mero " + n1 + " es mayor";
		else
			mensaje = "El n�mero " + n2 + " es mayor";
		
	   System.out.println("\n-------Resultados-------");
	   System.out.println("Mensaje: " + mensaje);
	}
}
