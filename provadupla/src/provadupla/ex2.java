package provadupla;

public class ex2 {



package provadupla;

import java.util.Scanner;

public static void main(String[] args) {
	
	Scanner teclado= new Scanner(System.in);
	
	double a, b, c, d;
	
	System.out.print("a--> ");
	a= teclado.nextDouble();
	System.out.print("b--> ");
	b= teclado.nextDouble();
	System.out.print("c--> ");
	c= teclado.nextDouble();
	System.out.print("d--> ");
	d= teclado.nextDouble();
	
	if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && d % 2 == 0) {
	System.out.println("Valores aceitos");
	} else {
			System.out.println("Valores não aceitos");
	}
	
	
	
	
	
	
	
}
	
}
