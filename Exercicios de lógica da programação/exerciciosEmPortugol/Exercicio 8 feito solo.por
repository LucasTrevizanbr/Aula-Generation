programa
{
	/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos 
	 * (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
	 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
	 */
	funcao inicio()
	{
	   real valorcarro,distribuidor,imposto,custofabrica
	   escreva("Entre com o valor do  carro: ")
	   leia(valorcarro)

	  distribuidor= valorcarro*28/100
	  imposto= valorcarro*45/100
	  custofabrica = valorcarro - distribuidor - imposto

	  escreva("O custo de fábrica  do veiculo  é: ",custofabrica)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 489; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {distribuidor, 9, 20, 12}-{imposto, 9, 33, 7}-{custofabrica, 9, 41, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */