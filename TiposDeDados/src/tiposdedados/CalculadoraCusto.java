package tiposdedados;

public class CalculadoraCusto {

	public static void main(String[] args) {

		double preco;
		double taxa;
		
		preco = 500;
		
		System.out.println("Pre�o: " + preco);
		
		taxa = 17.5;
		preco = preco * (1 + taxa / 100);
		
		System.out.println("Taxa: " + taxa);
		System.out.println("Pre�o + taxa: " + preco);
		

	}

}
