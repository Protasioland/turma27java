programa
{
	
	funcao inicio()
	{
		//*Faça um sistema que leia a idade de uma pessoa expressa em anos, 
		//meses e dias e mostre-a expressa apenas em dias.*

		//inicio variaveis 

		inteiro ano, meses, dias
		inteiro respostaDias

		escreva("	digite aqui quantos anos voce tem em anos: ")
		leia(ano)
		escreva(" digite aqui quantos meses voce tem: ")
		leia(meses)
		escreva(" digite aqui quantos dias voce tem: ")
		leia(dias)

		respostaDias= ano*365+ meses*30+dias*1

		escreva(" sua idade em dias é: "+ respostaDias)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */