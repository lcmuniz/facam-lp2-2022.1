package maisarrays;

public class VariosArgumentos {

	public static void main(String[] args) {

			double produto = multiplicar(10, 20, 30, 40);

			System.out.println(produto);
	}
	
	public static double multiplicar(double...numeros) {
		
		double produto = 1;
		
		for (int i = 0; i < numeros.length; i++) {
			produto = produto * numeros[i];
		}
		
		for (double numero : numeros) {
			produto = produto * numero;
		}
		
		return produto;
		
	}

	
}
