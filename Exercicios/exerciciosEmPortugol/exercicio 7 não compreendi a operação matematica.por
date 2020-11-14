programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		//Um sistema de equações lineares do tipo: ax+by= C ,dx+by= f, pode ser resolvido da seguinte forma
		//X= ce-bf/ae-bd Y= af-cd/ae-bd
		//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
		
		real x,y,a,b,c,d,ee,f; //declarei todas as variaveis necessarias para descobrir o valor de X e Y
		
		//o e isolado é um algoritmo reservado, por isso usar outra formaa de variavel
		escreva("Calculo grande ein, mas não se preocupe, o programa resolvera para você, apenas entre com os valores \n");
		escreva("entre com o valor de A: ");//pedi o valor de A
		leia(a);//atribui o valor digitado a variavel "a"
		escreva("entre com o valor de B: ");//pedi o valor de B
		leia(b);//atribui o valor digitado a variavel "b"
		escreva("entre com ovalor de  C: ");//pedi o valor de  C
		leia(c);//atribui o valor digitado a variavel "c"
		escreva("entre com o valor de D: ");//pedi o valor de D
		leia(d);//atribui o valor digitado a variavel "d"
		escreva("entre com o valor de E: ");//pedi o valor de E
		leia(ee);//atribui o valor digitado a variavel "ee"
		escreva("entre com o valor de F: ");//pedi o valor de F
		leia(f)//atribui o valor digitado a variavel "f"

		x=(c*ee - b*f)/(a*ee - b*d)//pq eu multipliquei o c pelo ee e o b pelo f?????
		y=(a*f - c*d)/(a*ee - b*d)
		//

	     escreva("O valor de x é: " ,mat.arredondar(x, 2))
	     escreva("\nO valor de Y é: ",mat.arredondar(y, 2))
		//a função de arredondar evita inumeras casas decimais de acordo com quantos numeros a gente quer exibir
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1350; 
 * @PONTOS-DE-PARADA = 32, 10, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 27, 28, 31;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */