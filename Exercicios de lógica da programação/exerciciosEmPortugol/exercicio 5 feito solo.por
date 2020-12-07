programa
{
	/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média 
	 é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
	*/ 
	funcao inicio()
	{
		real  n1,n2,n3,peso,mediap,notas
		escreva("Entre com a primeira nota:\n")
		leia(n1)
		escreva("Entre com a segunda nota:\n")
		leia(n2)
		escreva("entre com a terceira nota:\n")
		leia(n3)

         peso=2+3+5
         notas= (n1*2) + (n2*3) + (n3*5)
         mediap= notas/peso

         escreva("Sua média ponderada é: ",mediap)
         
         
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 8, 8, 2}-{n2, 8, 11, 2}-{n3, 8, 14, 2}-{peso, 8, 17, 4}-{mediap, 8, 22, 6}-{notas, 8, 29, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */