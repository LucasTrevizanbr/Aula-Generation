package exercicio1;

public class cliente {
	 
	private String nome;
	private String telefone;
	private String sexo;
	
	public cliente(String n, String t,String s)
	{
		nome = n;
		telefone = t;
		sexo = s;
	}
	public String getInfoCliente()
	{
		String infoCliente = "Nome: "+nome+"\nTelefone: "+telefone+"\nSexo: "+sexo;
		return infoCliente;
	}
	
	
}
