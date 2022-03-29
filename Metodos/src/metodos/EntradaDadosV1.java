package metodos;

import java.util.Scanner;

public class EntradaDadosV1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int ano, mes, dia;
		
		// solicita o ano de nascimento
		System.out.println("Entre com o ano do seu nascimento.");
		
		// mostra uma mensagem confidencial
		System.out.println("Todas as informações fornecidas são confidenciais.");
		System.out.println("Nenhuma informação pessoal será compartilhada com terceiros.");
		
		// obtem o ano do usuario
		System.out.print("> ");
		ano = scanner.nextInt();
		
		// solicita o mes de nascimento
		System.out.println("Entre com o mês do seu nascimento (1 a 12).");
		
		// mostra uma mensagem confidencial
		System.out.println("Todas as informações fornecidas são confidenciais.");
		System.out.println("Nenhuma informação pessoal será compartilhada com terceiros.");

		// obtem o mes do usuario
		System.out.print("> ");
		mes = scanner.nextInt();
		
		// solicita o dia do nascimento
		System.out.println("Entre com o dia do seu nascimento (1 a 31).");
		
		// mostra uma mensagem confidencial
		System.out.println("Todas as informações fornecidas são confidenciais.");
		System.out.println("Nenhuma informação pessoal será compartilhada com terceiros.");

		// obtem o dia do usuario
		System.out.print("> ");
		dia = scanner.nextInt();
		
		// o programa continua...
		System.out.println(dia + "/" + mes + "/" + ano);
		
		// mensagem de agradecimento ao final do programa
		System.out.println("Obrigado por participar!");
		
		scanner.close();

	}

}
