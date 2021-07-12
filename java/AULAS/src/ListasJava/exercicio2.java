package ListasJava;

import java.util.Scanner;

public class exercicio2 {

	
	public static void main(String[] args) {
		// 2- Faça um programa que entre com três números e coloque em 
		//ordem crescente.
		
				int a, b, c;
				
				
				Scanner leia= new Scanner(System.in);
				
				System.out.println ( " Digite o primeiro número: " );
				a = leia.nextInt ();
				
				System.out.println( " Digite o segundo número: " );
				b = leia.nextInt ();
				
				System.out.println( " Digite o terceiro número: " );
				c = leia.nextInt ();
				
				
				if (a == b && b == c) {
					System.out.printf ( " Primeiro -% d Segundo -% d Terceiro -% d \n " , c, b, a);}
			    else  if (a >= b && b >= c) {
			    	System.out.printf ( " Primeiro -% d Segundo -% d Terceiro -% d \n " , c, b, a);}
			    else  if (a >= c && c >= b) {
			    	System.out.printf ( " Primeiro -% d Segundo -% d Terceiro -% d \n " , b, c, a);}
			    else  if (b >= a && a >= c) {
			    	System.out.printf( " Primeiro -% d Segundo -% d Terceiro -% d \n" , c, a, b);}
			    else  if (b >= c && c >= a) {
			    	System.out.printf ( " Primeiro -% d Segundo -% d Terceiro -% d \n " , a, c, b);}
			    else  if (c >= a && a >= b) {
			    	System.out.printf ( " Primeiro -% d Segundo -% d Terceiro -% d \n " , b, a, c);}
			    else  if (c >= b && b >= a) {
			    	System.out.printf ( " Primeiro -% d Segundo -% d Terceiro -% d \n " , a, b, c);}


			}

		}
	