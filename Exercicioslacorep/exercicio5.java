package Exercicioslacorep;
import java.util.*;
public class exercicio5 {
  public static void main(String asrgs[])
  {
	  Scanner ler = new Scanner(System.in);
	  int num,cont=0;
	      do
		  {
		    System.out.println("Entre com um número: ");
		    num= ler.nextInt();
		    cont= cont+num;
		  
		  }while(num>=1);
	     
	      System.out.println("A soma dos números digitados é: "+cont);
  }
}
