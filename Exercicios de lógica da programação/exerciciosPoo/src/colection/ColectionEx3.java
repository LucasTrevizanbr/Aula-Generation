package colection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class ColectionEx3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int opc;
		Collection<String> estoque = new ArrayList();
    
		System.out.println("Vamos gerenciar nosso estoque, escolha as opções:");
		do{
		System.out.println("1 para adicionar um item ao estoque");
		System.out.println("2 para remover um item do estoque");
		System.out.println("3 para atualizar um produto do estoque");
		System.out.println("4 para ver o estoque\n0 para sair\n");
		opc= ler.nextInt();
	    
		switch(opc) 
		{
		 case 1:
			System.out.println("Escreva o item que quer adicionar:");
			String item = ler.next();
			estoque.add(item);
		    break;
	     case 2: 
	    	System.out.println("Escreva o item que quer remover");
		    String iten=ler.next();
		    estoque.remove(iten);
		    break;
	     case 3:
	    	 System.out.println("Escreva o item que quer atualizar");
	    	 String verifica = ler.next();
	    	 System.out.println("Escreva o item novo");
	    	 String produto = ler.next();
	    	 if(estoque.contains(verifica)) {
	    		 estoque.remove(verifica);
	    		 estoque.add(produto);
	    	 }
	    	 System.out.println(estoque);
	    	 break;
	     case 4:
	        System.out.println("OS itens do estoque são\n"+estoque);
	        break;
	        
		  default:
		  System.out.println("Finalizou o programa");
		
		}
       }while(opc!=0);
		
		
	}

}
