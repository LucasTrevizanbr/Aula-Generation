package Exercicioslacorep;
import java.util.*;
public class exercicio6 {
 public static void main(String args[])
 {
	 Scanner ler = new Scanner(System.in);
	 int num,cont=0,aux=0,media;
	 do
	 {
		 System.out.println("Entre com um n�mero inteiro: ");
	     num = ler.nextInt(); 
		 
	     if(num%3==0)
		 {
	         if(num!=0)
	    	 {
	        	 aux= aux + num;
				 cont++;	 
	    	 }
	         
		 }
	 }while(num!=0);
	 media=aux/cont;
	 System.out.println("Voc� digitou: "+cont+" n�meros que s�o multiplos de 3\na m�dia deles �: "+media);
 }  
}
