package PacoteJava;
import java.util.*;
public class exercicioExtraLacoCondicional3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num1,num2,num3,num4;
		double q1,q2,q3,q4;
		
		System.out.println("Entre com o primeiro número: ");
	    num1= ler.nextInt();
	    System.out.println("Entre com o segundo número: ");
	    num2= ler.nextInt();
	    System.out.println("Entre com o terceiro número: ");
	    num3= ler.nextInt();
	    System.out.println("Entre com o quarto número: ");
	    num4= ler.nextInt();
	    
	    q1=Math.pow(num1, 2);
	    q2=Math.pow(num2, 2);
	    q3=Math.pow(num3, 2);
	    q4=Math.pow(num4, 2);
	    
	    if(q3>=1000)
	    {
	       System.out.println("O quadrado do terceiro número é: "+q3+"\nFim.");	
	    }
	    else
	    {
	    	System.out.println("O primeiro número foi"+num1+" e seu quadrado é: "+q1);
	    	System.out.println("O segundo número foi"+num2+" e seu quadrado é: "+q2);
	    	System.out.println("O terceiro número foi"+num3+" e seu quadrado é: "+q3);
	    	System.out.println("O quarto número foi"+num4+" e seu quadrado é: "+q4);
	    }
		
	}

}
