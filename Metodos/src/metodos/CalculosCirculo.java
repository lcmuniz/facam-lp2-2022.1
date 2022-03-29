package metodos;

import java.util.Scanner;

public class CalculosCirculo {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {


		double raio = -999; 
		
		String opcao; 
		
		do {
			System.out.println();
			System.out.println("*** C�LCULOS PARA O C�RCULO ***");
			System.out.println();
			System.out.println("1. Digite o raio do c�rculo");
			System.out.println("2. Mostra a �rea do c�rculo");
			System.out.println("3. Mostra a circunfer�ncia do c�rculo");
			System.out.println("4. Sair");
			System.out.println();
			System.out.print("Entre com um n�mero de 1 a 4: ");
			opcao = scanner.next();
			
			switch(opcao.charAt(0)) {
				case '1' : 
					raio = opcao1(); 
					break;
				case '2' : 
					opcao2(raio); 
					break;
				case '3' : 
					opcao3(raio); 
					break;
				case '4' : 
					break;
				default : 
					System.out.println("Entre somente com um n�mero entre 1 e 4");
					System.out.println();
			}
		}
		while(opcao.charAt(0) != '4');
		
		scanner.close();
		
	}
	
	// opcao1 pede o raio do c�rculo
	static double opcao1() {
		double meuRaio;
		System.out.print("Digite o raio do c�rculo: ");
		meuRaio = scanner.nextDouble();
		return meuRaio;
	}
	
	// opcao2 calcula e mostra a area do circulo
	static void opcao2(double raio) {
		if(raio == -999) {
			System.out.println("N�o foi entrado um raio");
		}
		else {
			double area; 
			area = 3.1416 * raio * raio; 
			System.out.println("A �rea do c�rculo �: " + area);
		}
	}
	
	// opcao3 calcula e mostra a circunferencia do circulo
	static void opcao3(double raio) {
		if(raio == -999) {
			System.out.println("N�o foi entrado um raio");
		}
		else {
			double circunferencia; 
			circunferencia = 2 * 3.1416 * raio; 
			System.out.println("A circunfer�ncia do c�rculo �: " + circunferencia);
		}
	}
	
}
