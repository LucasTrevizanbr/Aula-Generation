package PacoteJava;
import java.util.*;
public class exercicioExtralacoCondicional8 {
	
	//Imprimir a variavel numero somente se ela for maior que 100 caso contrario imprimila com valor  0
    public static void main(String args[])
    {
    	Scanner ler = new Scanner(System.in);
    	int n;
    	System.out.println("Entre com um número: ");
    	n = ler.nextInt();
    	if(n>100)
    	{
    		 System.out.println("\n"+n);
    	}
    	else
    	{
    		n=0;
            System.out.println("\n"+n);
    	}
    }
}
