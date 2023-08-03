package repeticao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);


	int var1, sup;
	int resp;
	
	
	
	do {
	
	System.out.println("Insira um número--> ");
	var1 = teclado.nextInt();
	sup = 0;	
	while (sup<=10) {
		
		System.out.println(var1 + "X" + sup + "=" + var1*sup);
		sup = sup + 1;

	}
	
	System.out.println("\nDigite 1 para nova tabuada ou 0 para finalizar: ");
	resp = teclado.nextInt();
	
	} while (resp == 1);
	
	} 

}
