package PacoteJava;
import java.util.*;
public class exercicioExtraLacoCondicional4 {
	public static void main(String args[])
	{
		//LER UM NUMERO E DIZER SE ELE É PAR OU IMPAR, POSITIVO OU NEGATIVO
		
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Entre com um número: ");
		num= ler.nextInt();
		
		if(num%2==0 && num>0)
		{
			System.out.println("Este número é positivo e pár");
		}
		else if(num%2==0 && num<0)
		{
			System.out.println("Este número é negativo e pár");
		}
		else if(num!=0 && num>0)
		{
			System.out.println("Este número é positivo e ímpar");
		}
		else if(num!=0 && num<0)
		{
			System.out.println("Este número é negativo e ímpar");
		}
		else
		{
			System.out.println("Este número é inválido");
		}
	}

}
