package PacoteJava;
import java.util.*;
public class exercicioExtraLacoRepeticao3 {
 public static void main(String args[])
 {
	 Scanner ler = new Scanner(System.in);
	 int cont=0;
	 double soma=0,media,num;
	 System.out.println("Entre com um número");
	 num= ler.nextDouble();
	 
	 while(num>0)
	 {   
		 soma= soma+num;
		 cont++;
		 System.out.println("Entre com um número");
		 num= ler.nextDouble();
	 }
	 if(num<0)
	 {
	 media=soma/cont;
	 System.out.println("A soma dos valores digitados é de: "+soma+"\nA quantidade de valores digitdos foi de: "+cont+"\nA media deles é: "+media);
	 
	 }
  
 }
}
