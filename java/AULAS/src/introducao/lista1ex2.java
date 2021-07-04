package introducao;

import java.util.Scanner;

public class lista1ex2 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int dias, meses, anos, respostaDias;
		
		System.out.println("Expresse sua idade em dias: ");
		respostaDias=leia.nextInt();
		
		anos=respostaDias/365;
		meses=(respostaDias%365)/30;
		dias=(respostaDias%365)%30;
		
		System.out.println("Sua idade em anos: "+anos);
		
		System.out.println("Sua idade em meses: "+meses);
		
		System.out.println("Duas idade em dias: "+dias);
		
	}

}
