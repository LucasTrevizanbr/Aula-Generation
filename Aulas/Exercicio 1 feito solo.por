programa
{
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
	funcao inicio()
	{
		inteiro ano,mes,dia,totaldia
		escreva("Vamos calcular quantos dias de vida você viveu até hoje")
		escreva("\nQuantos anos você tem?\n")
		leia(ano)
		escreva("\nQual o mes do seu aniversário?\n")
		leia(mes)
		escreva("\nQual o dia do seu aniversário??\n")
		leia(dia)

		totaldia = ano*365 + mes*30 + dia*12

		escreva("Você viveu até hoje: ",totaldia," dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {totaldia, 6, 22, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */