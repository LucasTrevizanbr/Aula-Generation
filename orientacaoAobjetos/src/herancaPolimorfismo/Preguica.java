package herancaPolimorfismo;

public class Preguica extends Animal {
	private String escala;

	public String getEscala() {
		return escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}
	public String getNome()
	{
		return "Animal: " +super.getNome()+"\nIdade: "+super.getIdade()+"\nOnomatopéia: "+super.getSom()+"Movimentação: "+this.escala;
	}
	
	

}
