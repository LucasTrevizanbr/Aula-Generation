package pratica.livre;

import java.util.Scanner;

public class Ex3DesafioTuVaiMorrer {

    public static void main(String[] args) {

        final int minutosPorCigarro = 10;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos cigarros você fuma por dia?");
        int cigarrosPorDia  = leitor.nextInt();

        System.out.println("A quantos anos você fuma?");
        int anosSendoFumante = leitor.nextInt();

        int diasFumados = converterAnosParaDias(anosSendoFumante);
        int totalCigarrosDaVida = cigarrosPorDia * diasFumados;

        double minutosPerdidos = totalCigarrosDaVida * minutosPorCigarro;
        int diasPerdidos = converterMinutosParaDias(minutosPerdidos);

        System.out.println("Parabéns, você perdeu " + diasPerdidos+ " dias de vida!!");



    }

    private static int converterMinutosParaDias(double minutosPerdidos) {
        int minutosPorDia = 1440;
        return (int) (minutosPerdidos / minutosPorDia);
    }

    private static int converterAnosParaDias(int anosSendoFumante) {
        return anosSendoFumante * 365;
    }
}
