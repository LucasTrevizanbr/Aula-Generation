package ExerciciosCondicional;
import java.util.*;
public class Exercicio1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3,maiorn=0;
		System.out.printf("Entre com o primeiro n�mero: ");
		n1= ler.nextInt();
		System.out.printf("Entre com o segundo n�mero: ");
		n2= ler.nextInt();
		System.out.printf("Entre com o terceiro n�mero: ");
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
		System.out.println("O maior n�mero digitado �: "+maiorn);
		
	}
	

}
