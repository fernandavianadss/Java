package controle;

import java.util.Scanner;
import dominio.Categoria;

public class ControleCategoria {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o c�digo: ");
		String codigo = leia.nextLine();
		System.out.print("Digite a descri��o: ");
		String descricao = leia.nextLine();
		
		Categoria cat = new Categoria();
		
		cat.inserir(codigo, descricao);
		cat.exibir();
	}
}
