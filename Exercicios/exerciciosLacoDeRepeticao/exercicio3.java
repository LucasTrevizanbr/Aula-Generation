package Exercicioslacorep;
import java.util.*;
public class exercicio3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade,menos=0,mais=0;
		System.out.println("Entre com sua idade: ");
		idade = ler.nextInt();
		while(idade<=99)
		{   
		
			if(idade<=21)
			{
				menos++;
			}
			else if(idade>=50)
			{
				mais++;
			}
			System.out.println("Entre com sua idade: ");
			idade = ler.nextInt();
		}
		System.out.printf("O total de pessoas com menos de 21 anos é:%d, e com  mais de 50 é:%d.",menos,mais);
	}

}
