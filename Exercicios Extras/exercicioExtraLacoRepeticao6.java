package PacoteJava;
import java.util.*;
public class exercicioExtraLacoRepeticao6 {
	public static void main(String args[])
	//Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  de 1 at� ele.
	//Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.

	{
	  Scanner ler = new Scanner(System.in);
	  int num,total=0,contador=1;
	  System.out.println("Entre com um n�mero do seu teclado: ");
	  num = ler.nextInt();
	  
	  do
	  {
		  total = contador+total;
		  contador++;
		  
	  }while(num>=contador);
	
	  System.out.println("O resultado �: "+total);
	}

}
