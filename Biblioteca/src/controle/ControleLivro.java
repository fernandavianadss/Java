package controle;

import java.util.Scanner;
import dominio.Livro;

public class ControleLivro {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o ISBN: ");
		String isbn = leia.nextLine();
		System.out.print("Digite o título: ");
		String titulo = leia.nextLine();
		System.out.print("Digite o ano: ");
		int ano = leia.nextInt();
		
		/* Livro book;
		book = new Livro(); */
		Livro book = new Livro();
		
		book.inserir(isbn, titulo, ano);
		book.exibir();
	}
}