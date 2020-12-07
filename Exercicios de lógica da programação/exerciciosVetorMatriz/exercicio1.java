package VetorMatriz;
import java.util.*;
public class exercicio1 {
  public static void main(String args[])
  {
	  Scanner ler = new Scanner(System.in);
	  int[] a = {1,0,5,-2,-5,7};
	  int soma=0;
	  
	  soma = soma+a[0]+a[1]+a[5];
	  a[4]=100;
	  for(int i=0;i<6;i++)
	  {
		System.out.println(a[i]);  
	  }
	 
	  System.out.printf("A soma das posições A[0],A[1] e A[5] do array é: %d ",soma);
	  
  }
}
