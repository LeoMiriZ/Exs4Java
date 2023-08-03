package provadupla;

public class ex6 {

}
package provadupla;

import java.util.Scanner;

public class ex06 {
public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	double renda, imposto, imposto2;
	
System.out.print("Insira a renda: R$");
renda= teclado.nextDouble();

 if(renda >= 0 && renda <= 2000) {
	 System.out.println("Isento");
 } else if (renda > 2000 && renda <= 3000){
	 imposto2 = 0.08 * ((renda - 2000) % 1000);
	 System.out.println("R$"  + String.format("%.2f", imposto2));
 } else if (renda > 3000 && renda <= 4500) {
	 
	 imposto2 = 1000 * 0.08 + 0.18 * ((renda - 2000) % 1000) + 30;
	 System.out.println("R$"  + String.format("%.2f", imposto2));

 } else if (renda > 4500) {
	 imposto2 = 0.18 * 1000 + 0.28 * ((renda - 2000) % 1000) + 30;
	 System.out.println("R$"  + String.format("%.2f", imposto2));

	 
 }
 
  
	}
}
