package ListasJava;

import java.util.Scanner;

public class lista2ex1 {

	public  static  void  main ( String [] args ) {
		
		// 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int a, b, c;
		
		Scanner leia= new Scanner(System.in);
		System.out.println();
		System.out.println ( " Digite o valor de A: " );
		a = leia.nextInt ();
		
		System.out.println ( " Digite o valor de B: " );
		b = leia . nextInt ();
		
		System.out.println ( " Digite o valor de C: " );
		c = leia . nextInt ();
		
		if (a > c && a > b) {
			System.out.println ( " O maior n�mero �: " + a);
		} else  if (b > c && b > a) {
			System.out.println ( " O maior n�mero �: " + b);
		} else  if (c > b && c > a) {
			System.out.println ( " O maior n�mero �: " + c);
		} else {
			System.out.println ( " Os n�meros s�o iguais " );
		}

	}

}




