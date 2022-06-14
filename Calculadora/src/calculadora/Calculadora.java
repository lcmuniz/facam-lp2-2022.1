package calculadora;

import java.util.ArrayList;

public class Calculadora {

	public double calcular(String opcao, ArrayList<Double> numeros) {

		double resultado;
		switch (opcao) {
			case "+":
				resultado = somar(numeros);
				return resultado;
			case "-":
				resultado = subtrair(numeros);
				return resultado;
			case "*":
				resultado = multiplicar(numeros);
				return resultado;
			case "/":
				resultado = dividir(numeros);
				return resultado;
			default:
				break;
		}
		return 0;
	}

	private double somar(ArrayList<Double> numeros) {

		double prod = 0;

		for(double n : numeros) {
			prod = prod + n;
		}
		return prod;


	}

	private double subtrair(ArrayList<Double> numeros) {

		double res = numeros.get(0);

		for (int i = 1; i < numeros.size(); i++) {
			res = res - numeros.get(i);
		}

		return res;


	}

	private double multiplicar(ArrayList<Double> numeros) {

		double soma = 1;

		for(double n : numeros) {
			soma = soma * n;
		}
		return soma;


	}

	private double dividir(ArrayList<Double> numeros) {

		double res = numeros.get(0);

		for (int i = 1; i < numeros.size(); i++) {
			res = res / numeros.get(i);
		}

		return res;


	}

}
