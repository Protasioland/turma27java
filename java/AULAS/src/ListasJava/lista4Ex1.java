package ListasJava;

import java.util.Scanner;

public class lista4Ex1 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o
		 *  de uma atividade e o escreva em seguida. 
		 *  Encontre ap�s a maior pontua��o e a apresente. 
		 */
		
		 int[] notas;
		 int maiorNota=0;
		 notas= new int [5];
		 
		 
		 for(int i=0;i<5; i++) {
			 System.out.println("Digite a pontua��o: ");
			notas[i]= leia.nextInt();			
		 }
		 
		 for(int i=0;i<5; i++) {
			 
		     if (notas[i]> maiorNota) {
		      	   maiorNota=notas[i];
		     } 
		    }
		 System.out.printf("A pontua��o maxima �: ",maiorNota);
	}

}
	
