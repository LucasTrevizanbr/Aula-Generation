package ordenar.sort.insertion;

import encontrar.menores.Carro;

import java.math.BigDecimal;

public class OrdenarPorInsercao {

    public static void main(String[] args) {
        Carro[] carros = new Carro[] {
                new Carro("Lamborghini", new BigDecimal("1000000")),
                new Carro("Jipe", new BigDecimal("46.000")),
                new Carro("Brasilia", new BigDecimal("16.000")),
                new Carro("Smart", new BigDecimal("54.000")),
                new Carro("Fusca", new BigDecimal("17.000"))
        };

        ordenar(carros, carros.length);
    }

    private static void ordenar(Carro[] carros, int qtdElementos) {

        for(int elementoAtual = 0; elementoAtual < qtdElementos; elementoAtual ++){

            int elementoEmAnalise = elementoAtual;

            while(elementoEmAnalise > 0 &&
                    carros[elementoEmAnalise].getPreco().compareTo(carros[elementoEmAnalise - 1].getPreco()) < 0) {

                Carro carroAtual = carros[elementoEmAnalise];
                Carro carroAnterior = carros[elementoEmAnalise - 1];

                carros[elementoEmAnalise] = carroAnterior;
                carros[elementoEmAnalise - 1] = carroAtual;
                
                elementoEmAnalise --;
            }
        }
    }


}
