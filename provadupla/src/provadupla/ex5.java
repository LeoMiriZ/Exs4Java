package provadupla;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
String pal1, pal2, pal3;

System.out.println("Insira a primeira palavra--> ");
pal1 = teclado.nextLine();

System.out.println("Insira a segunda palavra--> ");
pal2 = teclado.nextLine();

System.out.println("Insira a terceira palavra--> ");
pal3 = teclado.nextLine();

if (pal1.equals("vertebrado") && pal2.equals("ave") && pal3.equals("carnívoro")) {
	System.out.println("águia");
} else if (pal1.equals("vertebrado") && pal2.equals("ave") && pal3.equals("onívoro")) {
	System.out.println("pomba");
} else if (pal1.equals("vertebrado") && pal2.equals("mamífero") && pal3.equals("onívoro")) {
	System.out.println("homem");
} else if (pal1.equals("vertebrado") && pal2.equals("mamífero") && pal3.equals("herbívoro")) {
	System.out.println("vaca");
} else if(pal1.equals("invertebrado") && pal2.equals("inseto") && pal3.equals("hematófago")) {
	System.out.println("pulga");
} else if (pal1.equals("invertebrado") && pal2.equals("inseto") && pal3.equals("herbívoro")) {
	System.out.println("lagarta");
} else if (pal1.equals("invertebrado") && pal2.equals("anelídeo") && pal3.equals("hematófago")) {
	System.out.println("sanguessuga");
} else if (pal1.equals("invertebrado") && pal2.equals("anelídeo") && pal3.equals("onívoro")) {
	System.out.println("minhoca");
}

	}

}
