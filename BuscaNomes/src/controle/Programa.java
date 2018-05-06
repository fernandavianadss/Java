package controle;

import java.util.Scanner;

public class Programa{
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String[] nomes = new String[5];
		
			for(int i = 0; i < nomes.length; i++) {
				System.out.println("Digite o nome: ");
				nomes[i] = leia.nextLine();
			}
			
			System.out.println("Nomes que terminam com O");
				for(int i = 0; i < nomes.length; i++) {
					if(nomes[i].toUpperCase().charAt(0) == 'L')
						System.out.println(nomes[i]);
				}
			System.out.println("Nomes com mais de 7 letras");
				for(int i = 0; i < nomes.length; i++) {
					if(nomes[i].length() > 7)
						System.out.println(nomes[i]);
				}
				
	}
}