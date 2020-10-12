package PacoteJava;
import java.util.*;
public class exercicioExtraLacoCondicional7 {
	//verificar se a base e a altura de um triangulo são valores válidos(positivos), se for calcular a área
 
	public static void main(String args[])
  {
	 Scanner ler = new Scanner(System.in);
	 int base,altura,area;
	 System.out.println("Entre com a base do triangulo");
	 base = ler.nextInt();
	 System.out.println("Entre com a altura do triangulo");
	 altura = ler.nextInt();
	 
	 if(base>0 && altura>0)
	 {
		 area = altura*base/2;
		 System.out.println("A área do triangulo é :"+area);
	 }
	 else
	 {
		 System.out.println("Valores inválidos."); 
	 }
	 
	 
  }
}
