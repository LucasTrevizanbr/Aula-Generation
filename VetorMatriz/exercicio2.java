package VetorMatriz;
import java.util.*;
public class exercicio2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int[] num= new int[6];
		int somapar=0,cont=0;
		for(int i=0;i<6;i++)
		{
			System.out.println("Entre com um n�mero inteiro");
			num[i]=ler.nextInt();
		
			if(num[i]%2==0)
			{
				somapar=somapar+num[i];
			}
			else
			{
			  cont++;	
			}
		}
		for(int i=0;i<6;i++)
		{   
			if(num[i]%2==0)
			System.out.println("O n�mero par digitado �: "+num[i]);
			else {
				System.out.println("O n�mero �mpar  digitado �: "+num[i]);	
			}
		}
		System.out.println("\nA soma dos n�meros pares digitados �: "+somapar);
		System.out.println("A quantidade de n�meros �mpares digitados �: "+cont);
	    
	}
}
