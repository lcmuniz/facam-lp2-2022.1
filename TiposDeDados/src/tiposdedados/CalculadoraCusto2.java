package tiposdedados;

import java.util.Scanner;

public class CalculadoraCusto2 {

	public static void main(String[] args) {

		// define um objeto que representa o teclado do computador
		Scanner teclado = new Scanner(System.in);

		double preco;
		double taxa;

		System.out.println("*** Calcualdora de Custos ***");

		System.out.print("Digite o pre�o inicial: ");
		// l� um n�mero do teclado e armazena na vari�vel preco
		preco =  teclado.nextDouble();

		System.out.print("Digite a taxa: ");
		// l� um n�mero do teclado e armazena na vari�vel taxa
		taxa =  teclado.nextDouble();

		preco = preco * (1 + taxa / 100);

		System.out.println("Pre�o + taxa: " + preco);

		// fecha o teclado
		teclado.close();


	}

}
