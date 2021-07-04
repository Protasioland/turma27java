package introducao;

import java.util.Scanner;

public class Lista2Ex1 {


	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int m, pesoTomate, e;
		
		System.out.println("Quantos quilos de tomate temos hoje");
		pesoTomate=leia.nextInt();
		
		m=(pesoTomate-50);
		e=(pesoTomate-50)*4;
		
		if (pesoTomate>50) {
			System.out.println("Excesso de peso, taxa a cobrar de:"+e+" reais");
			
		if (pesoTomate<50) {
			System.out.println("Sem excesso de peso\\n");
		}
		}
	}
}

	

