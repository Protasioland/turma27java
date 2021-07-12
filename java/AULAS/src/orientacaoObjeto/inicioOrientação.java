package orientacaoObjeto;

import java.util.Scanner;

public class inicioOrientação {
	
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		String nome;
		int ano, idade;
		char genero;
		
		System.out.println("Informe seu nome: ");
		nome = leia.next();
		System.out.println("Informe sua idade: ");
		ano = leia.nextInt();
		System.out.println("Informe genero: ");
		genero = leia.next().charAt(0);
		idade=2021-ano;
		
		System.out.printf("Bom dia senhore!! Seu nome é %s, sua idade é %d e seu gênero é %s",nome,idade,genero);

		
	}

}
