programa
{
	/*Faça um programa que mostre uma contagem na tela de 233 a 456, só que 
	 contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/
	funcao inicio()
	{
		real num=233
          escreva(num)
		faca
		{  	
           se(num>=300 e  num<=400)
           {
             num = num+3
             escreva("\n",num)
           }
           senao
           {
           	num= num+5
           }
           escreva("\n",num)
           	
		}enquanto(num<=456)
	   
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */