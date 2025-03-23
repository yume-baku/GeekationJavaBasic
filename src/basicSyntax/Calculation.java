package basicSyntax;

public class Calculation {

	public static void main(String[] args) {

		// 1.
		int x = 5;
		int y = 10;
		int z = x + y;
		System.out.println("変数zの値は" + z + "です。");

		// 2.
		double a = 5.25;
		a += 2.5;
		a *= 3.0;
		int b = (int) a;
		b += 10;
		System.out.println("変数aの値は" + a + "です。");
		System.out.println("変数bの値は" + b + "です。");

	}

}
