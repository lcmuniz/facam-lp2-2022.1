package app;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.Cliente;

public class Programa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		Cliente[] clientes = new Cliente[1000];

		ArrayList<Cliente> clientes = new ArrayList<>();


		System.out.println("Digite os clientes. CPF 0 para terminar.");
		System.out.println();

		int indice = 0;

		while(true) {
			System.out.print("CPF: ");
			String cpf = scanner.nextLine();

			if (cpf.equals("0")) {
				break;
			}

			System.out.print("Nome: ");
			String nome = scanner.nextLine();

			Cliente c = new Cliente();
			c.setCpf(cpf);
			c.setNome(nome);

			// clientes[indice] = c;
			// indice++;

			clientes.add(c);

		}

		for (Cliente cliente : clientes) {
			if (cliente != null) {
				System.out.println(cliente);
				//System.out.println(cliente.getCpf() + " - " + cliente.getNome());
			}
		}



		System.out.print("Fim do programa");
		scanner.close();


	}

}
