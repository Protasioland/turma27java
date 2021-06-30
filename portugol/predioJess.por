programa
{

    funcao inicio()
    {
        cadeia predioJess[3][3] //linhas/colunas
        inteiro linha, coluna

        predioJess[0][0]= "Caio Lima"
        predioJess[0][1]= "Vic"
        predioJess[0][2]= "Augusto"
        predioJess[1][0]= "tai"
        predioJess[1][1]= "Valmir"
        predioJess[1][2]= "Nathalia"
        predioJess[2][0]= "Joao"
        predioJess[2][1]= "Fabio"
        predioJess[2][2]= "Janaina"

        para(inteiro x=0;x<3;x++){
            para(inteiro y=0;y<3;y++){
                escreva(predioJess[x][y], "\n")
            }
        }


        escreva("digite a linha: ")
        leia(linha)
        escreva("digite a coluna: ")
        leia(coluna)
        escreva("O morador do apto é: ", linha, " - " ,coluna, " é " ,predioJess[linha][coluna]) 

    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 801; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */