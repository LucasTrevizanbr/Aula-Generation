programa
{ //Receber valores de base e altura de um triângulo e verificar se são valores válidos 
 //(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	
	
	funcao inicio()
	{
		inteiro base,altura,area
		escreva("Entre com o valor de base do triangulo\n")
		leia(base)
		escreva("Entre com o valor de altura do triangulo\n")
		leia(altura)

		se(altura>0 e base>0)
		{
			area= base*altura/2
			escreva("A  área do triangulo é: ",area)
		}
		senao
		{
			escreva("Dados invalidos")
		}
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */