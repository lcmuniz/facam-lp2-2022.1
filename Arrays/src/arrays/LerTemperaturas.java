package arrays;

import java.util.Scanner;

public class LerTemperaturas {

	public static void main(String[] args) {

		double temperatura1, temperatura2, temperatura3, 
			temperatura4, temperatura5, temperatura6, temperatura7;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual a temperatura do dia 1? ");
		temperatura1 = teclado.nextDouble();

		System.out.print("Qual a temperatura do dia 2? ");
		temperatura2 = teclado.nextDouble();

		System.out.print("Qual a temperatura do dia 3? ");
		temperatura3 = teclado.nextDouble();

		System.out.print("Qual a temperatura do dia 4? ");
		temperatura4 = teclado.nextDouble();

		System.out.print("Qual a temperatura do dia 5? ");
		temperatura5 = teclado.nextDouble();

		System.out.print("Qual a temperatura do dia 6? ");
		temperatura6 = teclado.nextDouble();

		System.out.print("Qual a temperatura do dia 7? ");
		temperatura7 = teclado.nextDouble();
		
		double media = (temperatura1 + temperatura2 + temperatura3 + 
				temperatura4 + temperatura5 + temperatura6 + temperatura7) / 7;
		
		System.out.println("A média da temperatura da semana é " + media);
		
		teclado.close();
	}

}
