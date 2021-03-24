package Guia2;

import java.util.Scanner;

public class caso2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese número: ");
	int n = sc.nextInt();
	
	String estado = "Número es impar";
	
	if (n % 2 == 0)
		estado = "Número es par";
	
	System.out.println("--Resultados--: ");
	System.out.println("Estado: " + estado);
			

}
}

