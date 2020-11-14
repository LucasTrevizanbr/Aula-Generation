package exercicioHeranca;

public class Administrador extends Pessoa{
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, String cpf, int idade, double ajudaDeCusto)
	{
		super(nome, endereco, telefone, cpf, idade);
	    this.ajudaDeCusto = ajudaDeCusto;
    }
	public void getInfo()
	{
		System.out.println("Nome: "+getNome()+"\nEndereço: "+getEndereco()+"\nTelefone: "+getTelefone()+"\nCpf: "+getCpf()+
				"\nIdade: "+getIdade()+"\nAjuda de custo disponivel: "+ajudaDeCusto);
	}
	public double ajudaDomes()
	{
	  ajudaDeCusto = ajudaDeCusto/12;
	  System.out.printf("Ajuda de custo por mes: %.2f", ajudaDeCusto);
	  return ajudaDeCusto;
	  
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
}

