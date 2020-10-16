package herancaPolimorfismo;

public class Cachorro extends Animal{
	private String corre;
    
	public Cachorro()
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
		return "Animal: " +super.getNome()+"\nIdade: "+super.getIdade()+"\nOnomatopéia: "+super.getSom()+"\nMovimentação: "+this.corre;
	}
	
}
