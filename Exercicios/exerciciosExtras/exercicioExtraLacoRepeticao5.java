package PacoteJava;

public class exercicioExtraLacoRepeticao5 {
	public static void main(String args[])
	{
		//Faça um programa que mostre uma contagem na tela de 233 a 456, 
		//só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.

		int num=233;
		do
		{ 
			if(num>=300 && num<=400)
			{
				num=num+3;
			}
			else
			{
				num=num+5;
			}
			System.out.println("\n"+num);
			
			
		}while(num<456);
	}

}
