package PacoteJava;
import java.util.*;
public class exercicioExtraVetorMatriz1 {
	public static void main(String args[])
	//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade
	//e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 

	{
		Scanner ler = new Scanner(System.in);
		float notas[] = new float[5];
		float maiorn=0;
		for(int x=0;x<5;x++)
		{
			System.out.println("Entre com as notas: ");
			notas[x]=ler.nextFloat();
			if(notas[x]>maiorn)
			{
				maiorn=notas[x];
			}
		}
		for(int x=0;x<5;x++)
		{
		System.out.println("As notas foram:"+notas[x]);
		}
		System.out.println("A maior nota foi :"+maiorn);
	}

}
