package ListasJava;

import java.util.Scanner;

public class lista4Ex1 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação
		 *  de uma atividade e o escreva em seguida. 
		 *  Encontre após a maior pontuação e a apresente. 
		 */
		
		 int[] notas;
		 int maiorNota=0;
		 notas= new int [5];
		 
		 
		 for(int i=0;i<5; i++) {
			 System.out.println("Digite a pontuação: ");
			notas[i]= leia.nextInt();			
		 }
		 
		 for(int i=0;i<5; i++) {
			 
		     if (notas[i]> maiorNota) {
		      	   maiorNota=notas[i];
		     } 
		    }
		 System.out.printf("A pontuação maxima é: ",maiorNota);
	}

}
	
