package condicoes;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		System.out.println("*** Menu Principal ***");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Consulta");
		System.out.println("3 - Relatório");
		System.out.println("0 - Cadastro");
		System.out.println("");
		System.out.print("Escolha uma opção: ");

		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu a opção Cadastro");
			break;
		case 2:
			System.out.println("Você escolheu a opção Consulta");
			break;
		case 3:
			System.out.println("Você escolheu a opção Relatório");
			break;
		case 0:
			System.out.println("Você saiu do programa");
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		teclado.close();
	}

}
