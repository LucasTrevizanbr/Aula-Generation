package ExerciciosCondicional;
import java.util.*;
public class Exercicio3 {
	public static void main(String args[]) 
	{
	  Scanner ler = new Scanner(System.in);
	  int idade;
	  String nome;
	  System.out.printf("Qual seu nome?");
	  nome = ler.nextLine();
	  System.out.printf("Qual sua idade");
	  idade = ler.nextInt();
	  
	  if(idade>=10 && idade<=14)
	  {
		  System.out.println(nome+"\nVocê esta na  categoria: Infantil");
	  }
	  else if(idade>=15 && idade<=17)
	  {
		  System.out.println(nome+"\nVocê esta na  categoria: Juvenil"); 
	  }
	  else if(idade>=18 && idade<=25)
	  {
	      System.out.println(nome+"\nVocê esta na  categoria: Adulto");  
	  }
	  else
	  {
		  System.out.println("Idade invalida");
	  }
	  
	
	}

}
