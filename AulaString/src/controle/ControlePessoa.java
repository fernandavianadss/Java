package controle;

import dominio.Pessoa;

public class ControlePessoa {
	private Pessoa pes = new Pessoa(null, null, null, null);
	
	public void inserirPessoa(String nome, String sobrenome, String data, String cpf){
		pes.setNome(nome);
		pes.setSobrenome(sobrenome);
		pes.setData(data);
		pes.setCpf(cpf);
	}
		
	public String informarNome(){
		return pes.getNome() + " " + pes.getSobrenome();
	}
	
	public String formatarData(){
		String df = pes.getData().substring(0,2) + "/" + pes.getData().substring(2,4) + "/" + pes.getData().substring(4,8);
		return df;
	}
	
	public String formatarCpf(){
		 return pes.getCpf().substring(0,3) + "." + pes.getCpf().substring(3,6) + "." + pes.getCpf().substring(6,9) + "-" + pes.getCpf().substring(9,11);
	}
	
	public int contarVogais(){
		int qtd = 0;
	
		String nome = informarNome().toLowerCase();
			for(int i = 0; i < nome.length(); i++)
				switch (nome.charAt(i)){
				
				case 'a':
				case 'e':
				case 'i':
				case 'o': 
				case 'u': qtd++;
			}
			return qtd;		
	}
	
}

	


