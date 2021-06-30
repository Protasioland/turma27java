programa
{
	
	funcao inicio()
	{
		/*Desenvolver um sistema que efetue a soma de todos os números 
		 * 
		 ímpares que são  múltiplos de três e que se encontram no 
		 conjunto dos números de 1 até 500.
	*/

	      // numeroImpar todo numero que dividindo por dois e tendo sobra 

	     // numeroImpar%2!=0

	    //  numeroDivisivel%3==0

	    real soma=0.0
	    

	    para(inteiro i=1; i<=500; i++){
	    		se(i%2!=0 e i%3==0 ){

	    			soma+=i
	    			
	    		}
	    }
	    escreva("A soma total é: ",soma)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */