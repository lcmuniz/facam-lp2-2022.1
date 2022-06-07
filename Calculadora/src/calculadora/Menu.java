package calculadora;

import java.util.List;
import java.util.Scanner;

public class Menu {

	Scanner scanner = new Scanner(System.in);

	public void mostrar() {
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

		System.out.print("Opção: ");

		while (true) {
			String opcao = scanner.nextLine();
			if (opcoesValidas.contains(opcao)) {
				return opcao;
			}
			else {
				System.out.print("Opção inválida. Digite novamente: ");
			}
		}

	}

}
