package Guia2;

import java.util.Scanner;

public class Caso12 {
	
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("Empleado...: ");
    	 String empleado = sc.nextLine();
    	 
    	 System.out.println("Nivel [1-4]: ");
    	 int nivel = sc.nextInt();
    	 
    	 System.out.println("Sueldo...: ");
    	 float sueldo = sc.nextFloat();
    	 
    	 float incremento = 0;
    	 
    	 switch (nivel) {
    	     case 1:
    		     incremento = 0.045f * sueldo;
    		     break;
    	     case 2:
    		     incremento = 0.06f * sueldo;
    		     break;
    	     case 3:
    		     incremento = 0.085f * sueldo;
    		     break;
    	     case 4:
    		     incremento = 0.11f * sueldo;
    		     break;
             default:
        	     incremento = 0f * sueldo;
        	     }
        	    
    	 float sueldo_nuevo = incremento + sueldo;
    	 
         System.out.println("....Resultados....");
         System.out.println("Nuevo sueldo: " + sueldo_nuevo);
    		 
    	  }
}
