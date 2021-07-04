package introducao;

import java.util.Scanner;

public class ImparPar {
	
	/*programa
	{
		funcao inicio()
		{
			inteiro num
			escreva("qual numero voce deseja?")
			leia (num)
			se(num %2==0){
				escreva(num + " É PAR" )
						}
						senao {
							escreva(num + "É IMPAR")
						}
		}
	}*/     
	
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num=leia.nextInt();
		
		if (num == 0) {
			System.out.println("Esse numero é NEUTRO ");
		}else if (num % 2 == 0) {
			System.out.println("Esse numero é PAR ");
		}else {
			System.out.println("Esse numero é IMPAR ");
		}
		
		
			
	}
}
		


