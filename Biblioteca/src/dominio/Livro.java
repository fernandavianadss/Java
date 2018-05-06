package dominio;

public class Livro {
	private String isbn, titulo;
	private int ano;
	
	public void inserir(String isbn, String titulo, int ano) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.ano = ano;
	}
	
	public void exibir() {
		System.out.println("ISBN: " + isbn);
		System.out.println("Título: " + titulo);
		System.out.println("Ano: " + ano);
	}
}