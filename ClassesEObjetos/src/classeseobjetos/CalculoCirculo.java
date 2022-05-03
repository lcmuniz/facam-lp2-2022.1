package classeseobjetos;

import java.util.Scanner;

public class CalculoCirculo {

	public static void main(String[] args) {

		//Circulo[] circulos = new Circulo[2];

		Circulo[] circulos = {
				new Circulo(),
				new Circulo()
		} ;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o raio do círculo: ");
		double raio = scanner.nextDouble();

		//circulos[0] = new Circulo();
		circulos[0].raio = raio;

		System.out.println("A área do círculo é " + circulos[0].obterArea());
		System.out.println("O perímetro do círculo é " + circulos[0].obterPerimetro());

		System.out.print("Digite o raio do círculo: ");
		double raio2 = scanner.nextDouble();

		//circulos[1] = new Circulo();
		circulos[1].raio = raio2;

		System.out.println("A área do círculo é " + circulos[1].obterArea());
		System.out.println("O perímetro do círculo é " + circulos[1].obterPerimetro());


		Circulo c = new Circulo();
		c.raio = 1000;
		System.out.println(c.obterArea());

		scanner.close();


	}

}
