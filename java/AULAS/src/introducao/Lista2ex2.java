package introducao;

import java.util.Scanner;

public class Lista2ex2 {

	
/*      inteiro n
		inteiro c
		inteiro E
		inteiro horaTrabalhada=10
		inteiro horaExcedente=20
		escreva("Qual seu codigo: ")
		leia(c)
		escreva("Quantas horas voc� trabalhou esse m�s: ")
		leia(n)
		E= n-50 
		se(n<50){
			escreva("Seu salario �:"+horaTrabalhada*n)
		}
		se (n>50){
			escreva("Seu salario �:"+horaTrabalhada*n)
			escreva("Seu salario excedente �: "+E*horaExcedente) 
		}
	}
}*/ 
	
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int n,c,e,horaTrabalhada=10,horaExcedente=20;
		int salarioTotal;
		
		
		System.out.println("Qual seu codigo");
		c=leia.nextInt();
		
		System.out.println("Quantas horas voc� trabalhou esse m�s: ");
		n=leia.nextInt();
		
		e=n-50;
		salarioTotal=(50*10)+horaExcedente;
		
		if (n<50) {
			System.out.println("Seu salario �: "+horaTrabalhada*n);
		}
		if (n>50) {
			System.out.println("Seu salario �: "+salarioTotal);
			System.out.println("Seu salario excedente �: "+e*horaExcedente);
		}
	}
}

