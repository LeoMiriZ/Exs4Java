package repeticao;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);

	
	
	int var1, cont;
	double fat;
	
	do {
		System.out.println("Insira valor inteiro e positivo--> ");
		var1 = teclado.nextInt();
	
	if(var1<0) {
		System.out.println("Você deve digitar um valor inteiro e positivo!");
	}
	
	} while (var1<0);
	
	
	cont = 1;
	fat = 1;
	
	while (cont <= var1) {
		fat = fat * cont;
		cont = cont + 1;
	}
	
	System.out.println(var1 + "! = " + fat);
	
	
	}

}
