programa
{
	/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
	 a média e o total de valores lidos. O programa deve fazer as leituras dos valores
	 enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer 
	 um valor negativo */
	
	
	
	funcao inicio()
	{
	  real num,acumulador=0
	  escreva("Entre com um número:\n")
       leia(num)
       acumulador = acumulador+num
       limpa()
		enquanto(num>0)
		{
	       escreva("Entre com um número:\n")
		  leia(num)
		  limpa()
		  acumulador = acumulador + num	
		}

	  escreva("O total do somatório é de: ",acumulador)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 669; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 12, 8, 3}-{acumulador, 12, 12, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */