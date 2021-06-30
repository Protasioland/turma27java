programa
{
	
	funcao inicio()
	{

		cadeia nomeAlunos[4]
		inteiro nota[4]
		inteiro i

          para( i=0;i <=3; i++)
          {
      	
            escreva("Nome do aluno  : ")
		  leia(nomeAlunos[i])
            escreva("sua nota : ")
            leia(nota[i])
	
      	
      	 }

      	para( i =0;i <=3; i++){


          se(i<5){

         escreva("Ainda não, estude mais ")

        
             }

            senao escreva("Parabens! Continue assim")
          }
          escreva("O aluno ",nomeAlunos[i],"e sua nota é:",nota[i],"\n")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 139; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nota, 8, 10, 4}-{nomeAlunos, 7, 9, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */