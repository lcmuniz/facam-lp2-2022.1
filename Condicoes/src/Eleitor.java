import java.util.Scanner;

public class Eleitor {

	public static void main(String[] args) {

		Scanner teclado =  new Scanner(System.in);
		
		System.out.print("Qual a sua idade?");
		
		int idade = teclado.nextInt();
		
		if (idade > 15) {
			System.out.println("Voc� j� pode votar!");
		}
		else {
			int anos = 16 - idade;
			System.out.println("Voc� poder� votar daqui a " + anos + ".");
		}
		
		System.out.println("Tenha um bom dia.");
		
		teclado.close();
		

	}

}
