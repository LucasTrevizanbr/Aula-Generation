package PacoteJava;
import java.util.*;
public class exercicioExtraVetorMatriz2 {
	public static void main(String args[])
	{
//Um dado é lançado 10 vezes e o valor correspondente é anotado Faça um programa que gere um vetor com 
//os lançamentos, escreva esse vetor,A seguir determine e imprima a média aritmética dos lançamentos, 
//contabilize e apresente também quantas foram as ocorrências da maior pontuação.

		
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
		
		System.out.print("valor dos 10 lançamentos: ");
		for(int x=0; x<10; x++)
		{
		System.out.printf("%d, ",lancamentos[x]);
		}
		System.out.println("\nA maior pontuação se repetiu "+contador+" vezes");
		System.out.printf("\nA média aritmética dos lançamentos foi: %.2f" ,media);
	}
}
