package exercicio2;

public class aviao {
	
	String modelo;
	String companhia;
	int capacidadeP;
	double velocidadeA;
	double velocidadeD;
	
	
	public String getMensagem()
	{
		String mensagem = "Você esta voando no avião modelo: "+modelo+", Pela companhia: "+companhia;
		return mensagem;
	}
	void acelera(double quantidade)
	{
		double velocidadeNova = this.velocidadeA + quantidade;
		this.velocidadeA = velocidadeNova;
	}
	public void capacidade()
	{
		if(this.capacidadeP<850)
		{
			System.out.println("Este voo esta abaixo da sua capacidade maxima de passageiros");
		}
		else if(this.capacidadeP==850)
		{
			System.out.println("Este voo esta operando com capacidade maxima de passageiros");
		}
		else
		{
			System.out.println("Este voo esta acima da sua capacidade máxima de passageiros");
		}	
	}
	public void autorizacao()
	{
		if(velocidadeA>=250)
		{
			System.out.println("Pode decolar");
		}
		else
		{
			System.out.println("Velocidade de decolagem insuficiente");
		}
	}
	

}
