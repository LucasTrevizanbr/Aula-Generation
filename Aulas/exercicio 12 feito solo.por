programa
{
	/*Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar,
	e se é positivo ou negativo.*/

	funcao inicio()
	{
	   inteiro,n
        escreva("Entre com um numero:\n")
        leia(n)
        se(n>0 e n%2==0)
        {
        	escreva("Este número é positivo e par")
        }
        senao se(n<0 e n%2==0)
        {
        	escreva("Este número é negativo e par")
        }
        senao se(n>0 e n%2!=0)
        {
        	escreva("Este número é positivo e ímpar")
        }
        senao
        {
        	escreva("este número é negativo e ímpar")
        }
        
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 469; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n, 8, 12, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */