package loopaninhado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aninhado {

    public static void main(String[] args) {

        List<Integer> precos = new ArrayList<>(Arrays.asList(1000, 100, 150, 340, 660, 450, 830));

        int maiorLucro = descobriMaiorLucro(precos);

        System.out.println(maiorLucro);

    }

    private static int descobriMaiorLucro(List<Integer> precos) {
        int lucro = 0;
        int maiorLucro = 0;

        int compraNoAno = 0;
        int vendeNoAno = 0;

        for (compraNoAno = compraNoAno; compraNoAno < precos.size(); compraNoAno ++){

            int precoCompra = precos.get(compraNoAno);

            for(vendeNoAno = vendeNoAno; vendeNoAno < precos.size() ; vendeNoAno ++ ) {
                int precoVenda =  precos.get(vendeNoAno);
                lucro =  precoVenda - precoCompra;
                if (lucro > maiorLucro) {
                    maiorLucro = lucro;
                }
            }

            vendeNoAno = compraNoAno + 1 ;
        }
        return maiorLucro;
    }
}
