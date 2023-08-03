
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		converter(25);

	}

	public static void converter(int i) {

		if (i == 0)
			return;
		
		System.out.print(i % 2);
		converter (i / 2);

	}

}
