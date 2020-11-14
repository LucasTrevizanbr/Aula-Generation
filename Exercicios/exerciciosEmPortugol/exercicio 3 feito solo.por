programa
{
	//Faça um sistema que leia o tempo de duração de um evento em
	//uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	funcao inicio()
	{
		inteiro  totalsegundo,hora,minuto,segundo
		escreva("Quantos segundos durou o evento?\n")
		leia(totalsegundo)

	    hora = totalsegundo/3600
	    minuto =(totalsegundo%3600)/60//aqui nos pegamos o total de segundos, usamos a formula de calcular os segundos em horas
	  //porém com o sinal de % que pegou o que sobrou das horas em segundos e depois dividimos os segundos por 60 que é o total
	  // de segundos que um minuto tem
	    segundo=(totalsegundo%60)%60

	     escreva("O evento durou\n", hora, ":",minuto,":",segundo)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 610; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */