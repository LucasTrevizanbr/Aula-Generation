package Exercicioslacorep;

public class exercicio1 {
 public static void main(String args[])
 {
	 int x,num=0;
	 for(x=1000;x<=1999;x++)
	 {
	  if(x%11==5)
	  {
		  num=x;
		  System.out.printf("\n %d",num);
	  }
	 }
 }
}
