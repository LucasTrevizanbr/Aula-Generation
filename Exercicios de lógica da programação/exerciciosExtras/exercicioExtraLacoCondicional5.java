package PacoteJava;
import java.util.*;
public class exercicioExtraLacoCondicional5 {
	
	//Checar indice de polui��o para notificar empresas
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float ip;
		
		System.out.println("Insira o indice de polui��o: ");
		ip = ler.nextFloat();
		
		if(ip>=0.05 && ip <=0.25)
		{
			System.out.println("O �ndice de polui��o esta aceitavel");
		}
		else if(ip==0.3)
		{
			System.out.println("Notificar empresas do 1� grupo");
		}
		else if(ip==0.4)
		{
			System.out.println("Notificar empresas do 1� e 2� grupo");
		}
		else if(ip>=0.5)
		{
			System.out.println("Notificar empresas de todos os grupos ");
		}
		
	}

}
