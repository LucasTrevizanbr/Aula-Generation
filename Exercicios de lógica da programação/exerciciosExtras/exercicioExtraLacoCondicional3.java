package PacoteJava;
import java.util.*;
public class exercicioExtraLacoCondicional3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num1,num2,num3,num4;
		double q1,q2,q3,q4;
		
		System.out.println("Entre com o primeiro n�mero: ");
	    num1= ler.nextInt();
	    System.out.println("Entre com o segundo n�mero: ");
	    num2= ler.nextInt();
	    System.out.println("Entre com o terceiro n�mero: ");
	    num3= ler.nextInt();
	    System.out.println("Entre com o quarto n�mero: ");
	    num4= ler.nextInt();
	    
	    q1=Math.pow(num1, 2);
	    q2=Math.pow(num2, 2);
	    q3=Math.pow(num3, 2);
	    q4=Math.pow(num4, 2);
	    
	    if(q3>=1000)
	    {
	       System.out.println("O quadrado do terceiro n�mero �: "+q3+"\nFim.");	
	    }
	    else
	    {
	    	System.out.println("O primeiro n�mero foi"+num1+" e seu quadrado �: "+q1);
	    	System.out.println("O segundo n�mero foi"+num2+" e seu quadrado �: "+q2);
	    	System.out.println("O terceiro n�mero foi"+num3+" e seu quadrado �: "+q3);
	    	System.out.println("O quarto n�mero foi"+num4+" e seu quadrado �: "+q4);
	    }
		
	}

}
