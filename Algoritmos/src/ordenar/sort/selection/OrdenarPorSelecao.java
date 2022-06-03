package ordenar.sort.selection;

import encontrar.menores.Carro;

import java.math.BigDecimal;

public class OrdenarPorSelecao {

    public static void main(String[] args) {

        Carro[] carros = new Carro[] {
                new Carro("Lamborghini", new BigDecimal("1000000")),
                new Carro("Jipe", new BigDecimal("46.000")),
                new Carro("Brasilia", new BigDecimal("16.000")),
                new Carro("Smart", new BigDecimal("54.000")),
                new Carro("Fusca", new BigDecimal("17.000"))
        };


        for(int atual = 0; atual < carros.length -1; atual++){
            int indiceDoMenor = encontrarIndiceDoMenor(carros, atual, carros.length - 1);

            System.out.println("Trocando " + atual +" por " + indiceDoMenor);

            Carro carroAtual = carros[atual];
            Carro carroMaisBarato = carros[indiceDoMenor];

            System.out.println("Trocando " +carroAtual.getModelo() + " por " +carroMaisBarato.getModelo());

            carros[atual] = carroMaisBarato;
            carros[indiceDoMenor] = carroAtual;
        }

        for (int indice = 0; indice < carros.length; indice ++){
            System.out.println("Carro modelo: " + carros[indice].getModelo() +
                    " custa: " + carros[indice].getPreco());
        }




    }

    public static int encontrarIndiceDoMenor(Carro[] lista, int inicio, int termino){

        int indiceMenor = inicio;

        for(int posicaoAtual = inicio ; posicaoAtual <= termino ; posicaoAtual ++){
            if(lista[posicaoAtual].getPreco().compareTo(lista[indiceMenor].getPreco()) < 0){
                indiceMenor = posicaoAtual;
            }
        }

        return indiceMenor;
    }


}
