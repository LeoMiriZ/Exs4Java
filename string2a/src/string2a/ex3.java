package string2a;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
	String [] mes = {"janeiro", "fevereiro", "março", "abril", "maio", "junho","julho", "agosto", "setembro","outubro", "novembro",
	"dezembro"};
	
	
	String data;
	
	System.out.println("Insira uma data de nascimento (dd/mm/aaaa)-->  ");
	data = teclado.next();
	
	String[] data_aux = data.split("/");
	
	int numero = Integer.parseInt(data_aux [1]);
	
	
	System.out.println("\nVocê nasceu em " + data_aux[0] + " de " + mes[numero - 1] + " de " + data_aux [2] + ".");
	
	
	}

}
