package encontrar.menores;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EncontrarMenorUsandoObjeto {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Lamborghini", new BigDecimal("1000000"));
        Carro carro2 = new Carro("Jipe", new BigDecimal("46.000"));
        Carro carro3 = new Carro("Brasilia", new BigDecimal("16.000"));
        Carro carro4 = new Carro("Smart", new BigDecimal("54.000"));
        Carro carro5 = new Carro("Fusca", new BigDecimal("17.000"));

        List<Carro> carros = Arrays.asList(carro1, carro2, carro3, carro4, carro5);

        BigDecimal menorPreco = new BigDecimal("100000000");

        for (Carro carro: carros) {
            if(carro.getPreco().compareTo(menorPreco) < 0){
                menorPreco = carro.getPreco();
            }
        }


        int posicaoMaisBarata = 0;

        for(int posicaoAtual = 0; posicaoAtual < carros.size() ; posicaoAtual ++){
            if(carros.get(posicaoAtual).getPreco().compareTo(carros.get(posicaoMaisBarata).getPreco()) < 0){
                posicaoMaisBarata = posicaoAtual;
            }
        }

        Carro carroMenorPreco = carros.stream().min(Comparator.comparing(Carro::getPreco)).get();

        System.out.println("Usando variável auxiliar : " + menorPreco);
        System.out.println("Usando streams (1 linha) : " + carroMenorPreco);
        System.out.println("Usando posições do array: posição do carro " + posicaoMaisBarata +
                " valor do carro: " + carros.get(posicaoMaisBarata).getPreco());

        carros.sort(Comparator.comparing(Carro::getPreco));
        carros.forEach(carro -> System.out.println("Carro modelo "+ carro.getModelo() + " custa: " + carro.getPreco()));
    }
}
