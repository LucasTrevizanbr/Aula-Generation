programa
{
	/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
	 Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos)
	 deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates)
	 e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.
	 Caso contrário mostrar tais variáveis com o conteúdo ZERO.
	 */

	funcao inicio()
	{
		inteiro p,ee,m
		escreva("Salve João, quantos quilos de tomate você tem ai?\n")
		leia(p)
		se(p>50)
		{
	      ee=p-50
	      m = ee*4
	      escreva("Ola João, você passou :",ee," quilos do permitido e portanto pagara ",m," R$ de multa")
		}
		senao
		{    ee = 0
		     m = 0
			escreva("Ola João, você passou :",ee," quilos do permitido e portanto pagara ",m," R$ de multa")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 976; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */