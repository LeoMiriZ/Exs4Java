
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calcular(2, 1));

	}

	public static int calcular(int x, int n) {

		if (n == 0) return 1;

		return x * calcular (x, n - 1);

	}

}
