package ExerciciosCondicional;
import java.util.*;
public class Exercicio1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3;
		System.out.printf("Entre com o primeiro n�mero: ");
		n1= ler.nextInt();
		System.out.printf("Entre com o segundo n�mero: ");
		n2= ler.nextInt();
		System.out.printf("Entre com o terceiro n�mero: ");
		n3= ler.nextInt();
		
		if(n1>0 && n1>n2 && n1>n3)
		{
			System.out.printf("O maior valor �:"+n1);
		}
          else if(n2>n1 && n2>n3)
          {
        	  System.out.printf("O  maior valor � :"+n2); 
          }
          else {
        	  System.out.printf("O maior valor � :"+n3);
          }
		
		  
	}
	

}
