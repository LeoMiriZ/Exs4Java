package provadupla;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
double l1, l2, l3;


System.out.println("Insira o primeiro lado--> ");
l1 = teclado.nextDouble();

System.out.println("Insira o segundo lado--> ");
l2 = teclado.nextDouble();

System.out.println("Insira o terceiro lado--> ");
l3 = teclado.nextDouble();

if (l1 > l2 + l3  || l2 > l1 + l3 || l3 > l1 + l2) {
	System.out.println("Isso n�o � um tri�ngulo");
} else if (l1 == l2 && l2 == l3) {
	System.out.println("Equil�tero");
} else if (l1 == l2 || l2 == l3 || l1 == l3) {
	System.out.println("Is�sceles");
} else if (l1 != l2 && l2 != l3) {
	System.out.println("Escaleno");
}

	}

}
