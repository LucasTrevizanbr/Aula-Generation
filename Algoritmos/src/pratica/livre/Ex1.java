package pratica.livre;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double produto;
        double descontoAVista;
        double totalDesconto;
        double total;

        System.out.println("Quando custa o produto?");
        produto = leitor.nextDouble();

        System.out.println("Pagamento é a vista? \n1 - Sim \t2 - Nao" );
        int opcao = leitor.nextInt();
        if(opcao == 1){
            System.out.println("Quanto de desconto aplicar?" );
            descontoAVista = leitor.nextDouble();
            totalDesconto = (descontoAVista / 100) * produto;
            System.out.println("foi aplicado " + totalDesconto + " reais de desconto");

            total = produto - totalDesconto;
            System.out.println("Total: " + total);
        }else{
            total = produto;
            System.out.println("Total: " + total);
        }

    }
}
