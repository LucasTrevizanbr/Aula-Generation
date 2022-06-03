package pratica.livre;

import java.time.LocalDate;

public class Ex4Varios {

    public static void main(String[] args) {
        taxadoFi(90.00);
        podeVotar(2009);
        esseAnoEBissexto(1996);
        situacaoMilitar(2005);
        quantosKmCustaSuaViagem(400.0);
        daPraFazerUmTrianguloComEssasRetas(10.0, 20.0, 30.0);
    }

    private static void daPraFazerUmTrianguloComEssasRetas(double retaA, double retaB, double retaC) {
        if((retaA < retaB + retaC) && (retaB < retaC + retaA) && (retaC < retaA + retaB)){
            System.out.println("Da pra fazer um triangulo com essas retas");
        }else{
            System.out.println("Não da pra fazer um triangulo com essas retas");
        }
    }

    private static void quantosKmCustaSuaViagem(double kmDistancia) {
        double taxaPorKm = 0.0;
        double total = 0.0;

        if( kmDistancia <= 200.00){
            taxaPorKm = 0.50;
            total = taxaPorKm * kmDistancia;
            System.out.println("Você vai pagar o total de " + total + " R$ pelos " + kmDistancia + "KM");
        }else{
            taxaPorKm = 0.45;
            total = taxaPorKm * kmDistancia;
            System.out.println("Você vai pagar o total de " + total + " R$ pelos " + kmDistancia + "KM");
        }
    }

    private static void situacaoMilitar(int anoNascimento) {
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - anoNascimento;

        if(idade < 18){
            System.out.println("Ainda falta " + (18 - idade) + " ano(s) para você poder se alistar");
        }else if(idade == 18){
            System.out.println("Ja pode capinar lote!");
        }else{
            System.out.println("Você está " + (idade - 18) + " anos atrasado pra se alistar!");
        }
    }

    private static void esseAnoEBissexto(int ano) {
        if(ano % 4 == 0){
            System.out.println("Sim, o ano de " + ano + " é bissexto!");
        }else{
            System.out.println("Não, o ano de " + ano + " não é bissexto!");
        }
    }

    private static void podeVotar(int anoNascimento) {
        LocalDate hoje = LocalDate.now();
        int idadePessoa = hoje.getYear() - anoNascimento;

        if(idadePessoa >= 16){
            System.out.println("Você já tem " + idadePessoa + " anos, portanto pode votar");
        }else{
            System.out.println("Você só tem " + idadePessoa + " anos, então espera mais um pouco");
        }
    }

    private static void taxadoFi(double kmPorHora) {
        final double kmHoraMaximoPermitido = 80.00;

        if(kmPorHora > kmHoraMaximoPermitido){
            final double taxaPorKmExcedido = 5.00;

            double kmExcedidos = kmPorHora - kmHoraMaximoPermitido;
            double multaTotal = taxaPorKmExcedido * kmExcedidos;

            System.out.println("Você foi multado, por estar " + kmExcedidos + " KM/H acima do permitido, " +
                    "Vai pagar um total de " + multaTotal);

        }
    }


}
