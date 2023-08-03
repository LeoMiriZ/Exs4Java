package Ex1;

import java.util.Stack;

import javax.swing.JOptionPane;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Cantores> p1 = new Stack<>();
		Stack<Cantores> p2 = new Stack<>();

		p1.push(new Cantores("Usher"));
		p1.push(new Cantores("Adele"));
		p1.push(new Cantores("Ne-Yo"));

		p2.push(new Cantores("Usher"));
		p2.push(new Cantores("Adele"));
		p2.push(new Cantores("Ne-Yo"));

		JOptionPane.showMessageDialog(null, "P1\n" + p1);
		JOptionPane.showMessageDialog(null, "P2\n" + p2);

		JOptionPane.showMessageDialog(null, verificar(p1, p2));

	}

	public static boolean verificar(Stack<Cantores> p1, Stack<Cantores> p2) {

		Stack<Cantores> aux1 = new Stack<>();
		Stack<Cantores> aux2 = new Stack<>();

		Cantores a1, a2, a3, a4, a5, a6;

		while (!p1.isEmpty() && !p2.isEmpty()) {

			aux1.push(p1.pop());
			aux2.push(p2.pop());

		}

		a1 = aux1.peek();
		aux1.pop();
		a2 = aux1.peek();
		aux1.pop();
		a3 = aux1.peek();
		aux1.pop();
		
		a1.toString();
		a2.toString();
		a3.toString();

		a4 = aux2.peek();
		aux2.pop();
		a5 = aux2.peek();
		aux2.pop();
		a6 = aux2.peek();
		aux2.pop();
		
		a4.toString();
		a5.toString();
		a6.toString();

		if (a1.equals(a4) && a2.equals(a5) && a3.equals(a6)) {

			return true;

		}
		
		return false;

	}

}
