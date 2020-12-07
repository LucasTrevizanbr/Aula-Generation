programa
{ /*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias
    Infantil A = 5 a 7 anos
    Infantil B = 8 a 11 anos
    Juvenil A = 12 a 13 anos
    Juvenil B = 14 a 17 anos
    Adultos = Maiores de 18 anos
  */
    
	funcao inicio()
	{
	   cadeia nome
	   inteiro idade,condicao
	   escreva("Entre com seu nome:\n")
	   leia(nome)
	   escreva("Se sua idade for de 5 a 7 anos digite 1\n")
	   escreva("Se sua idade for de 8 a 11 anos digite 2\n")
	   escreva("Se sua idade for de 12 a 13 anos digite 3\n")
	   escreva("Se sua idade for de 14 a 17 anos digite 4\n")
	   escreva("Se sua idade for maior que 18 anos digite 5\n")
	   leia(condicao)
	   limpa()
	   
	   escolha(condicao)
	   {
	   	caso 1:
	   	escreva(nome," ,sua categoria é infantil A")
	   	pare
	   	caso 2:
	   	escreva(nome," ,sua categoria é infantil B")
	   	pare
	   	caso 3:
	   	escreva(nome," ,sua categoria é juvenil A")
	   	pare
	   	caso 4:
	   	escreva(nome," ,sua categoria é juvenil B")
	   	pare
	   	caso 5:
	   	escreva(nome," ,sua categoria é Adultos")
	   	pare
	   }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 775; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */