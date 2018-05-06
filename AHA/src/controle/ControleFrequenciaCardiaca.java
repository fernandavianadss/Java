package controle;

import java.util.Calendar;
import dominio.FrequenciaCardiaca;

public class ControleFrequenciaCardiaca {
	private FrequenciaCardiaca fc = 
			new FrequenciaCardiaca(null, null, 0, 0, 0);
	
	public void inserirFrequencia(String nome, String sobrenome, 
			int dia, int mes, int ano) {
		fc.setNome(nome);
		fc.setSobrenome(sobrenome);
		fc.setDia(dia);
		fc.setMes(mes);
		fc.setAno(ano);
	}
	
	public FrequenciaCardiaca consultarFrequencia() {
		return fc;
	}
	
	public int calcularIdade() {
		Calendar cal = Calendar.getInstance();
		int diaA = cal.get(Calendar.DAY_OF_MONTH);
		int mesA = cal.get(Calendar.MONTH) + 1; 
		int anoA = cal.get(Calendar.YEAR);
		
		int idade = anoA - fc.getAno();
		
		if ((mesA < fc.getMes()) || 
				((mesA == fc.getMes()) && (diaA < fc.getDia())))
			idade--;
			
		return idade;
	}
	
	public int calcularFCM() {
		return 220 - calcularIdade();
	}
	
	public int calcularFCA() {
		return (calcularFCM() * 85 / 100) - 
			   (calcularFCM() * 50 / 100);
	}
}