package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {

		int a = 10, b = 5;
		
		printCalcResult(add(a, b));
		printCalcResult(substract(a, b));
		printCalcResult(multiply(a, b));
		printCalcResult(devide(a, b));
	}
	
	// 四則演算
	private static int add(int a, int b) { return a + b;}
	private static int substract(int a, int b) { return a - b;}
	private static int multiply(int a, int b) { return a * b;}
	private static int devide(int a, int b) { return a / b;} // ※小数とゼロ除算は考慮していない
	
	// コンソール出力
	private static void printCalcResult(int result) {
		System.out.println("計算結果は"+ result + "です。");
	}

}
