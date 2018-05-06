package controle;

import java.util.Scanner;

import dominio.Parto;

public class ControleParto {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a data do parto: ");
		String data = leia.nextLine();
		System.out.print("Digite a hora do parto: ");
		String hora = leia.nextLine();
		
		Parto par = new Parto();
		par.setData(data);
		par.setHora(hora);
		
		System.out.println("DADOS DO PARTO");
		System.out.println("Data: " + par.getData());
		System.out.println("Hora: " + par.getHora());
	}
}
