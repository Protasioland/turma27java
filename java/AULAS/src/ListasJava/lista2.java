package ListasJava;

import java.util.Scanner;

public class lista2 {

		public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		double num, raiznum, pownum;
		
		System.out.println("Digite um n�mero inteiro: ");
		num = leia.nextDouble();
		
		if(num<0) {
			System.out.println("N�mero negativo.");
		} else if(num%2==0) {
			raiznum = Math.sqrt(num);
			System.out.printf("A ra�z quadrada de %.1f �: %.2f",num,raiznum);
		} else {
			pownum = Math.pow(num, 2);
			System.out.printf("O n�mero %.1f elevado ao quadrado �: %.2f",num,pownum);
		}

	}

}

