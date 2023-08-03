import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
	
	double cf, cc;
	
	System.out.println("Insira o custo de fábrica do veículo-->");
	cf = teclado.nextDouble();
	
	if (cf<12000) {
		cc = cf + (cf * 0.05);
		System.out.println("O custo do veículo para o consumidor é de R$" + cc);
	}
	
	else if (cf>12000 && cf<25000) {
		cc = cf + (cf * 0.1) + (cf * 0.15);
		System.out.println("O custo do veículo para o consumidor é de R$" + cc);

	}
	else if (cf>25000) {
		cc = cf + (cf * 0.15) + (cf * 0.20);
	System.out.println("O custo do veículo para o consumidor é de R$" + cc);

	}
	
	
	}

}
