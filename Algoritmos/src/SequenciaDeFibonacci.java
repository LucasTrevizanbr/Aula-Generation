import java.util.Scanner;

public class SequenciaDeFibonacci {

    public static void main(String[] args) {

        int n = 5;

        System.out.println("=================Fibonacci com For =============================");
        fiboComFor(n);
        System.out.println();
        System.out.println("=================Fibonacci com While ===========================");
        fiboComWhile(n);
        System.out.println();
        System.out.println("================ Fibonacci com Recursividade ===================");
        for(int i = 0; i <= 10; i++){
            System.out.print(fiboComRecursividade(i) + " -> ");
        }


    }

    public static void fiboComWhile(int termos){

        int contador = 0;

        long primeiroTermo = 0;
        long segundoTermo = 1;
        long produto = primeiroTermo + segundoTermo;

        System.out.print(primeiroTermo + " -> " + segundoTermo + " -> ");

        while(contador <= termos) {
            System.out.print(produto + " -> ");
            primeiroTermo = segundoTermo;
            segundoTermo = produto;
            produto = primeiroTermo + segundoTermo;

            contador++;
        }
    }

    public static void fiboComFor(int termos){

        long primeiroTermo ;
        long segundoTermo = 0;
        long produto = 0;

        for(int i = 0 ; i <= termos ; i++ ){

            if(i == 0){
                System.out.print(i +" -> ");
            }
            else if(i == 1){
                primeiroTermo = 1;
                segundoTermo = 1;
                produto = primeiroTermo + segundoTermo;
                System.out.print(primeiroTermo +" -> " + segundoTermo +" -> " + produto +" -> ");
            }else{
                primeiroTermo = segundoTermo;
                segundoTermo = produto;
                produto = primeiroTermo + segundoTermo;
                System.out.print(produto  +" -> ");
            }
        }

    }

    public static int fiboComRecursividade(int termo){


        if(termo < 2){
            return 1;
        }

        return  fiboComRecursividade(termo - 1 ) + fiboComRecursividade(termo - 2);
    }
}
