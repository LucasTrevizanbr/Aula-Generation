package exercicioHeranca;

public class Teste {
	public static void main(String args[])
	{
		
		Administrador adm = new Administrador("Lucas","Av. Fabio Eduardo Ramos Esquivel,2900","11697340882","48086198812",21,30000);
		adm.getInfo();
		adm.ajudaDomes();
		Vendedor func = new Vendedor("Kalec","Av gaivotas,48","1149028922","68061899912",66,0,10);
		func.setValorVendas(func.getValorVendas());
		func.setComissao(func.getComissao());
		func.getInfo();
	}

}
