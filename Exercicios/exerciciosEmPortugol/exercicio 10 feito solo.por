programa
{
	/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário
	E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
	Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E,
	caso contrário zerar tal variável.A hora excedente de trabalho vale R$ 20,00.
	No final do processamento imprimir o salário total e o salário excedente.
    */ 
	
	funcao inicio()
	{
		inteiro salario,hora,ee,extra
		escreva("Entre com a quantidade de horas trabalhadas: \n")
		leia(hora)
		salario = hora*10

		se(hora>50)
		{
	         ee = hora-50
	         extra  = ee*20
	         escreva("Seu salario total foi de: ",salario,"\no total das horas extras foram : ",extra,"\nAo todo: ",salario+extra)   		
		}
		senao
		{
			extra = 0
			escreva("Seu salario total foi de: ",salario,"\no total das horas extras foram : ",extra,"\nAo todo: ",salario) 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 946; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */