package introducao;

import java.util.Scanner;

public class lista2ex8 {

	
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int n;
		System.out.println("Digite um numero: ");
		n=leia.nextInt();
		
		if (n>100) {
			System.out.println("Seu numero é: "+n);
		}
		else {
			System.out.println("Seu numero é zero");
			
		}
		
	}
	
}
