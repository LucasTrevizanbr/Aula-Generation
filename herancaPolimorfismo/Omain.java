package herancaPolimorfismo;

public class Omain {
	public static void main(String args[])
	{
		Cachorro cachorro = new Cachorro();
	    cachorro.setCorre("O cachorrinho corre");
	    cachorro.setNome("Billy bruto");
	    cachorro.setIdade("18");
	    cachorro.setSom("Auauauau");
	    Cavalo cavalo = new Cavalo();
	    cavalo.setCorre("O cavalinho corre em alta velocidade");
	    cavalo.setNome("Spirit");
	    cavalo.setIdade("3");
	    cavalo.setSom("Hiin in in ");
	    Preguica preguica = new Preguica();
	    preguica.setNome("Nelson");
	    preguica.setEscala("A preguiça escala árvores");
	    preguica.setIdade("28");
	    preguica.setSom("ooooo");
	    
	   
	    Animal[] animais = new Animal[3];
	    animais[0]= cachorro;
	    animais[1]= cavalo;
	    animais[2]= preguica;
	    
	    for(Animal loop:animais)
	    {
	    	System.out.println(loop.getNome());
	    }
	    
	    
	   
	    
	}

}
