public class Testando {
    public static void main(String[] args) {

        int[] numeros = { 15 , 160, 18,10, 32, 22, 31, 19, 18};

        for(int indice = 0; indice < numeros.length; indice++){

            int indiceAtual = indice;

            while(indiceAtual > 0 && numeros[indiceAtual] < numeros[indiceAtual - 1]){

                int numeroAtual = numeros[indiceAtual];
                int numeroAnterior = numeros[indiceAtual - 1];

                numeros[indiceAtual] = numeroAnterior;
                numeros[indiceAtual - 1] = numeroAtual;

                indiceAtual --;
            }
        }

        for(int i = 0 ; i < numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }

        int indiceDoMenor = 0;

        for(int indice = 0; indice < numeros.length; indice ++){
            if(numeros[indice] < numeros[indiceDoMenor]){
                indiceDoMenor = indice;
            }
        }

        System.out.println();
        System.out.println(indiceDoMenor);

        System.out.println("Fibonacci");
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int resultado = primeiroTermo + segundoTermo;

        System.out.print(primeiroTermo + ", " + segundoTermo + ", " + resultado +", ");

        int vezes = 1;

        while(vezes <= 5){
            primeiroTermo = segundoTermo;
            segundoTermo = resultado;
            resultado = primeiroTermo + segundoTermo;

            System.out.print(resultado + ", ");

            vezes ++;
        }
    }
}
