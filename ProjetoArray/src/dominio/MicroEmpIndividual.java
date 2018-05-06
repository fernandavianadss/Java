package dominio;

public class MicroEmpIndividual extends PessoaJuridica{
	private String mei;

	public MicroEmpIndividual(String cnpj, String razaosocial, String endereco,
			String telefone, String mei) {
		super(cnpj, razaosocial, endereco, telefone);
		
	}

	public String getMei() {
		return mei;
	}

	public void setMei(String mei) {
		this.mei = mei;
	}
	
	
	
}

