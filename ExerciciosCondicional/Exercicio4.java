package ExerciciosCondicional;
import java.util.*;
public class Exercicio4 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int numero;
		double raiz,pot;
		System.out.printf("Entre com um n�mero");
		numero = ler.nextInt();
		
		if(numero%2==0)
		{
			raiz= Math.sqrt(numero);
			System.out.printf("O n�mero � par e  sua raiz �: %.2f",raiz);
		}
		else 
		{
			pot = Math.pow(numero,2);
			System.out.println("O n�mero � �mpar e  sua potencia �: "+pot);
		}
	
	}

}


