package exercicios;

import java.util.Scanner;

public class ClasseExercicio1 {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int ano,mes,dia;
		System.out.println("Quantos anos voc� tem?");
		ano = ler.nextInt();
		System.out.println("Que mes voc� faz anivers�rio?");
		mes = ler.nextInt();
		System.out.println("Qual o dia do seu anivers�rio?");
		dia = ler.nextInt();
		
		ano= ano*365;
		mes= mes*30;
		
		System.out.println("Voce viveu at� hoje:");
		System.out.println(ano+mes+dia);
		
		
		
	}

}
