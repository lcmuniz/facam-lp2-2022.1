package condicoes;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		System.out.println("*** Menu Principal ***");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Consulta");
		System.out.println("3 - Relat�rio");
		System.out.println("0 - Cadastro");
		System.out.println("");
		System.out.print("Escolha uma op��o: ");

		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Voc� escolheu a op��o Cadastro");
			break;
		case 2:
			System.out.println("Voc� escolheu a op��o Consulta");
			break;
		case 3:
			System.out.println("Voc� escolheu a op��o Relat�rio");
			break;
		case 0:
			System.out.println("Voc� saiu do programa");
			break;
		default:
			System.out.println("Op��o inv�lida!");
			break;
		}
		
		teclado.close();
	}

}
