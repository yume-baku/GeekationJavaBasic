package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {

		
		// 1.
		int a = 1, b = 2;
		System.out.println(a < b);
		
		// 2.
		boolean isSunny = true, isWarm = true;
		System.out.println(isSunny && isWarm);
		
		// 3.
		int x = 1, y = 2;
		System.out.println(x >= 0 && y%2 == 0 );
		
		// 4.
		boolean hasPermission = false;
		System.out.println(!hasPermission);

	}

}
