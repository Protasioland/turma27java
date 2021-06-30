programa
{
	
	funcao inicio() 
	{
		/* A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  
*/

		// limite 20 hab.
		//media = 20
		//>salario
		//% recebe até 100 conto

		real salario=0, filho=0
		real media=0
		inteiro hab=3
		real salarioTotal=0
		real mediaFilho=0
		real maiorSalario=0
		real rendaBaixa=0
		real porcentagem=0

		para(inteiro i=1; i <= hab; i++){
			escreva("Qual seu salario: ")
			leia(salario)
			escreva("Quantos filhos: ")
			leia(filho)
			salarioTotal+=salario
			media=(salarioTotal/hab) //ITEM A
			mediaFilho+=filho        //ITEM B

				se(salario>maiorSalario){
				maiorSalario=salario //IRWM C
				}

				se(salario<100){
					rendaBaixa+=1
				porcentagem=((rendaBaixa*100)/hab)  //item d
					
				}
		}
          escreva("\nMedia salarial: ",media)
          escreva("\n Media do numero de filhos: ",mediaFilho )
          escreva("\nMaior salario: ",maiorSalario)
          escreva("\nPorcentagem dos baixa renda: ",porcentagem)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1214; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */