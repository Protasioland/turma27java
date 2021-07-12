package ListasJava;

import java.util.Scanner;

public class Lista3ex2 {
	
	public  static  void  main ( String [] args ) {
		Scanner leia= new Scanner(System.in);
				
		int par = 0 , impar = 0 ;
		int num [] =  new  int [ 10 ];
		
		for ( int x = 0 ; x <= 9 ; x ++ ) {
			System.out.println ( " Escreva um número inteiro: " );
			num [x] = leia . nextInt ();
			
			if (num [x] == 0 ) {
				System.out.println ( " 0 é neutro " );
			} else  if (num [x] % 2 != 0 ) {
				impar ++ ;
			} else  if (num [x] % 2 == 0 ) {
				par ++ ;
			}
		}
		
		System.out.printf ( " Você digitou% d números pares " , par);
		System.out.printf ( " \n Você digitou %d números impares " , impar);

	}

}
