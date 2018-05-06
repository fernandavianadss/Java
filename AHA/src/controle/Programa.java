package controle;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("CÁLCULO DE FCA");
		
		System.out.print("Digite o nome: ");
		String nome = leia.nextLine();
		System.out.print("Digite o sobrenome: ");
		String sobrenome = leia.nextLine();
		System.out.print("Digite o dia do nascimento: ");
		int dia = leia.nextInt();
		System.out.print("Digite o mês do nascimento: ");
		int mes = leia.nextInt();
		System.out.print("Digite o ano do nascimento: ");
		int ano = leia.nextInt();
		
		ControleFrequenciaCardiaca cfc = new ControleFrequenciaCardiaca();
		cfc.inserirFrequencia(nome, sobrenome, dia, mes, ano);
		
		System.out.println("FREQUÊNCIA CARDÍACA CADASTRADA");
		System.out.println("Nome completo: " + cfc.consultarFrequencia().getNome() + " " +
				cfc.consultarFrequencia().getSobrenome());
		System.out.println("Data de nascimento: " + 
				cfc.consultarFrequencia().getDia() + "/" +
				cfc.consultarFrequencia().getMes() + "/" +
				cfc.consultarFrequencia().getAno());
		System.out.println("Idade: " + cfc.calcularIdade());
		System.out.println("FCM: " + cfc.calcularFCM());
		System.out.println("FCA: " + cfc.calcularFCA());
	}
}
