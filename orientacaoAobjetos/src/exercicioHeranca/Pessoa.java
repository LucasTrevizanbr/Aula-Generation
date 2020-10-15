package exercicioHeranca;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private int idade;
	
	

	public Pessoa (String nome, String endereco, String telefone,String cpf, int idade)
	{
		super();
		this.nome= nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.idade = idade;
	}
	public void getInfo()
	{
		System.out.println("Nome: "+nome+" endereço: "+endereco+" telefone: "+telefone);
	}
	public void validarCpf(String cpf)
	{
		if(getCpf().length()==11)
		{
			System.out.println("Cpf válido");
		}
		else {
			System.out.println("Cpf inválido");
		}
	}
	public void checarIdade()
	{
		if(getIdade()<18)
		{
			System.out.println("Menor de idade");
		}
		else {
			System.out.println("Maior de idade.");
		}
	}


	public int getIdade() {
		return idade;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}


	public String getEndereco()
	{
		return endereco;
	}


	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	
	public String getTelefone() 
	{
		return telefone;
	}
	
	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
