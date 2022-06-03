package pratica.livre;

public class Ex5Varios {
    public static void main(String[] args) {
        comparaElesAi(16, 15);
        situacaoEscolar(4.4, 3.3);
        classeDoTerreno(20.0, 10.0 );
        jokenpo(3);
        adivinha(2);
        dependeDoSeuSalario(160000.00, 4200.00, 10);
    }

    private static void dependeDoSeuSalario(double valorCasa, double salario, int qtdAnos) {
        int meses = qtdAnos * 12;
        double tetoParcela = salario * 0.30;
        double valorParcela = valorCasa  / meses;

        if(valorParcela > tetoParcela){
            System.out.println("Empréstimo não concedido, a parcela de " + valorParcela + "R$ excede o teto de " +
                    tetoParcela+"R$ (30% do seu salário) ");
        }else{
            System.out.println("Empréstimo concedido");
        }


    }

    private static void adivinha(int numero) {
        int opcaoMaquina = (int) (Math.random() * 5 + 1);

        if(numero == opcaoMaquina){
            System.out.println("Você acertou, a máquina escolheu: " + opcaoMaquina);
        }else {
            System.out.println("Você perdeu, a máquina escolheu: " + opcaoMaquina);
        }
    }

    private static void jokenpo(int opcaoJogador) {
        String decisaoJogador = pedraPapelTesoura(opcaoJogador);;
        int opcaoMaquina = (int) (Math.random() * 3 + 1);
        String decisaoMaquina = pedraPapelTesoura(opcaoMaquina);

        if(opcaoMaquina == 1){
            if(opcaoJogador == 1){
                System.out.println("Empate, você jogou: " +decisaoJogador+ " e a máquina também");
            }else if(opcaoJogador == 2){
                System.out.println("Você perdeu, a máquina jogou: "+decisaoMaquina);
            }else if(opcaoJogador == 3){
                System.out.println("Você ganhou, a máquina jogou: "+decisaoMaquina);
            }else{
                System.out.println("Escolha uma opção válida");
            }

        }else if(opcaoMaquina == 2){
            if(opcaoJogador == 1){
                System.out.println("Você venceu, a máquina jogou: "+ decisaoMaquina);
            }else if(opcaoJogador == 2){
                System.out.println("Empate, você jogou: " +decisaoJogador+ " e a máquina também");
            }else if(opcaoJogador == 3){
                System.out.println("Você perdeu, a máquina jogou: "+decisaoMaquina);
            }else{
                System.out.println("Escolha uma opção válida");
            }
        }else{
            if(opcaoJogador == 1){
                System.out.println("Você perdeu, a máquina jogou: "+decisaoMaquina);
            }else if(opcaoJogador == 2){
                System.out.println("Você venceu, a máquina jogou: "+ decisaoMaquina);
            }else if(opcaoJogador == 3){
                System.out.println("Empate, você jogou: " +decisaoJogador+ " e a máquina também");
            }
        }

    }

    private static String pedraPapelTesoura(int opcao) {
        String decisao = "";
        switch (opcao){
            case 1 : decisao = "pedra";
            break;
            case 2 : decisao = "tesoura";
            break;
            case 3: decisao = "papel";
        }
        return decisao;
    }

    private static void classeDoTerreno(double largura, double altura) {
        double metrosQuadrados = largura * altura;

        if(metrosQuadrados < 100){
            System.out.println("TERRENO POPULAR");
        }else if(metrosQuadrados >= 100 && metrosQuadrados <= 500){
            System.out.println("TERRENO MASTER");
        }else{
            System.out.println("TERRENO VIP");
        }
    }

    private static void situacaoEscolar(double notaA, double notaB) {
        double media = (notaA + notaB) / 2;
        if(media <= 4.9){
            System.out.println("REPROVADO");
        }else if(media >= 5.0 && media <= 6.9){
            System.out.println("RECUPERAÇÃO");
        }else{
            System.out.println("APROVADO");
        }
    }

    private static void comparaElesAi(int numeroA, int numeroB) {
        if(numeroA > numeroB){
            System.out.println("O primeiro valor: " + numeroA + " é maior que o segundo valor: "+numeroB);
        }else if(numeroB > numeroA){
            System.out.println("O segundo valor: " + numeroB + " é maior que o primeiro valor: "+numeroA);
        }else{
            System.out.println("O primeiro valor: " + numeroA + " é igual ao segundo valor: "+numeroB);
        }
    }
}
