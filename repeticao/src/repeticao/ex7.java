package repeticao;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
	double y;
	int num1, cont;
	
	y = 0;
	
	
	cont = 1;
	
	System.out.println("Insira um número inteiro--> ");
	num1 = teclado.nextInt();
	
	while (cont <= num1) {
		
	y = y + cont / Math.sqrt(cont);
	
	
	cont ++;
	
		
	}
	
	System.out.println("y = " + y);
	
	
	
	
	
	
	}

}
