package herancaPolimorfismo;

public class Cavalo extends Animal{
	private String corre;
	
	public Cavalo()
	{
		
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	public String getNome()
	{
		return "Animal: " +super.getNome()+"\nIdade: "+super.getIdade()+"\nOnomatop�ia: "+super.getSom()+"Movimenta��o: "+this.corre;
	}
	

}
