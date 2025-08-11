package conversor;

import java.text.DecimalFormat;

public class Conversao {
	private DecimalFormat formatador = new DecimalFormat("#0.0");

	public void exibirResultado(double resultado, String escalaDestino) {
		System.out.println("Resultado da Conversão: " + formatador.format(resultado) + " °" + escalaDestino);
	}

	public double converterParaCelsius(double f) {
		return (5 * (f - 32)) / 9;
	}

	public double converterParaFahrenheit(double c) {
		return (c * 9 / 5) + 32;
	}
}

