package maisarrays;

public class ArgumentosLinhaDeComando {

	public static void main(String[] args) {
		
		int[] numeros = converter(args);
		int soma = somar(numeros);
		System.out.println(soma);

	}
	
	public static int[] converter(String[] array) {
		
		int[] numeros = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			numeros[i] = Integer.parseInt(array[i]);
		}
		
		return numeros;
	}
	
	public static int somar(int[] numeros) {
		int total = 0;
		
		//for (int i = 0; i < numeros.length; i++) {
		//	total = total + numeros[i];
		//}
		
		for (int n : numeros) {
			total = total + n;
		}
		
		return total;
	}

}
