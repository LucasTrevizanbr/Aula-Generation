package PacoteJava;
import java.util.*;
public class exercicioExtraLacoCondicional6 {
	
	//Receber a idade de um nadador e checar em qual categoria ele se encaixa
	public static void main(String args [])
	{
		Scanner ler = new Scanner(System.in);
		int cond;
		String nome;
		
		System.out.println("Entre com seu nome: ");
		nome = ler.next();
		System.out.print("Vamos ver sua categoria");
		System.out.print("\nSe você tiver entre 5 a 7 anos aperte 1");
		System.out.print("\nSe você tiver entre 8 a 11 anos aperte 2");
		System.out.print("\nSe você tiver entre 12 a 13 anos aperte 3");
		System.out.print("\nSe você tiver entre 14 a 17 anos aperte 4");
		System.out.print("\nSe você for maior de 18 aperte 5\n");
		cond= ler.nextInt();
		
		switch(cond)
		{
		  case 1:
		  {
			  System.out.print(nome+ ", sua categoria é infantil A");
		  }
		  break;
		  case 2:
		  {
			  System.out.print(nome +", sua categoria é infantil B");
		  }
		  break;
		  case 3:
		  {
			  System.out.print(nome+", sua categoria é juvenil A");
		  }
		  break;
		  case 4:
		  {
			  System.out.print(nome+", sua categoria é juvenil B");
		  }
		  break;
		  case 5:
		  {
			  System.out.print(nome+", sua categoria é adulto");
		  }
		  break;  
		}
	}

}
