package string2a;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Scanner teclado = new Scanner (System.in);
	
	String a, aux = "";
	
	System.out.println("Insira uma palavra--> ");
	a = teclado.next();
	
	for(int i = a.length() - 1; i >= 0; i--) {
		
		aux += a.charAt(i);
		
	}
	
	
	if (a.equalsIgnoreCase(aux)) {
		
		System.out.println("� um pal�ndromo!");
	} else {
		
		System.out.println("N�o � um pal�ndromo!");
	}
	
		}

}
