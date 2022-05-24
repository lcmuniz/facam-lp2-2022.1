

package app;


interface TemPerimetro {
	void calcularPerimetro();
}

interface TemArea {
	void calcularArea();
}

class Figura {
	String cor;

}

class Circulo extends Figura implements TemArea, TemPerimetro {
	double raio;
	@Override
	public void calcularArea() {
		System.out.println(raio * raio * 3.14);
	}
	@Override
	public void calcularPerimetro() {
		//asdasd

	}

}

class Poligono extends Figura {
	int numeroLados;
}

class Quadrilatero extends Figura {

}

class Quadrado extends Quadrilatero implements TemArea {
	double lado;
	@Override
	public void calcularArea() {
		System.out.println(lado * lado);
	}
}

class Retangulo extends Quadrilatero implements TemArea  {
	double menor;
	double maior;
	@Override
	public void calcularArea() {
		System.out.println(menor * maior);
	}
}

class Triangulo extends Figura implements TemArea {
	double altura;
	double base;
	@Override
	public void calcularArea() {
		System.out.println(base * altura / 2);
	}
}

public class Programa {

	public static void main(String[] args) {

		Circulo c = new Circulo();
		c.raio = 10;
		c.cor = "azul";

		Quadrado q = new Quadrado();
		q.lado = 10;
		q.cor = "vermelho";

		Retangulo r = new Retangulo();
		r.menor = 10;
		r.maior = 20;
		r.cor = "vermelho";

		Triangulo t = new Triangulo ();
		t.altura = 10;
		t.base = 5;
		t.cor = "roxo";

		Figura[] figuras = {c, q, r, t };

		for (Figura fig : figuras) {
			if (fig instanceof TemArea) {
				TemArea ta = (TemArea) fig;
				ta.calcularArea();
			}
		}
	}

}
