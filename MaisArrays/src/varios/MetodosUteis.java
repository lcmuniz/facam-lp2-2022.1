package varios;

public class MetodosUteis {
	
	
	
	
	
	public static void main(String[] args) {


		String[] nomes = {
				"Augusto",
				"Bianca",
				"Carla",
				"M�rcia",
				"Fernanda",
				"Jo�o", 
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
			System.out.print("Pedro est� no array");
		}
		else {
			System.out.print("Pedro n�o est� no array");
		}

		System.out.println("O nome " + nome + " est� na posi��o " + indiceNome);
		
		if (elemento != null) {
			System.out.println("O nome na posi��o " + posicao + " � " + elemento);
		}
		else {
			System.out.println("N�o existe nome na posica��o  " + posicao);
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
