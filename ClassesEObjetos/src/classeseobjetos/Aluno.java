package classeseobjetos;

import java.time.LocalDate;

public class Aluno {

	String matricula;
	String nome;
	String cpf;
	LocalDate dataDeNascimento;

	void mostrarNome() {
		System.out.println(nome);
	}

	int obterIdade() {
		int anoAtual = LocalDate.now().getYear();
		return anoAtual - dataDeNascimento.getYear();
	}

	void mostrar() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Idade: " + obterIdade());
	}


}