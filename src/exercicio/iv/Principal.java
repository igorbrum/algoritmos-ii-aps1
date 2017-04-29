package exercicio.iv;

import com.senac.SimpleJava.Console;

//temperatura.setUnidadeTemperatura(valorUnidade);
//temperatura.setValorTemperatura(readLine.replaceAll("[^0123456789]", ""));

public class Principal {
	
	private Double valorTemperatura = 0.00;
	private Double valorCelcius = 0.00;
	private Double valorFahrenheit = 0.00;
	private char unidadeConversao;
	
	public void run() {
		
		String valor = digitaValor();
		realizaConversao(valor);
		Console.println(mostraResultadoConversao());
	}

	private String mostraResultadoConversao() {
		String texto;
		
		texto = "Valor Inicial: "+valorTemperatura+"\n";
		texto = texto+" "+"Se valor inicial em fahreheit, valor em Celcius e': "+valorCelcius+"\n";
		texto = texto+" "+"Se valor inicial em celcius, valor em Fahreheit e': "+valorFahrenheit+"\n";
		
		return texto;
		
	}

	private void realizaConversao(String valor) {
		
		if (valorComString(valor)) {
			converteComString();
		}
		
		if (valorApenasNumero(valor)) {
			converteApenasNumero();
		}
		
	}

	private void converteApenasNumero() {
		convertToCelcius();
		convertToFahrenheit();
	}

	private void converteComString() {
		if (unidadeConversao == 'c') {
			convertToFahrenheit();
		}
		
		if (unidadeConversao == 'f') {
			convertToCelcius();
		}
		
	}
	
	private Double convertToCelcius(){
		return valorCelcius = (valorTemperatura-32)/1.8;
	}
	
	private Double convertToFahrenheit(){
		return valorFahrenheit = valorTemperatura*1.8+32;
	}

	private String digitaValor() {
		String valor;
		do {
			valor = Console.readLine("Digite um valor: ");
			if (verificaDigitacao(valor)) {
				break;
			} else {
				Console.println("E' preciso digitar um valor valido. Ex.: 12, 45F ou 23C");
			}
		} while (true);
		
		return valor;
	}

	private boolean verificaDigitacao(String valor) {

		if (valorApenasNumero(valor)) {
			valorTemperatura = Double.parseDouble(valor);
			return true;
		}
		
		if (valorComString(valor)) {
			unidadeConversao = valor.toLowerCase().charAt(valor.length()-1);
			valorTemperatura = Double.parseDouble(valor.replaceAll("[^0123456789]", ""));
			return true;
		}
		
		return false;
	}
	
	private boolean valorComString(String valor) {
		char valorUnidade = valor.toLowerCase().charAt(valor.length()-1);
		
		if (valorUnidade == 'c' || valorUnidade == 'f') {
			return true;
		}
		
		return false;
	}

	private boolean valorApenasNumero(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
