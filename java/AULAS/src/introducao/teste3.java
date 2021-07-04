package introducao;

import java.util.Scanner;

public class teste3 {
	
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int ano,meses,dias,respostaDias;
		
		System.out.println("Qual sua idade em anos:");
		ano=leia.nextInt();
		System.out.println("Qual sua idade em meses:");
		meses=leia.nextInt();
		System.out.println("Qual sua idade em dias:");
		dias=leia.nextInt();
		respostaDias=(ano*365)+(meses*30)+dias;
		
		
		System.out.println(respostaDias);
		
		
		
		
	}

}
