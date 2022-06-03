package pratica.livre;

import java.util.Scanner;

public class Ex6Varios {


    public static void main(String[] args) {
        percorrendo();
        percorrendoInverso();
        percorrendoPulandoTres();
        percorrendoPulandoCinco();
        percorrendoRegressivamenteMarcandoDivisiveisPorQuatro();
        percorreDoSeuJeito(10, 25, 3);
        acumulando();
        acumulandoDeTrasPraFrente();
        //lerSeteNumerosESomar();
        metricasDoSorteio();
    }

    private static void metricasDoSorteio() {
        int[] numerosSorteio = new int[20];
        int quantoMaiorQueCinco = 0;
        int quantosDivisivesPorTres = 0;
        int numerosSorteados = 0;

        while (numerosSorteados < 20){
            int numeroSorteado = (int) (Math.random() * 10);
            numerosSorteio[numerosSorteados] = numeroSorteado;

            if(numeroSorteado > 5){
                quantoMaiorQueCinco ++;
            }
            if(numeroSorteado % 3 == 0){
                quantosDivisivesPorTres ++;
            }

            numerosSorteados ++;
        }

        for(int i = 0; i < numerosSorteio.length; i ++){
            System.out.print(numerosSorteio[i] +", ");
        }
        System.out.println();
        System.out.println(quantoMaiorQueCinco+" números maiores que 5");
        System.out.println(quantosDivisivesPorTres+" números divisiveis por 3");

    }

    private static void lerSeteNumerosESomar() {
        System.out.println();
        Scanner leitor = new Scanner(System.in);
        int numerosDigitados = 1;
        int totalAcumulado = 0;

        while(numerosDigitados <= 7){
            System.out.println("Digite um número inteiro");
            int numeroAtual = leitor.nextInt();

            totalAcumulado += numeroAtual;

            numerosDigitados ++;
        }

        System.out.println("O total foi: " + totalAcumulado);
    }

    private static void acumulandoDeTrasPraFrente() {
        System.out.println();
        int iterador = 500;
        int total = 0;

        while(iterador >= 0){
            System.out.print(iterador + ", ");
            total += iterador;
            iterador -= 50;
        }

        System.out.println("Deu isso aqui: " + total);
    }

    private static void acumulando() {
        int iterador = 6;
        int total = 0;

        while(iterador <= 100){
            System.out.print(iterador + ", ");
            total += iterador;
            iterador += 2;
        }

        System.out.println("Deu isso aqui: " + total);
    }

    private static void percorreDoSeuJeito(int comeco, int fim, int deQuantoEmQuanto) {
        System.out.println();
        if(comeco < fim){
            while(comeco <= fim){
                System.out.print(comeco+", ");
                if(comeco == fim){
                    System.out.println("FIM");
                }
                comeco += deQuantoEmQuanto;
            }
        }else if(comeco > fim){
            while(comeco >= fim){
                System.out.print(comeco+", ");
                if(comeco == fim){
                    System.out.println("FIM");
                }
                comeco -= deQuantoEmQuanto;
            }
        }else{
            System.out.println("O começo é igual ao fim, não da pra percorrer isso!");
        }

    }

    private static void percorrendoRegressivamenteMarcandoDivisiveisPorQuatro() {
        System.out.println();
        int contador = 30;
        while(contador >= 1){

            if(contador % 4 == 0){
                System.out.print("["+contador+"], ");
            }else{
                System.out.print(contador +", ");
                if(contador == 1){
                    System.out.print(" FIM");
                }
            }
            contador --;
        }
    }

    private static void percorrendoPulandoCinco() {
        System.out.println();
        int contador = 100;
        while(contador >= 0){

            System.out.print(contador +", ");
            if(contador == 0){
                System.out.print(" FIM");
            }
            contador -= 5;
        }
    }

    private static void percorrendoPulandoTres() {
        System.out.println();
        int contador = 0;
        while(contador <= 18){

            System.out.print(contador +", ");
            if(contador == 18){
                System.out.print(" FIM");
            }
            contador += 3;
        }
    }

    private static void percorrendoInverso() {
        System.out.println();
        int contador = 10;
        while(contador >= 3){

            System.out.print(contador +", ");
            if(contador == 3){
                System.out.print(" FIM");
            }
            contador --;
        }
    }

    private static void percorrendo() {
        int contador = 6;
        while(contador <= 11){

            System.out.print(contador +", ");
            if(contador == 11){
                System.out.print(" FIM");
            }
            contador ++;
        }
    }
}
