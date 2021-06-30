programa
{
	
	funcao inicio()
	{
		// Elabore um sistema que leia as variáveis C e N, respectivamente código
		//e número de horas trabalhadas de um operário. E calcule o salário 
		//sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder
		//a 50 calcule o excesso de pagamento armazenando-o na variável E,
		//caso contrário zerar tal variável. A hora excedente de trabalho 
		//vale R$ 20,00. No final do processamento imprimir o salário total e
		//o salário excedente./*


		inteiro n
		inteiro c
		inteiro E
		inteiro horaTrabalhada=10
		inteiro horaExcedente=20

		
		

		escreva("Qual seu codigo: ")
		leia(c)
		escreva("Quantas horas você trabalhou esse mês: ")
		leia(n)

		E= n-50 
		se(n<50){
			escreva("Seu salario é:"+horaTrabalhada*n)
			
		}
		
		se (n>50){

			escreva("Seu salario é:"+horaTrabalhada*n)
			escreva("Seu salario excedente é: "+E*horaExcedente) 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 847; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */