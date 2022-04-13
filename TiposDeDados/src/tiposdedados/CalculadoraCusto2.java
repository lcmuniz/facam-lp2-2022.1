package tiposdedados;

import java.util.Scanner;

public class CalculadoraCusto2 {

	public static void main(String[] args) {

		// define um objeto que representa o teclado do computador
		Scanner teclado = new Scanner(System.in);

		double preco;
		double taxa;

		System.out.println("*** Calcualdora de Custos ***");

		System.out.print("Digite o preço inicial: ");
		// lê um número do teclado e armazena na variável preco
		preco =  teclado.nextDouble();

		System.out.print("Digite a taxa: ");
		// lê um número do teclado e armazena na variável taxa
		taxa =  teclado.nextDouble();

		preco = preco * (1 + taxa / 100);

		System.out.println("Preço + taxa: " + preco);

		// fecha o teclado
		teclado.close();


	}

}
