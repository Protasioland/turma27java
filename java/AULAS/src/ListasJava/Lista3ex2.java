package ListasJava;

import java.util.Scanner;

public class Lista3ex2 {
	
	public  static  void  main ( String [] args ) {
		Scanner leia= new Scanner(System.in);
				
		int par = 0 , impar = 0 ;
		int num [] =  new  int [ 10 ];
		
		for ( int x = 0 ; x <= 9 ; x ++ ) {
			System.out.println ( " Escreva um n�mero inteiro: " );
			num [x] = leia . nextInt ();
			
			if (num [x] == 0 ) {
				System.out.println ( " 0 � neutro " );
			} else  if (num [x] % 2 != 0 ) {
				impar ++ ;
			} else  if (num [x] % 2 == 0 ) {
				par ++ ;
			}
		}
		
		System.out.printf ( " Voc� digitou% d n�meros pares " , par);
		System.out.printf ( " \n Voc� digitou %d n�meros impares " , impar);

	}

}
