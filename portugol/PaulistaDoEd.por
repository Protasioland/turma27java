programa
{
	
	funcao inicio()
	{
		//* Desafio: Paulistinha do ED     //PAULISTINHA DO ED   
		//*4 VARIAVEIS NOME DE UM TIME DE SÃO PAULO TIME1 = "CORINTHIANS" TIME2="PALMEIRAS" TIME3 = "SAO PAULO"     
		//TIME4="SANTOS" (CADEIA)     
		//PONTOS1, PONTOS2, PONTOS3, PONTOS4 (INTEIRO)     
		// USUARIO SÓ PODE RESPONDER G PARA GANHOU | P PARA PERDER | E PARA EMPATE ( CARACTER)     
		// SERÃO 4 RODADAS     
		// APRESENTAR UM RESULTADO FINAL, DECLARAR QUANTOS PONTOS CADA TIME TEM.     
		// G = 3 | E = 1 | P = 0

		//inicio variaveis

		cadeia CORINTHIANS, PALMEIRAS,SAOPAULO,SANTOS
		cadeia respostaCorinthians, respostaPalmeiras, respostaSaoPaulo, respostaSantos
		inteiro pontosCorinthians=0, pontosPalmeiras=0, pontosSaoPaulo=0, pontosSantos=0
		inteiro rodada=0

		escreva("ROOM 5\n")

		para(rodada=1;rodada<=4;rodada++){
			escreva("\nRodada: ",rodada)
			escreva("\nCorinthians: ")
			leia(respostaCorinthians)
			se (respostaCorinthians=="G" ou respostaCorinthians== "g" ){
			pontosCorinthians+= 3
			}
			senao se (respostaCorinthians=="E" ou respostaCorinthians== "e" ){
			pontosCorinthians+= 1
			}
			escreva("PALMEIRAS: ")
			leia(respostaPalmeiras)
			se (respostaPalmeiras=="G" ou respostaPalmeiras== "g" ){
			pontosPalmeiras+= 3
			}
			senao se (respostaPalmeiras=="E" ou respostaPalmeiras== "e" ){
			pontosPalmeiras+= 1	
			}
			escreva("SAOPAULO: ")
			leia(respostaSaoPaulo)
			se (respostaSaoPaulo=="G" ou respostaSaoPaulo== "g" ){
			pontosSaoPaulo+= 3
			}
			senao se (respostaSaoPaulo=="E" ou respostaSaoPaulo== "e" ){
			pontosSaoPaulo+= 1	
			}
			escreva("SANTOS: ")
			leia(respostaSantos)
			se (respostaSantos=="G" ou respostaSantos== "g" ){
			pontosSantos+= 3
			}
			senao se (respostaSantos=="E" ou respostaSantos== "e" ){
			pontosSantos+= 1	
			}
		}
		escreva("\n Corinthians\n")
		escreva(pontosCorinthians)
		escreva("\n Palmeiras\n")
		escreva(pontosPalmeiras)
		escreva("\n Sao Paulo\n")
		escreva(pontosSaoPaulo)
		escreva("\n Santos\n")
		escreva(pontosSantos)

	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1944; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */