package controle;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String [] nomes = new String[10];
		
		for(int i= 0; i < nomes.length; i++){
			System.out.println("Digite o nome: ");
			nomes[i] = leia.nextLine();
		}
		System.out.println("NOMES QUE TERMINAM COM A ");
		for(int i =0; i < nomes.length; i++){
			if (nomes[i].toUpperCase().charAt((nomes[i].length()-1)) == 'A')
			System.out.println(nomes[i]);
		}
		
		System.out.println("NOMES QUE POSSUEM DUAS OU MAIS PALAVRAS ");
		int cont = 0;
		for(int i =0; i < nomes.length; i++){
			if (nomes[i].indexOf(' ') != -1)
				cont++;
		}
		System.out.println("Quantidade: "+cont);
		
	}
				
	}

