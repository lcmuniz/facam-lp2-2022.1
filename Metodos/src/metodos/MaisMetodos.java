package metodos;

public class MaisMetodos {

	public static void main(String[] args) {

		double q = quadrado(100); 
		System.out.println("Quadrado: " + q);
		
		int m = maior(10, 2);
		System.out.println("Maior: " + m);
		
		int n = maior(10, 2, 100);
		System.out.println("Maior: "+ n);

		boolean p = ehPar(100);
		System.out.println("É par: " + p);

		boolean i = ehImpar(101);
		System.out.println("É ímpar: " + i);

		int x = 100;
		System.out.println("X antes da chamada do método: " + x);
		mudaNumero(x);
		System.out.println("X depois da chamada do método: " + x);
		
	}
	
	static double quadrado(double numero) {
		return numero * numero;
	}
	
	static int maior(int a, int b) {
		if (a >= b) {
			return a;
		}
		else {
			return b;
		}
	}

	static int maior(int a, int b, int c) {
		if (a >= b && a > c) {
			return a;
		}
		else if (b >= a && b > c){
			return b;
		}
		else {
			return c;
		}
	}

	static boolean ehPar(int numero) {
		if (numero % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	static boolean ehImpar(int numero) {
		return !ehPar(numero);
	}
	
	static void mudaNumero(int x) {
		x = 200;
		System.out.println("X dentro do método: " + x);
	}

}
