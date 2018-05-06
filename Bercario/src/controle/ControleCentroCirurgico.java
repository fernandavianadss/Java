package controle;

import java.util.Scanner;
import dominio.CentroCirurgico;

public class ControleCentroCirurgico {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o andar: ");
		int andar = leia.nextInt();
		System.out.print("Digite a sala: ");
		int sala = leia.nextInt();		
		
		CentroCirurgico centro = new CentroCirurgico();
		centro.setAndar(andar);
		centro.setSala(sala);
		
		System.out.println("DADOS DO CENTRO CIRÚRGICO");
		System.out.println("Andar: " + centro.getAndar());
		System.out.println("Sala: " + centro.getSala());
	}
}
