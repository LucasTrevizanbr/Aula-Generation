package PacoteJava;
import java.util.*;
public class exercicioExtraVetorMatriz2 {
	public static void main(String args[])
	{
//Um dado � lan�ado 10 vezes e o valor correspondente � anotado Fa�a um programa que gere um vetor com 
//os lan�amentos, escreva esse vetor,A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
//contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.

		
		Scanner ler = new Scanner(System.in);
		int lancamentos[]= new int[10];
		int maiorp=0,contador=0,total=0;
		float media;
		for(int x=0; x<10;x++)
		{
			System.out.println("Escreva o valor em que caiu o dado: ");
			lancamentos[x]=ler.nextInt();
			total= total+lancamentos[x];
			
			if(lancamentos[x]>maiorp)
			{
				maiorp = lancamentos[x];
				contador =1;
			}
			else if(maiorp==lancamentos[x])
			{
				 contador++;		
			}
			
		}
		media = total/10;
		
		System.out.print("valor dos 10 lan�amentos: ");
		for(int x=0; x<10; x++)
		{
		System.out.printf("%d, ",lancamentos[x]);
		}
		System.out.println("\nA maior pontua��o se repetiu "+contador+" vezes");
		System.out.printf("\nA m�dia aritm�tica dos lan�amentos foi: %.2f" ,media);
	}
}
