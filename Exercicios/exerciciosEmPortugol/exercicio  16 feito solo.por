programa
{
	/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
	coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
     a) média do salário da população; 
     b) média do número de filhos; 
     c) maior salário; 
     d) percentual de pessoas com salário até R$100,00.  
     */

	
	funcao inicio()
	{
		real  salario,totalfilho=0,maiorsal=0,salcem=0,porcen=0,x,totalsalario=0
		inteiro filho
		
		para(x=1;x<=20;x++)
		{
	       escreva("Qual seu salário?\n")
		  leia(salario)
		  limpa()
		  totalsalario = totalsalario + salario
		  se(maiorsal<salario)
		  {
		  	maiorsal = salario
		  }
		  se(salario<=100)
		  {
		  	salcem = salcem + 1
		  	porcen = (salcem*100)/20
		  }
		}  
		para(x=1;x<=20;x++)
		{
		 escreva("Quantos filhos você tem??\n")
		 leia(filho)
		 limpa()
		 totalfilho = totalfilho +filho
		}
		
         
         escreva("Média dos  salarios é  de: ",totalsalario/20)
         escreva("\nO maior salario é de: ",maiorsal)
         escreva("\nA porcentagem de quem recebe  menos que 100R$ é  de: ",porcen,"%")
         escreva("\nA média de filhos é: ",totalfilho/20)
	}
         
}
		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {totalfilho, 14, 16, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */