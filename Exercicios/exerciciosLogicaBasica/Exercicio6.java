package exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		double peso,n1,n2,n3,media,total;
		System.out.println("Entre com a primeira nota");
		n1= ler.nextDouble();
		System.out.println("Entre com a segunda nota");
		n2= ler.nextDouble();
		System.out.println("Entre com a terceira nota");
		n3= ler.nextDouble();
		peso= 2+3+5;
		total= (n1*2)+(n2*3)+(n3*5);
		media= total/peso;
		System.out.println("A média ponderada é: "+ media);
	
		
		
		
					
	}

}
