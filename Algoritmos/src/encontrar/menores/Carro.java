package encontrar.menores;

import java.math.BigDecimal;

public class Carro {

    private String modelo;
    private BigDecimal preco;

    public Carro(String modelo, BigDecimal preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", preco=" + preco +
                '}';
    }
}
