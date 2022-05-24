package app;



class Terrestre extends Animal {

	void andar() {
		System.out.println(nome + ": estou andando");
	}


}

class Aereo extends Animal {

	void voar() {
		System.out.println(nome + ": estou voando");
	}


}

class Cachorro extends Terrestre  {
	String pedigree;
	final int QUANTIDADE_PATAS = 4;

	@Override
	void som() {
		System.out.println(nome + ": Au! Au!");
	}


}


class Passaro extends Aereo {
	String tipoBico;
	final int QUANTIDADE_PATAS = 2;


}

class Homem extends Terrestre {
	String cpf;

	void falar(String msg) {
		System.out.println(nome + ": " + msg);
	}

}


interface RespiranteAgua {
	void respirarNaAgua();
}

class Animal {
	String nome;

	void som() {
		System.out.println(nome + ": RRRRRRRRR!");
	}

}
class Maritimo  extends Animal implements RespiranteAgua {
	String tipoEscama;
	public void respirarNaAgua() {
		System.out.println("respirando na agua como peixe");
	}
}

class Baleia extends Animal implements RespiranteAgua {
	int quantidadeOleo;
	public void respirarNaAgua() {
		System.out.println("respirando na agua baleia");
	}
}

public class Main {

	public static void main(String[] args) {

		Cachorro lulu = new Cachorro();
		lulu.nome = "Lulu";
		lulu.pedigree = "vira lata";

		Cachorro rex = new Cachorro();
		rex.nome = "Rex";
		rex.pedigree = "pedigree";

		Homem marcelo = new Homem();
		marcelo.nome = "Marcelo";

		Passaro louro = new Passaro();
		louro.nome = "Louro José";

		Baleia moby = new Baleia();
		moby.quantidadeOleo = 1000;
		moby.respirarNaAgua();

		Maritimo bacalhau = new Maritimo();
		bacalhau.tipoEscama = "sadasd";
		bacalhau.respirarNaAgua();


		Animal[] animais = { lulu, louro, rex, marcelo };

		for (Animal animal : animais) {
			animal.som();
			if (animal instanceof Passaro) {
				Passaro p = (Passaro) animal;
				p.voar();
			}
			else if(animal instanceof Homem) {
				Homem h = (Homem) animal;
				h.falar("boa noite");
			}
		}

		Animal[] animaisRespirantes = { moby, bacalhau, lulu };
		for (Animal animal : animaisRespirantes) {
			if (animal instanceof RespiranteAgua) {
				RespiranteAgua b = (RespiranteAgua) animal;
				b.respirarNaAgua();
			}
		}









	}

}
