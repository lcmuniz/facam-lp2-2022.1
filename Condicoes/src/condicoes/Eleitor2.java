package condicoes;
import java.util.Scanner;

public class Eleitor2 {

	public static void main(String[] args) {

		Scanner teclado =  new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		
		int idade = teclado.nextInt();
		
		if (idade <= 15) {
			System.out.println("Voc� ainda n�o pode votar!");
		}
		else if (idade > 15 && idade < 18) {
			System.out.print("Voc� tem t�tulo de eleitor (S/N)? ");
			String temTitulo = teclado.next();
			if (temTitulo.equals("S")) {
				System.out.println("Voc� j� pode votar!");
			}
			else {
				System.out.println("Voc� pode votar mas antes tem que tirar seu t�tulo de eleitor!");
			}
		}
		else if (idade >= 18) {
			System.out.println("Voc� j� pode votar!");
		}
		
		System.out.println("Tenha um bom dia.");
		
		teclado.close();
		

	}

}
