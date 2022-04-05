package arrays;

import java.util.Scanner;

public class Raizes2Grau {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);

		System.out.println("Cálculo de raízes de uma equação do segundo grau");
		System.out.println("Entre com os coeficientes:");

		System.out.print("A:  ");
		double a = teclado.nextDouble();

		System.out.print("B:  ");
		double b = teclado.nextDouble();

		System.out.print("C:  ");
		double c = teclado.nextDouble();

		double[] raizes = calcularRaizes(a, b, c);
		
		if (raizes == null) {
			System.out.println("Não existem raizes");
		}
		else {
			System.out.println("X1 = " + raizes[0]);
			if (raizes.length > 1) {
				System.out.println("X2 = " + raizes[0]);
			}
		}
		
		teclado.close();
	}
	
	public static double[] calcularRaizes(double a, double b, double c) {
		
		double delta = (b * b) - (4 * a * c);

		if (delta < 0) {
			return null;
		}
		else if (delta == 0) {
			double[] raizes = new double[1];
			raizes[0] = (-b) / (2 * a);
			return raizes;
		}
		else {
			double[] raizes = new double[2];
			raizes[0] = (-b + Math.sqrt(delta) ) / (2 * a);
			raizes[1] = (-b - Math.sqrt(delta) ) / (2 * a);
			return raizes;
		}
		
	}

}
