programa
{
	
	funcao inicio()
	{
		//Faça um sistema que leia a idade de uma pessoa expressa em dias 
		//e mostre-a expressa em anos, meses e dias. 

		inteiro ano, mes, dias
		inteiro respostaEmDias

		escreva("Qual sua idade em dias: ")
		leia(dias)	
		
		ano=dias/365

		escreva("\nsua idade em anos é: ", ano)
		
		mes=dias/30

		escreva("\nsua idade em meses é: ", mes)

		escreva("\nsua idade em dias é: ", dias)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */