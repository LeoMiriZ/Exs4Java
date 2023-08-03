package repeticao;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);

	
	int num;
	
	System.out.println("Insira um número inteiro e positivo--> ");
	num = teclado.nextInt();
	
	if (num<= 0) {
		System.out.println("O valor deve ser positivo.");
	
	} else {
		
		for (int contador = -num; contador<=num; contador++)
			if(contador != 0 && num % contador == 0) {
				System.out.print(contador + " ");
			}
	}
	
	
	
	
	
	
	}

}
