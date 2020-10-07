package ExerciciosCondicional;
import java.util.*;
public class Exercicio1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3,maiorn=0;
		System.out.printf("Entre com o primeiro número: ");
		n1= ler.nextInt();
		System.out.printf("Entre com o segundo número: ");
		n2= ler.nextInt();
		System.out.printf("Entre com o terceiro número: ");
		n3= ler.nextInt();
		
		if(n1>maiorn)
		{
		  maiorn= maiorn+n1;
          if(n2>maiorn)
          {
        	  maiorn=maiorn-n1+n2;
          }
		  if(n3>maiorn)
		  {
			  maiorn=maiorn-n2+n3;
		  }
		}
		System.out.println("O maior número digitado é: "+maiorn);
		
	}
	

}
