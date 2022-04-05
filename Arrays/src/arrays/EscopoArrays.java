package arrays;

public class EscopoArrays {

	public static void main(String[] args) {

		int[] p = new int[2];
		p[0] = 20;
		p[1] = 30;
		int soma = somar(p);
		
		System.out.println(p[1]);
		System.out.println(soma);

	}
	
	public static int somar(int[] parcelas) {
		parcelas[1] = 100;
		return parcelas[0] + parcelas[1];
	}

}
