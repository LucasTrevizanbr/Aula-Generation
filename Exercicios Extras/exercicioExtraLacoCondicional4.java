package PacoteJava;
import java.util.*;
public class exercicioExtraLacoCondicional4 {
	public static void main(String args[])
	{
		//LER UM NUMERO E DIZER SE ELE � PAR OU IMPAR, POSITIVO OU NEGATIVO
		
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Entre com um n�mero: ");
		num= ler.nextInt();
		
		if(num%2==0 && num>0)
		{
			System.out.println("Este n�mero � positivo e p�r");
		}
		else if(num%2==0 && num<0)
		{
			System.out.println("Este n�mero � negativo e p�r");
		}
		else if(num!=0 && num>0)
		{
			System.out.println("Este n�mero � positivo e �mpar");
		}
		else if(num!=0 && num<0)
		{
			System.out.println("Este n�mero � negativo e �mpar");
		}
		else
		{
			System.out.println("Este n�mero � inv�lido");
		}
	}

}
