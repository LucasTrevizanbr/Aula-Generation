programa
{

	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real x1,x2,y1,y2,d
		escreva("Entre com o valor de x1:\n")
		leia(x1)
		escreva("Entre com o valor de x2:\n")
		leia(x2)
		escreva("Entre com o valor de y1:\n")
		leia(y1)
		escreva("Entre com o valor de y2:\n")
		leia (y2)
		
         d= mat.raiz(mat.potencia(x2-x1,2)+ mat.potencia(y2-y1, 2),2)

         escreva("O valor de D é: ",mat.arredondar(d, 2))
      
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {x1, 7, 7, 2}-{x2, 7, 10, 2}-{y1, 7, 13, 2}-{y2, 7, 16, 2}-{d, 7, 19, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */