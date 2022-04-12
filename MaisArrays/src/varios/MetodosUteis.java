package varios;

public class MetodosUteis {
	
	
	
	
	
	public static void main(String[] args) {


		String[] nomes = {
				"Augusto",
				"Bianca",
				"Carla",
				"Márcia",
				"Fernanda",
				"João", 
				"Luiz", 
				"Maria",
				"Pedro",
				"Renato"
			};
		
		String nome = "Maria";
		int indiceNome = buscarIndice(nome, nomes);
		
		int posicao = 0;
		String elemento = buscarElemento(posicao, nomes);

		String pessoa = "Pedro";
		boolean existe = contem(pessoa, nomes);
		
		if (existe) {
			System.out.print("Pedro está no array");
		}
		else {
			System.out.print("Pedro não está no array");
		}

		System.out.println("O nome " + nome + " está na posição " + indiceNome);
		
		if (elemento != null) {
			System.out.println("O nome na posição " + posicao + " é " + elemento);
		}
		else {
			System.out.println("Não existe nome na posicação  " + posicao);
		}

		
	}
	
	public static boolean contem(String nome, String[] nomes) {
		int posicao = buscarIndice(nome, nomes);
		if (posicao >= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int buscarIndice(String nome, String[] nomes) {

		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(nome)) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static String buscarElemento(int indice, String[] nomes) {

		if (indice >= 0 && indice < nomes.length) {
			return nomes[indice];
		}
		return null;
	}

	
}
