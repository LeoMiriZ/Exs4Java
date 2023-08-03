import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
	int A, B, C, branco, total;
	
	
	System.out.println("Votos na chapa A--> ");
	A = teclado.nextInt();
	
	System.out.println("Votos na chapa B--> ");
	B = teclado.nextInt();
	
	System.out.println("Votos na chapa C--> ");
	C = teclado.nextInt();
	
	System.out.println("Votos em branco--> ");
	branco = teclado.nextInt();
	
	total = A + B + C + branco;
	
	System.out.println("A quantidade de alunos que votou foi: " + total);
	
	if (A>B && A>C) {
		System.out.println("Chapa Vencedora: A");
	}
	
	if (B>A && B>C) {
		System.out.println("Chapa Vencedora: B");
	}
	
	if (C>A && C>B) {
		System.out.println("Chapa Vencedora: C ");
	}
	
	else if (A<B && A<C) {
		System.out.println("Chapa Perdedora: A");
	}
	else if (B<A && B<C) {
		System.out.println("Chapa Perdedora: B");
	}
	else if (C<B && C<A) {
		System.out.println("Chapa Perdedora: C");
	}

	
}

}
