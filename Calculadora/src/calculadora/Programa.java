package calculadora;

public class Programa {

	public static void main(String[] args) {

		boolean continuar = true;

		Menu menu = new Menu();

		while(continuar) {

			menu.mostrar();
			String opcao = menu.solicitarOpcao();
			System.out.println();

			switch(opcao) {
				case "+":
					// add
					break;
				case "-":
					// sub
					break;
				case "*":
					// mul
					break;
				case "/":
					// div
					break;
				default:
					// sair
					continuar = false;
			}

		}

		System.out.println("Obrigado por usar nossa calculadora.\nAté a próxima!");

	}

}
