package Exercicioslacorep;
import java.util.*;
public class exercicio2 {
	public static void main(String args[])
	{   
		Scanner ler = new Scanner(System.in);
		int num,x,par=0,impar=0;
		for(x=1;x<=10;x++)
		{
			System.out.println("Entre com um número: ");
			num = ler.nextInt();
			if(num%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.printf("O total de números pares foi: %d, e o total de números impáres foi: %d",par,impar);
	}

}
