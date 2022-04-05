package arrays;

import java.util.Scanner;

public class LerTemperaturasComArray2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Quantas temperaturas vão ser lidas? ");
		int tamanho = teclado.nextInt();
		
		if (tamanho <= 0) {
			System.out.print("O número de temperaturas deve ser maior que zero");
			System.exit(1);
		}

		double[] temperaturas = new double[tamanho];
		
		for (int i = 1; i <= tamanho; i++) {
			System.out.print("Qual a temperatura do dia " + i + "? ");
			temperaturas[i-1] = teclado.nextDouble();
		}
		
		double media = calcularMedia(temperaturas);
		
		System.out.println("A média da temperatura da semana é " + media);
		
		teclado.close();
	}
	
	// calcula a media das temperaturas
	public static double calcularMedia(double[] temps) {
		double soma = 0;
		
		for (int i = 1; i <= temps.length; i++) {
			soma = soma + temps[i-1];
		}
		
		double media = soma / temps.length;
		
		return media;

		
	}
	

}
