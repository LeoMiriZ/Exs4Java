package string2a;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String a, b = "";

		System.out.println("Insira uma sequência de DNA--> ");
		a = teclado.next();

		a = a.toUpperCase();

		for (int i = 0; i < a.length(); i++) {

			switch (a.charAt(i)) {

			case 'A':
				b += 'T';
				break;
			case 'T':
				b += 'A';
				break;
			case 'C':
				b += 'G';
				break;
			case 'G':
				b += 'C';
				break;

			}

		}
		
		System.out.println("Cadeia complementar--> " + b);

	}

}
