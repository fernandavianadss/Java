package controle;

import dominio.Funcionario;
import dominio.Vendedor;


public class Programa {

	public static void main(String[] args) {
		Funcionario func = new Funcionario("4411", "José", 1000);
		Vendedor vend = new Vendedor("4422", "Maria", 1000, 0);
		
		
		System.out.println("DADOS DO FUNCIONÁRIO 1");
		System.out.println("Matrícula: "+ func.getMatricula());
		System.out.println("Nome: "+ func.getNome());
		System.out.println("Salário bruto: "+ func.getSalario());
		System.out.println("Salário final: "+ func.calcularSalario());
		
		
		System.out.println("DADOS DO FUNCIONÁRIO 2");
		System.out.println("Matricula: "+ vend.getMatricula());
		System.out.println("Nome: "+ vend.getNome());
		System.out.println("Salario Bruto: "+ vend.getSalario());
		System.out.println("Salario liquido como funcionario: "+ vend.calcularSalario());
		System.out.println("Salario final como vendender : "+ vend.calcularSalario(10000));
	}

}
