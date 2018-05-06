package controle;

import java.util.Scanner;
import dominio.Autor;

public class ControleAutor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = leia.nextLine();
		System.out.print("Digite a nacionalidade: ");
		String nacionalidade = leia.nextLine();

		Autor author = new Autor();
		
		author.inserir(nome, nacionalidade);
		author.exibir();
	}
}
