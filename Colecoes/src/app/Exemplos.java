package app;

import java.util.ArrayList;

import modelos.Cliente;
import modelos.Conta;

public class Exemplos {

	public static void main(String[] args) {

		Cliente joao = new Cliente();
		joao.setCpf("233234234324234");
		joao.setNome("João");

		Conta conta = new Conta();
		conta.setNumero(234234);
		conta.setSaldo(10);
		conta.setTitular(joao);

		System.out.println(conta);

		ArrayList<String> estados =  new ArrayList<>();
		estados.add("MA");
		estados.add("SP");
		estados.add("GO");
		estados.add("SC");
		estados.add("PI");

		ArrayList<String> estados2 =  new ArrayList<>();
		estados.add("RJ");
		estados.add("CE");

		estados.remove("PI");

		boolean contemSC = estados.contains("AM");
		if (estados.contains("MA")) {
			System.out.println("LEGAL!!!");
		}

			System.out.println(contemSC);

			System.out.println(estados.get(1));

			System.out.println(estados.size());

		estados.addAll(estados2);

		estados.clear();

		System.out.println(estados.size());

		for(String uf : estados) {
			System.out.println(uf.toLowerCase());
		}

	}

}
