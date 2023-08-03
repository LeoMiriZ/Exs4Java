import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
	int val1, val2, val3, val4;
	
	System.out.println("Insira o primeiro valor--> ");
	val1 = teclado.nextInt();
	
	System.out.println("Insira o segundo valor--> ");
	val2 = teclado.nextInt();
	
	System.out.println("Insira o terceiro valor--> ");
	val3 = teclado.nextInt();
	
	System.out.println("Insira o quarto valor--> ");
	val4 = teclado.nextInt();
	
	if (val1 == val2 && val2 == val3 && val3 == val4) {
		System.out.println("Valores iguais");
	}
	
	if (val1 > val2 && val2 > val3 && val3 >val4) {
		System.out.println("Ordem decrescente");
	}
	
	else if(val1 < val2 && val2 < val3 && val3 < val4) {
		System.out.println("Ordem crescente");
	} else {
		System.out.println("Não estão ordenados");
	}
	

	}

}
