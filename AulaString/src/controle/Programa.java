package controle;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o nome: ");
		String nome = leia.nextLine();
		System.out.println("Digite o sobrenome: ");
		String sobrenome = leia.nextLine();
		System.out.println("Digite a data de nascimento: ");
		String data = leia.nextLine();
		System.out.println("Digite o cpf: ");
		String cpf = leia.nextLine();
		
		ControlePessoa cp = new ControlePessoa();
		cp.inserirPessoa(nome, sobrenome, data, cpf);
		
		System.out.println("DADOS DA PESSOA");
		System.out.println("Nome Completo: " + cp.informarNome());
		System.out.println("Data de Nascimento: " + cp.formatarData());
		System.out.println("Cpf: " + cp.formatarCpf());
		System.out.println("Quantidade de Vogais: " + cp.contarVogais());
		System.out.println("Homem ou Mulher: ");
		
	}

}


