package PacoteJava;
import java.util.*;
public class exercicioExtraLacoCondicional5 {
	
	//Checar indice de poluição para notificar empresas
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float ip;
		
		System.out.println("Insira o indice de poluição: ");
		ip = ler.nextFloat();
		
		if(ip>=0.05 && ip <=0.25)
		{
			System.out.println("O índice de poluição esta aceitavel");
		}
		else if(ip==0.3)
		{
			System.out.println("Notificar empresas do 1º grupo");
		}
		else if(ip==0.4)
		{
			System.out.println("Notificar empresas do 1º e 2º grupo");
		}
		else if(ip>=0.5)
		{
			System.out.println("Notificar empresas de todos os grupos ");
		}
		
	}

}
