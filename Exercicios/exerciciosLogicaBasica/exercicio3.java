package exercicios;

import java.util.Scanner;

public class exercicio3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int minuto,hora,segundo,segs;
		System.out.println("Quantos segundos durou o evento?");
		segundo= ler.nextInt();
		
		hora= segundo/3600;
		minuto= (segundo%3600)/60;
		segs=(segundo%3600)%3600;
		
		System.out.println("O evento durou horas:");
		System.out.println(hora);
		System.out.println("Minutos: ");
		System.out.println(minuto);
		System.out.println("Segundos: ");
		System.out.println(segs);
		
		
	}
}
