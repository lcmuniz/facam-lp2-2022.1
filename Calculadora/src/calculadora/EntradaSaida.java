package calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaSaida {

	Scanner scanner = new Scanner(System.in);

	public void mostrarMenu() {
		System.out.println("Calculadora Bem Simples!");
		System.out.println("========================");
		System.out.println("+ - Somar");
		System.out.println("- - Subtrair");
		System.out.println("* - Multiplicar");
		System.out.println("/ - Dividir");
		System.out.println("s - Sair");
		System.out.println("========================");
	}

	public String solicitarOpcao() {

		List<String> opcoesValidas = List.of("+", "-", "*", "/", "s");

		System.out.print("Op��o: ");

		while (true) {
			String opcao = scanner.nextLine();
			if (opcoesValidas.contains(opcao)) {
				return opcao;
			}
			else {
				System.out.print("Op��o inv�lida. Digite novamente: ");
			}
		}

	}

	public ArrayList<Double> obterNumerosUnicaLinha() {


		ArrayList<Double> numeros = new ArrayList<Double>();

		System.out.println("Digite os n�meros separados por espa�o: ");
		System.out.print("> ");
		String str = scanner.nextLine();

		String[] opcoes = str.split(" ");

		for (int i = 0; i < opcoes.length; i++) {
			double num = Double.parseDouble(opcoes[i]);
			numeros.add(num);

		}
		return numeros;

	}


	public ArrayList<Double> obterNumerosSeparadamente() {


		ArrayList<Double> numeros = new ArrayList<Double>();

		System.out.println("Digite os n�meros: ");
		while(true) {
			System.out.print("> ");
			String str = scanner.nextLine();
			if (str.equals("")) {
				return numeros;
			}

			try {
				double num = Double.parseDouble(str);
				numeros.add(num);
			}
			catch(Exception e) {
				continue;
			}

		}

	}

	public void mostrarResultado(String opcao, double resultado) {

		String operacao = "";

		if (opcao.equals("+")) {
			operacao = "soma";
		}
		else if (opcao.equals("-")) {
			operacao = "subtra��o";
		}
		else if (opcao.equals("*")) {
			operacao = "multiplica��o";
		}
		else if (opcao.equals("/")) {
			operacao = "divis�o";
		}
		else {
			operacao = "inv�lida";
		}

		System.out.println("O resultado da " + operacao + " � " + resultado + ".");
		System.out.println();
	}

}










