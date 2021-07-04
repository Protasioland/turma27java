programa
{
	
		funcao inicio ()
	{
		inteiro valorDado [10], maiorValor = 0, quantidadeMaior = 0, mediaValor = 0, somaValores = 0

		para (inteiro i = 0; i <10; i ++)
		{
			escreva ("\ nDigite aqui o valor:")
			leia (valorDado [i])
			somaValores + = valorDado [i]
			mediaValor = somaValores / 10
	
			se (valorDado [i]> maiorValor) {
				maiorValor = valorDado [i]
			} 
		}
		para (inteiro i = 0; i <10; i ++)
		{
			se (maiorValor == valorDado [i]) {
				quantidadeMaior ++
			}
		}
		
		()
		escreva ("\ nO valor média  é:", mediaValor)
		escreva ("\ nO maior valor foi:", maiorValor, "e foi construída:", (quantidadeMaior), "vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */