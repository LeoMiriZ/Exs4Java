import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		double m, i, c;
		int t;

		System.out.println("Insira seu valor inicial aplicado--> ");
		c = teclado.nextDouble();

		System.out.println("Insira a taxa de juros aplicada (em %)-->  ");
		i = teclado.nextDouble();

		System.out.println("Insira os meses de aplicação--> ");
		t = teclado.nextInt();

		i = i/100;

		m = c * Math.pow((1+i), t);

		System.out.println("O saldo após a aplicação do juros é de R$" + m);
	
	
	}

}
