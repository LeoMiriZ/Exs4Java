import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);

	String nome;
	
	int anns, annig, idade, tt;
	
	System.out.println("Insira seu nome--> ");
	nome = teclado.nextLine();
	
	System.out.println("Insira seu ano de nascimento--> ");
	anns = teclado.nextInt();
	
	System.out.println("Insira o ano de seu ingresso na empresa--> ");
	annig = teclado.nextInt();
	
	idade = 2022 - anns;
	tt = 2022 - annig;
	
	System.out.println("Idade: " + idade + " anos");
	System.out.println("Tempo de Trabalho: " + tt + " anos");
	
	if (idade>=65 || tt>=30 || idade>=60 && tt>=25) {
		System.out.println("Requerer aposentadoria");
	} else {
		System.out.println("Não requerer");
	}
	
	}

}
