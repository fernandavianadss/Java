package dominio;

public class Vendedor extends Funcionario{
	private float comissao;

	public Vendedor(String matricula, String nome, float salario, float comissao) {
		super(matricula, nome, salario);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public float calcularComissao(float vendas){
		comissao = vendas * (float)0.04;
		return comissao;
	}
	
	public float calcularSalario() {
		return super.getSalario() - super.getSalario() - (float)(super.getSalario() * 0.11)
					   - (float)(super.getSalario() * 0.27)
					   + comissao;
	}
}
