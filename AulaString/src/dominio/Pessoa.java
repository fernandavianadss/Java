package dominio;

public class Pessoa {
	private String nome, sobrenome, data, cpf;

	public Pessoa(String nome, String sobrenome, String data, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.data = data;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}

