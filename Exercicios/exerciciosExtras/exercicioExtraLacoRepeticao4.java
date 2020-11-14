package PacoteJava;
import java.util.*;
public class exercicioExtraLacoRepeticao4 {
	public static void main(String args[])
	//Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
	//(imprimindo o novo valor) até que ele seja maior do que 100
	//Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.

	{
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Entre com um número: ");
		num = ler.nextInt();
		System.out.println("\n"+num);
		while(num<100)
		{
			num = num*3;
			System.out.println("\n"+num);
		}
	}

}
