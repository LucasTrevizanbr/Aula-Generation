package PacoteJava;

public class exercicioExtraLacoRepeticao2 {
	public static void main(String args[])
	{
		//Desenvolver um sistema que imprima soma de todos os numeros imp�res e que s�o multiplos de 3
		// em uma lista de 1 a 500
		int soma=0;
		
		for(int i=1; i<=500;i++)
		{
			if(i%2!=0 && i%3==0)
			{
				soma= soma+i;
			}
		}
		System.out.println("A soma dos n�meros impares que s�o multiplos de 3 entre 1 e 500 �: "+soma);
		}

}
