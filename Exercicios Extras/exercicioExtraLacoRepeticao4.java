package PacoteJava;
import java.util.*;
public class exercicioExtraLacoRepeticao4 {
	public static void main(String args[])
	//Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s  
	//(imprimindo o novo valor) at� que ele seja maior do que 100
	//Ex.: se o usu�rio digita 5,  deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.

	{
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Entre com um n�mero: ");
		num = ler.nextInt();
		System.out.println("\n"+num);
		while(num<100)
		{
			num = num*3;
			System.out.println("\n"+num);
		}
	}

}
