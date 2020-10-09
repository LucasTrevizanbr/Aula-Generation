package VetorMatriz;
import java.util.*;
public class exercicio4 {
	public  static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int[][] matriz1= new int[2][2];
		int[][] matriz2= new int[2][2];
		int[][] matriz3= new int[2][2];
		int cont,sub,deci;
		System.out.printf("Digite um número que será uma constante e será somado em todas as matrizes: ");
		cont=ler.nextInt();
		
			for(int  linha=0;linha<2;linha++)
			{
				for(int coluna =0;coluna<2;coluna++)
				{
					System.out.printf("Insira o elemento M1 [%d][%d]: ",linha+1,coluna+1);
					matriz1[linha][coluna]=ler.nextInt();
					cont = cont+matriz1[linha][coluna];
					
				}
				
			}
		
			for(int  linha=0;linha<2;linha++)
			{
				for(int coluna =0;coluna<2;coluna++)
				{
					System.out.printf("Insira o elemento M2 [%d][%d]: ",linha+1,coluna+1);
					matriz2[linha][coluna]=ler.nextInt();
					cont = cont+matriz2[linha][coluna];
				}
				
			}
			
			System.out.println("Escolha o que deseja fazer");
			System.out.println("Se você deseja somar as duas matrizes, digite 1");
			System.out.println("Se você deseja subtrair a primeira matriz da segunda, digite 2");
			System.out.println("Se você deseja adicionar uma constante as duas matrizes, digite 3");
			System.out.println("Se você deseja imprimir as matrizes, digite 4");
			deci=ler.nextInt();
			switch(deci) 
			{
			case  1:
				
				for(int  linha=0;linha<2;linha++)
				{
					for(int coluna =0;coluna<2;coluna++)
					{
						
					}
				}
				System.out.println();
				break;
			case 2:
				{
				
				}
				break;	
			case 3:
				{
					System.out.printf("O valor da constante é: %d",cont);
				}
			case 4:
				{
					for(int  linha=0;linha<2;linha++)
					{
						for(int coluna =0;coluna<2;coluna++)
						{
							System.out.printf("\t %d \t",matriz1[linha][coluna]);
						}
					}
					System.out.println();
					
					for(int  linha=0;linha<2;linha++)
					{
						for(int coluna =0;coluna<2;coluna++)
						{
							System.out.printf("\t %d \t",matriz2[linha][coluna]);
						}
					}
					System.out.println();
				}
			    
			}
	
	}

}
