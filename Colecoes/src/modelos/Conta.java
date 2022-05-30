package modelos;

public class Conta {

	private int numero;
	private Cliente titular;
	private double saldo;

	public String toString() {
		return numero + " - " + titular + " (" + saldo + ")";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
