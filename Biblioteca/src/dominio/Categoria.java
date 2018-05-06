package dominio;

public class Categoria {
	private String codigo, descricao;
	
	public void inserir(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public void exibir() {
		System.out.println("DADOS DA CATEGORIA");
		System.out.println("Código: " + codigo);
		System.out.println("Descrição: " + descricao);
	}
}