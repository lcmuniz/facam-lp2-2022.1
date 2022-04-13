package tiposdedados;

public class CalculadoraCusto {

	public static void main(String[] args) {

		double preco;  // define uma variavel para conter números reais (com decimal)
		double taxa;

		preco = 500;  // atribui 500 à variável preco

		System.out.println("Preço: " + preco);

		taxa = 17.5;
		preco = preco * (1 + taxa / 100);  // calcula o novo preco mais a taxa

		System.out.println("Taxa: " + taxa);
		System.out.println("Preço + taxa: " + preco);


	}

}
