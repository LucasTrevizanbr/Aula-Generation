package PacoteJava;
import java.util.*;
public class exercicioExtralacoCondicional1 {
	
	//Saber se a quantidade de quilos de tomate passou do permitido(50kgs) e calcular a multa de 4R$ por
	//quilo excedente
	
	public static void main(String args [])
	{
	Scanner ler = new Scanner(System.in);
    int p,e,m;
    
    System.out.println("João, entre com o peso dos tomares em quilos: ");
    p=ler.nextInt();
    
    if(p>50)
    {
   	   e=p-50;
   	   m=e*4;
   	   System.out.println("João você passou "+e+" quilos permitidos e pagara: "+m+"R$ de multa.");
    }
    else
    {
   	 	e=0;
   	 	m=0;
   	    System.out.println("João você passou "+e+" quilos permitidos e pagara: "+m+" de multa.");
    }
	
	}

}
 


