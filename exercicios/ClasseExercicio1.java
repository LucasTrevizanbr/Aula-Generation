package exercicios;

import java.util.Scanner;

public class ClasseExercicio1 {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int ano,mes,dia;
		System.out.println("Quantos anos você tem?");
		ano = ler.nextInt();
		System.out.println("Que mes você faz aniversário?");
		mes = ler.nextInt();
		System.out.println("Qual o dia do seu aniversário?");
		dia = ler.nextInt();
		
		ano= ano*365;
		mes= mes*30;
		
		System.out.println("Voce viveu até hoje:");
		System.out.println(ano+mes+dia);
		
		
		
	}

}
