package string2a;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String a, aux = "";

		System.out.println("Insira uma palavra--> ");
		a = teclado.nextLine();

		for (int i = 0; i <= a.length() - 1; i++) {

			aux = aux + a.charAt(i);
			System.out.println(aux);

		}

	}

}
