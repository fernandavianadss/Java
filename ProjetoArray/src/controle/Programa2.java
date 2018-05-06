package controle;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] numeros = new int[10];
		int[] qtdpar = new int[10];
		
		for(int i = 0; i < numeros.length; i++){
			System.out.println("Digite os numeros: ");
			numeros[i] = leia.nextInt();				
		}
		System.out.println("Números pares: ");
		for(int i = 0; i < numeros.length; i++ ){
			if (numeros[i] % 2 == 0)
				System.out.println(numeros[i] + "- ");
		}
		
	}

}
