package basicSyntax;

public class Variables {

	public static void main(String[] args) {
	
		int num1 = 1;
		double num2 = 2.3;
		
		System.out.println(num1);
		System.out.println(num2);
		
		String msg = "私の好きな%sは%sです";
		
		System.out.println(String.format(msg, "整数", num1));
		System.out.println(String.format(msg, "小数", num2));
	}

}
