package PacoteJava;
import java.util.*;
public class exercicioExtraLacoRepeticao1 {
	public static void main(String args[])
	{
		//pesquisar entre 20 habitantes quanto eles ganham e quantos filhos tem para calcular
		//a media de filhos, a media do salario, maiorsalario, porcentagem de pessoas que ganham até 100R$
		
		Scanner ler = new Scanner (System.in);
		int hab,filho,totalsa=0,salario,totalfi=0,maiorsal=0,cont=0;
		double mediasal,mediafi,porcen;
		
		
		for(hab=1;hab<=20;hab++)
		{
			System.out.println("Informe seu salário: ");
			salario= ler.nextInt();
			totalsa= totalsa +salario;
			if(maiorsal<salario)
			{
				maiorsal = salario;
			}
			if(salario <=100)
			{
				cont++;
			}
			System.out.println("Quantos filhos vc tem: ");
			filho= ler.nextInt();
			totalfi= totalfi+filho;
		
		}
		mediasal = totalsa/20;
		mediafi= totalfi/20;
		porcen = cont*100/20;
		System.out.println("O maior salario foi de: "+maiorsal+"\nA média de filhos é de: "+mediafi+"\n A média dos salários é de: "+mediasal+"\n A porcentagem de pessoas que ganham até 100R$ é de :"+porcen+"%");
		
		
	}

}
