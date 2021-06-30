programa
{
	
	funcao inicio()
	{
		cadeia nome
		real celsius
		real fahrenheit
		
		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Informe a temperatura, em Fahrenheit, do seu local: ")
		leia(fahrenheit)
		celsius = (fahrenheit - 32) * 1/8
		
		escreva("A temperatura em Celsius é : " + celsius + "ºC")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 82; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */