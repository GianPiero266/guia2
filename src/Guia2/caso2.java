package Guia2;

import java.util.Scanner;

public class caso2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese n�mero: ");
	int n = sc.nextInt();
	
	String estado = "N�mero es impar";
	
	if (n % 2 == 0)
		estado = "N�mero es par";
	
	System.out.println("--Resultados--: ");
	System.out.println("Estado: " + estado);
			

}
}

