package arrays;

import java.util.Scanner;

public class LerTemperaturasComArray {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Quantas temperaturas vão ser lidas? ");
		int tamanho = teclado.nextInt();
		
		if (tamanho <= 0) {
			System.out.print("O número de temperaturas deve ser maior que zero");
			System.exit(1);
		}

		double soma = 0;
		
		double[] temperaturas = new double[tamanho];
		
		for (int i = 1; i <= tamanho; i++) {
			System.out.print("Qual a temperatura do dia " + i + "? ");
			temperaturas[i-1] = teclado.nextDouble();
			soma = soma + temperaturas[i-1];
		}
		
		double media = soma / tamanho;
		
		System.out.println("A média da temperatura da semana é " + media);
		
		teclado.close();
	}
	

}
