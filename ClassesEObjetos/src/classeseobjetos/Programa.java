package classeseobjetos;

import java.time.LocalDate;

public class Programa {

	public static void main(String[] args) {

		Departamento dep1 = new Departamento();
		dep1.nome = "Matemática";
		dep1.sigla = "MAT";

		dep1.mostrar();

		Departamento dep2 = new Departamento();
		dep2.nome = "Química";
		dep2.sigla = "QUI";

		Aluno joao = new Aluno();
		joao.cpf = "893456789-34";
		joao.matricula =  "4734";
		joao.nome = "João Souza";
		joao.dataDeNascimento = LocalDate.of(1990, 5, 12);


		Aluno maria = new Aluno();
		maria.cpf = "445667879-34";
		maria.matricula =  "4724";
		maria.nome = "Maria Silva";
		maria.dataDeNascimento = LocalDate.of(2010, 1, 1);


		System.out.println("Aluno 1");
		joao.mostrar();


		System.out.println("Aluno 2");
		maria.mostrar();

	}

}
