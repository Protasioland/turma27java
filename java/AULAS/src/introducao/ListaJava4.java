package introducao;

import java.util.Scanner;

public class ListaJava4{
	
	/*programa
	{
		funcao inicio()
		{
			inteiro num
			escreva("qual numero voce deseja?")
			leia (num)
			se(num %2==0){
				escreva(num + " � PAR" )
						}
						senao {
							escreva(num + "� IMPAR")
						}
		}
	}*/     
	
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num=leia.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Esse numero � PAR e sua raiz quadrada �: "+Math.sqrt(num));
		
		}else {
			System.out.println("Esse numero � IMPAR e seu quadrado �: "+ Math.pow(num, 2));
		}
		
		 
			
	}
}