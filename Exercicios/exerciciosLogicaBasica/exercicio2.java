package exercicios;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int ano,mes,dia,diaS;
		System.out.println("Entre com a quantidade de dias que voce viveu até hoje");
		dia = ler.nextInt();
		
		ano= dia/365;
		mes= dia/30;
		diaS= dia%364;
		
		System.out.println("Seus dias vividos equivalem em anos:");
		System.out.println(ano);
		System.out.println("meses:");
		System.out.println(mes);
		System.out.println("e dias:");
		System.out.println(diaS);
		
	}

}
