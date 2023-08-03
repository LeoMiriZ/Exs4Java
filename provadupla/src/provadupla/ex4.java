package provadupla;

public class ex4 {

}

package provadupla;

import java.util.Scanner;

public class ex04 {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	int valor, n1, n2, n3, n4;
	
	System.out.print("Insira um valor--> ");
	valor= teclado.nextInt();
	
	n1= valor / 1000;
	n2= valor / 100 - (n1 * 10);
	n3= valor / 10  - (n1 * 100 + n2 * 10);
	n4= valor % 10;
	
	if (valor < 0 || n1 != n4 || n2 != n3) { 
		System.out.println("Valor inválido");
} 
else if (n1 == n4 && n2 == n3) {
	System.out.println("O número " + n1 + n2 + n3 + n4 + " é políndromo do " + valor);
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	}
}
