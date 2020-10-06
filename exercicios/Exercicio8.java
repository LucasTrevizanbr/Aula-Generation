package exercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int custo,distribuidor,imposto,fabrica;
		System.out.println("Quanto custa esse carro?");
		custo= ler.nextInt();
		
		distribuidor = custo*28/100;
		imposto= custo*45/100;
        fabrica= custo - distribuidor - imposto;
        System.out.println("O custo de fabrica do veiculo é :" + fabrica);
        
		
	}

}
