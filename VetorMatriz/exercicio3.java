package VetorMatriz;
import java.util.*;
public class exercicio3 {
 public static void main(String args[])
 {
	 Scanner ler= new Scanner(System.in);
	 int[][] matriz=new int[3][3];
	 int cont=0;
	 System.out.println("Matriz M[3][3]\n");
	 
	 for(int linha=0;linha<3;linha++) 
	 {
		 for(int coluna=0;coluna<3;coluna++) 
		 {
		 System.out.printf("Insira o elemento M [%d][%d]: ",linha+1,coluna+1);
		 matriz[linha][coluna]=ler.nextInt();
	        if(matriz[linha][coluna]>10)
	        {
	    	 cont++;
	        }
		 }
	 }
	 
	 System.out.println("\nA matriz ficou: \n");
	 for(int linha=0;linha<3;linha++)
	 {
		 for(int coluna=0;coluna<3;coluna++)
		 {
			 System.out.printf("\t %d \t",matriz[linha][coluna]);
		 }
		 System.out.println();
	 }
	 System.out.println("A matriz possui "+cont+" valores maiores que 10"); 
	 
 }
}
