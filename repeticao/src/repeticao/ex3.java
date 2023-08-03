package repeticao;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
	int var1, maior, cont;
	
	maior = 0;
	
	cont = 1;
	
	while (cont<=5) {
		System.out.println("Insira um número--> ");
		var1 = teclado.nextInt();
	
	if (var1>maior || cont == 1) {
		maior = var1;
	} 
	cont = cont + 1;
	
	}
	
	System.out.println("maior = " + maior);
	
	
		}

}
