package classeseobjetos;

public class Circulo {

	final double pi = 3.14;

	double raio = 1;

	double obterArea() {
		return pi * raio * raio;
	}

	double obterPerimetro() {
		return 2 * pi * raio;
	}

}
