package calculadora;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {

		boolean continuar = true;

		EntradaSaida entradaSaida = new EntradaSaida();
		Calculadora calc = new Calculadora();

		while(continuar) {

			entradaSaida.mostrarMenu();
			String operacao = entradaSaida.solicitarOpcao();
			System.out.println();

			switch(operacao) {
				case "+":
				case "-":
				case "*":
				case "/":
					ArrayList<Double> numeros = entradaSaida.obterNumerosSeparadamente();
					double resultado = calc.calcular(operacao, numeros);
					entradaSaida.mostrarResultado(operacao, resultado);
					break;
				default:
					// sair
					continuar = false;
			}

		}

		System.out.println("Obrigado por usar nossa calculadora.\nAté a próxima!");

	}

}
