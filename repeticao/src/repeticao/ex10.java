package repeticao;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner teclado = new Scanner (System.in);
		
		
		
double preco, tot;
int quant,cont, pag;

cont = 1;

tot = 0;

System.out.println("Insira a quantidade de produtos comprados--> ");
quant = teclado.nextInt();

System.out.println("Insira o preço do produto--> ");
preco = teclado.nextDouble();

System.out.println("Parcelado em duas vezes (1) ou à vista (2)--> ");
pag = teclado.nextInt();

	
while (cont<=quant && quant>0) {

if (pag == 1) {
	tot = quant * preco * 1.155;
} else {
	tot = quant * preco * 0.9;
}

cont++;
	
	}

System.out.println("Valor total--> " + tot + String.format("%.2f", tot));

	
	
	}
}
