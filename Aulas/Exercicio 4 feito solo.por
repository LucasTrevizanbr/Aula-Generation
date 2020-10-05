programa
{
	/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
	 * calcule a seguinte expressão: D= R+S/2, R=(A+B)elevado ao quadrado e S=(B+C)elevado ao quadrado 
	 */
	 inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		inteiro a,b,c,d,r,s
		escreva("Vamos descobrir o valor de D!!")
		escreva("\nEntre com o valor de A:\n")
		leia(a)
		escreva("Entre com o valor de B:\n")
		leia(b)
		escreva("entre com o valor de C:\n")
		leia(c)

		r= mat.potencia(a+b, 2)
		s= mat.potencia(b+c, 2)
		d= r+s/2

		escreva("O valor de D é: ",d)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = 16, 18, 19, 20, 22, 9, 10, 11, 12, 13, 14, 15;
 * @SIMBOLOS-INSPECIONADOS = {a, 9, 10, 1}-{b, 9, 12, 1}-{c, 9, 14, 1}-{d, 9, 16, 1}-{r, 9, 18, 1}-{s, 9, 20, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */