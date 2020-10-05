programa
{
	//Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram
	//no conjunto dos números de 1 até 500.

	funcao inicio()
	{
		inteiro impar=0,x
          
          escreva("Vamos efetuar a soma de todos os números  impáres e múltiplos de 3 em  um intervalo de 1 a 500")
      
		para(x=1;x<=500;x++)
		{
		  se(x%2!=0 e x%3==0)
		  {
				impar= impar + x
		  }
		 
		}
	
	     escreva("\nA  soma dos números impares que são multiplos de 3 é :",impar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {impar, 8, 10, 5}-{x, 8, 18, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */