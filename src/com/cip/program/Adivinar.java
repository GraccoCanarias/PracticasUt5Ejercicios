package com.cip.program;

import java.util.Scanner;

public class Adivinar {

	public static void main(String[] args) {

		int x = (int)(Math.random()*100.01)+1;
		int y = 1;
		int valor = 0;
			
			System.out.println("Adivine el Numero. Escriba");

				Scanner sc = new Scanner (System.in);
				valor = sc.nextInt();
			    y = y++; 	
				
	     do {
						
			if (valor>x) {
			System.out.println("Estas por encima");
			System.out.println("Escriba otro numero");
			valor = sc.nextInt();
			
			}
			else if (valor<x) {
			System.out.println("Estas por debajo");
			System.out.println("Escriba otro numero");
			valor = sc.nextInt();
			
			} 
			
	    } while (valor!=x);
		  	
			System.out.println(x);
			System.out.println(valor);
			System.out.println("Este es el numero");
			System.out.println("numero de intentos" + y);
			
	}
		
			
}
		

