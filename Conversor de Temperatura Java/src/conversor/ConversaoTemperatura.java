package conversor;

import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Temperatura tempEntrada = new Temperatura();
		Temperatura tempConvertida = new Temperatura();
		Conversao conversor = new Conversao();

		System.out.println("Conversor de Temperatura");
		System.out.println("1 - Fahrenheit para Celsius");
		System.out.println("2 - Celsius para Fahrenheit");
		System.out.print("Escolha o tipo de conversão (1 ou 2): ");
		int opcao = teclado.nextInt();

		switch (opcao) {
			case 1:
				System.out.print("Digite a temperatura em Fahrenheit: ");
				tempEntrada.setTemperatura(teclado.nextDouble());
				double celsius = conversor.converterParaCelsius(tempEntrada.getTemperatura());
				tempConvertida.setTemperatura(celsius);
				conversor.exibirResultado(tempConvertida.getTemperatura(), "C");
				break;

			case 2:
				System.out.print("Digite a temperatura em Celsius: ");
				tempEntrada.setTemperatura(teclado.nextDouble());
				double fahrenheit = conversor.converterParaFahrenheit(tempEntrada.getTemperatura());
				tempConvertida.setTemperatura(fahrenheit);
				conversor.exibirResultado(tempConvertida.getTemperatura(), "F");
				break;

			default:
				System.out.println("Opção inválida. Escolha 1 ou 2.");
		}

		teclado.close();
	}
}
