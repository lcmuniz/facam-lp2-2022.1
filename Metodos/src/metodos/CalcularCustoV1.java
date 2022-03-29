package metodos;

import java.util.Scanner;

public class CalcularCustoV1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double preco, taxa;
		
		System.out.println("*** Product Price Check ***");
		
		System.out.print("Entre com o preco inicial: ");
		preco = scanner.nextDouble();
		
		System.out.print("Entre com a taxa: ");
		taxa = scanner.nextDouble();
		
		preco = preco * (1 + taxa / 100);
		
		System.out.println("Custo após a taxa = " + preco);

		scanner.close();
	}

}
