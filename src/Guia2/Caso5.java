package Guia2;

import java.util.Scanner;

public class Caso5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese precio....: ");
		float precio = sc.nextFloat();
		
		System.out.println("Ingrese cantidad....: ");
		float cantidad = sc.nextFloat();
		
		float total = precio * cantidad;
		
		float dscto = 0;
		
		if (cantidad > 8) dscto = (float) 0.1 * total;
		
		float neto = total - dscto;
		
		System.out.println("\n------Resultados------");
		System.out.println("Total-------: " + total );
		System.out.println("Descuento----: " + dscto);
		System.out.println("Neto-----: " + neto);

}
}