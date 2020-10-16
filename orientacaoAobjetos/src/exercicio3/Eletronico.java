package exercicio3;

public class Eletronico {
	private String nome;
	private String modelo;
	private String cor;
	private double preco;
	
	public Eletronico(String nome, String modelo, String cor, double preco)
	{
		this.nome = nome;
		this.modelo= modelo;
		this.cor= cor;
		this.preco=preco;
	}
	 public void getInfo()
	 {
		 System.out.println(nome+" modelo: "+modelo+"\nCor: "+cor+"\nPreço: "+preco);
	 }
	 public double parcelado()
	 {
		 preco = preco/2;
		 System.out.printf("Parcelado em duas vezes fica:X2 de %.3f",preco);
		 return preco;
	 }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	 

}
