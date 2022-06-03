package pratica.livre;

public class Ex3Varios {


    public static void main(String[] args) {

        System.out.println(media(10,6));
        mostraOsLados(8);
        dobroETerco(4);
        System.out.println("dolares: " + quantosDolares(167.50));
        areaETinta(2,3);
        equacaoSegundoGrauCompleta(1, -6, 5);
        desconto(25.00);
        aumentarSalário(1500);
        cobrarAluguelDoCarro(10, 2);
        calcularSalario(10);

    }


    public static double media (double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }

    public static void mostraOsLados(int numero){
        System.out.println("O sucessor de " + numero +" é " + (numero+1));
        System.out.println("O Antecessor de " + numero +" é " + (numero-1));
    }

    public static void dobroETerco(double numero){
        System.out.println("o dobro de " + numero + " é "+ (numero * 2));
        System.out.println("Um terço de " + numero + " é "+ (numero / 3));
    }

    public static double quantosDolares(double qtdReais){
        double cotacao = 3.45;
        return qtdReais / cotacao;
    }

    public static void equacaoSegundoGrauCompleta(double a, double b, double c ){

        double delta = (Math.pow(b, 2)) - 4 * a * c;

        double incognitaMais = (- b + Math.sqrt(delta)) / 2 * a;
        double incognitaMenos = (- b - Math.sqrt(delta)) / 2 * a;

        double [] raizes = {incognitaMenos, incognitaMais};

        System.out.println("Raizes da equação = {" +raizes[0] +  ", " + raizes[1] +"}");
    }

    public static void areaETinta(double largura, double altura){
        double litroTinta = 2.0;

        double areaDaParede = largura * altura;
        double litrosDeTinta = areaDaParede / litroTinta;

        System.out.println("Para " + areaDaParede + " m2 de parede, você precisa de "
                + litrosDeTinta +" litros de tinta");
    }

    public static void desconto(double preco){
        double desconto = (5.00 / 100) * preco;
        double descontoLegal = preco * (0.05);

        double novoPreco = preco - desconto;

        System.out.println("Originalmente custa " + preco + "/ O produto com 5% de desconto custa: " +novoPreco);
    }

    public static void aumentarSalário(double salario){
        double aumento = salario * (0.15);

        double novoSalario = salario + aumento;

        System.out.println("Originalmente recebia: " + salario + "| Com 15% de aumento, recebe: " +novoSalario);
    }

    public static void cobrarAluguelDoCarro(int qtdDias, double kmRodados){
        double precoDia = 90.00;
        double precoKm = 0.20;

        double totalPrecoDia = precoDia * qtdDias;
        double totalPrecoKm = precoKm * kmRodados;
        double total = totalPrecoDia + totalPrecoKm;

        System.out.println("Você deve pagar " + totalPrecoDia + " pelos " + qtdDias +" dias alugados");
        System.out.println("Você deve pagar " + totalPrecoKm + " pelos " + kmRodados +" KM rodados");
        System.out.println("Totalizando " + total + " R$" );
    }

    public static void calcularSalario(int qtdDias){
        int horasTrabalhadasPorDia = 8;
        double recebePorHora = 25.00;
        double precoDia = recebePorHora * horasTrabalhadasPorDia;

        double totalReceberNoMes = precoDia * qtdDias;

        System.out.println("Pelos " + qtdDias + " dias trabalhados você vai receber " + totalReceberNoMes);

    }
}
