package dominio;

public class Autor {
	private String nome, nacionalidade;
	
	public void inserir(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	public void exibir() {
		System.out.println("Nome: " + nome);
		System.out.println("Nacionalidade: " + nacionalidade);
	}
}
