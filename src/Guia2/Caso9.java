package Guia2;

import java.util.Scanner;

public class Caso9 {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese nombre: ");
		String n = sc.nextLine();
		
		System.out.println("Primera nota: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Segunda nota: ");
		float n2 = sc.nextFloat();
		
		System.out.println("Número de asistencias: ");
        float a = sc.nextFloat();
        
        double p = (n1*0.3) + (n2*0.7);
        
        float asi = ((a/12) * 100);
        
        System.out.println("-----------------------");
        System.out.println(" R E S U L T A D O S");
        System.out.println("-----------------------");
        System.out.println("Alumnno: " + n);
        System.out.println("Promedio: " + p);
        System.out.println("Asistencias: " + asi + "%");
        
        if (p>=13 && a>=70) {
        	System.out.println("Estado: Aprobado");
        }
        else
        System.out.println("Estado: Desaprobado");
        
        
       
	}

	 
}
