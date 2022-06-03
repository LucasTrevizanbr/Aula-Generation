package pratica.livre;

public class Ex2 {
    public static void main(String[] args) {
        double pctDesconto = 15;
        double totalComDesconto = 224;

        valorOriginalSemUsarDecimalNoDesconto(pctDesconto, totalComDesconto);

    }

    private static void valorOriginalSemUsarDecimalNoDesconto(double pctDesconto, double totalComDesconto) {

        double converterParaDecimal = pctDesconto / 100;
        System.out.println(converterParaDecimal);

        double descontoLegal =  1 - converterParaDecimal;
        double precoOriginal = totalComDesconto / descontoLegal;

        double descontoAplicado = precoOriginal - totalComDesconto;

        System.out.println("Foi aplicado: " + descontoAplicado + " reais de desconto");
        System.out.println("Valor total seria: " + precoOriginal);
    }
}
