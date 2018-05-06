package controle;

import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String[] nomes = {"José", "Maria", "Dalira", "Ralf", "Gerson"};
		float[] notas = new float[5];
		
		for(int i = 0; i < nomes.length; i++){
			System.out.println("Nota do(a) aluno(a) "+ nomes[i] + ": ");
			notas[i] = leia.nextFloat();
		}
		System.out.println("Notas cadastradas");
		for(int i= 0; i < nomes.length; i++){
			System.out.println(nomes[i] + " - " + notas[i]);
		}
	}

}
