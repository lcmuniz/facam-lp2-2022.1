package classeseobjetos;

import java.util.Scanner;

public class ProgramaBanco {

	public static void main(String[] args) {

		Cliente joao = new Cliente("47272377233", "João Silva");


		Cliente maria = new Cliente("42348234234", "Maria Sousa");

		ContaCorrente ccJoao = new ContaCorrente();
		ccJoao.agencia = "1234";
		ccJoao.numero = "99999-9";
		ccJoao.saldo = 0;
		ccJoao.cliente = joao;

		ContaCorrente ccMaria =
				 new ContaCorrente("646456546", "2132", 2000, maria);

		ccJoao.depositar(1000);

		System.out.println("ANTES: " + ccJoao.saldo);

		boolean ok = ccJoao.sacar(1200);

		if (ok == true) {
			System.out.println("Saque efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}

		System.out.println("DEPOIS: " + ccJoao.saldo);

	}

}
