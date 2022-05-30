package modelos;

public class Cliente {

	private String cpf;
	private String nome;

	public String toString() {
		return cpf + " - " + nome;
	}

	public void setCpf(String umCpf) {
		if (umCpf.length() == 11) {
			cpf = umCpf;
		}
		else {
			cpf = "CPF INVÁLIDO";
		}

	}

	public void setNome(String umNome) {
		nome = umNome;
	}

	public String getNome() {
		return nome.toUpperCase();
	}

	public String getCpf() {
		return cpf;
	}
}
