package exercicio2;

public class aviaoExecucao {
	public static void main(String args[])
	{
		aviao aviao1 = new aviao();
		aviao1.modelo ="Airbus A380";
	    aviao1.companhia ="Fly emirates";
	    aviao1.velocidadeA= 0;
	    aviao1.velocidadeD=250;
	    aviao1.capacidadeP=849;
		
		System.out.println(aviao1.getMensagem());
		aviao1.acelera(260);
		System.out.println("O avião esta a:"+aviao1.velocidadeA+" km/h");
		aviao1.autorizacao();
		aviao1.capacidade();
	}

}
