package PacoteJava;
import java.util.*;
public class exercicioExtraLacoCondicional2 {
	
	//Ler o c�digo de um funcionario e as horas trabalhadas calcular as horas extras que valem 
	//a partir de 50 horas trabalhadas
	//cada hora extra vale 20R$
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		String c;
		int salario,n,e,aux,salariototal;
		System.out.println("Entre com seu c�digo:");
		c= ler.next();
		System.out.println("Entre com a quantidade de horas trabalhadas");
		n= ler.nextInt();
		salario=n*10;
		
		if(n>50)
		{
		  aux=n-50;
		  e= aux*20;
		  salariototal =salario+e;
		  System.out.println("Seu salario total foi de:"+salario+"\nO sal�rio de horas excedentes foi de: "+e+"\nO sal�rio total foi de: "+salariototal);
		}
		else
	    {
			e=0;
			System.out.println("Seu salario total foi de: "+salario+"\nO sal�rio de horas excedentes foi de: "+e);
		}
	
		
	}

}
