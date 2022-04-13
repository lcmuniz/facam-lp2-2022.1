package metodos;

import java.util.Scanner;

public class CalcularCustoV2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double preco, taxa;

		System.out.println("*** Product Price Check ***");

		System.out.print("Entre com o preco inicial: ");
		preco = scanner.nextDouble();

		System.out.print("Entre com a taxa: ");
		taxa = scanner.nextDouble();

		preco = adicionarTaxa(preco, taxa);

		System.out.println("Custo após a taxa = " + preco);

		scanner.close();
	}

	// método para calcular o preco adicionado de uma taxa
	// entrada: preco e taxa
	// retorno novo preco mais a taxa
	static double adicionarTaxa(double preco, double taxa) {
		return preco * (1 + taxa / 100);
	}

}
