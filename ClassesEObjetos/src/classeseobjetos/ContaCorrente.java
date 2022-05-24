package classeseobjetos;

public class ContaCorrente {

	String agencia;
	String numero;
	double saldo;
	Cliente cliente;

	public ContaCorrente() {

	}

	public ContaCorrente(String ag, String nu, double sal, Cliente cli) {
		agencia = ag;
		numero = nu;
		saldo = sal;
		cliente= cli;
	}

	public boolean sacar(double valor) {
		if (saldo - valor >= 0) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}


}
