package exercicioHeranca;
import java.util.*;
public class Vendedor extends Pessoa {
	Scanner entrada = new Scanner(System.in);
	private double valorVendas;
	private double comissao;
	double x=0;
	public Vendedor(String nome, String endereco, String telefone, String cpf, int idade, double valorVendas,double comissao)
	{
		super(nome, endereco, telefone, cpf, idade);
	    this.valorVendas= valorVendas;
	    this.comissao= comissao;
    }
	public void getInfo()
	{
		System.out.println("\nNome: "+getNome()+"\nEndereço: "+getEndereco()+"\nTelefone: "+getTelefone()+"\nCpf: "+getCpf()+
				"\nIdade: "+getIdade()+"\nValor de vendas: "+valorVendas+"\nComissão : "+comissao);
	}
	public double getValorVendas() {
		System.out.println("\nVamos calcular sua comissão,para parar de somar as vendas digite 0 \n");
		do {
	    	System.out.println("Entre com os valores das vendas: ");
	    	x=entrada.nextDouble();
		    valorVendas= valorVendas+x;
		    
	    }while(x>0);
		
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		comissao = valorVendas/10;
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	

}
