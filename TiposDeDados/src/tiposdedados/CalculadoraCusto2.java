package tiposdedados;

import java.util.Scanner;

public class CalculadoraCusto2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double preco;
		double taxa;
		
		System.out.println("*** Calcualdora de Custos ***");
		
		System.out.print("Digite o pre�o inicial: ");
		preco =  teclado.nextDouble();
		
		System.out.print("Digite a taxa: ");
		taxa =  teclado.nextDouble();
		
		preco = preco * (1 + taxa / 100);
		
		System.out.println("Pre�o + taxa: " + preco);
		
		teclado.close();
		

	}

}
