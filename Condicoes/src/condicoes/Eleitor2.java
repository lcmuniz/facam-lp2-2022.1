package condicoes;
import java.util.Scanner;

public class Eleitor2 {

	public static void main(String[] args) {

		Scanner teclado =  new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		
		int idade = teclado.nextInt();
		
		if (idade <= 15) {
			System.out.println("Você ainda não pode votar!");
		}
		else if (idade > 15 && idade < 18) {
			System.out.print("Você tem título de eleitor (S/N)? ");
			String temTitulo = teclado.next();
			if (temTitulo.equals("S")) {
				System.out.println("Você já pode votar!");
			}
			else {
				System.out.println("Você pode votar mas antes tem que tirar seu título de eleitor!");
			}
		}
		else if (idade >= 18) {
			System.out.println("Você já pode votar!");
		}
		
		System.out.println("Tenha um bom dia.");
		
		teclado.close();
		

	}

}
