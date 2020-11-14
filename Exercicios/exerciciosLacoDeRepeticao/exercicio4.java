package Exercicioslacorep;
import java.util.*;
public class exercicio4 {
	public static void main(String  args[])
	{
		Scanner ler = new Scanner(System.in);
	    int idade,sexo,ep,pc=0,oc=0,mc=0,mn=0,qn=0,ha=0,pessoas=1;
	    
	    while(pessoas<=6)
	    {
	    	System.out.println("Entre com sua idade: ");
		    idade = ler.nextInt();
		    System.out.println("Se seu sexo for feminino digite 1, se for masculino  digite 2 e 3 para outros:");
		    sexo= ler.nextInt();
		    System.out.println("Se  você for calmo digite 1, se for nervosa digite 2 e se for agressiva digite 3");
		    ep = ler.nextInt();
	    	if(ep==1)
	    	{
	    		pc++;
	    	}
	    	if(ep==1 && sexo ==3)
	    	{
	            oc++;	
	    	}
	    	if(idade<18 && ep==1)
	    	{
	    	    mc++;
	    	}
	    	if(sexo==1 && ep==2)
	    	{
	    		mn++;
	    	}
	    	if(idade>40 && ep==2)
	    	{
	    	   qn++;
	    	}
	    			
	    	if(sexo==2 && ep==3)
	    	{
	    		ha++;
	    	}
	    	pessoas ++;
	    }
	    System.out.printf("O numero de pessoas calmas  é de: %d, o número de pessos do sexo(outros) calmos é de: %d, o numero de pessoas com menos de 18 anos e calmas é de:%d",pc,oc,mc);
	    System.out.printf("\n O número de mulheres nervosas é  de: %d, o número de pessoas com mais de 40 anos nervosas é de: %d",mn,qn);
	    System.out.printf("\n O número de homens agressivos é de %d",ha);
	}

}
