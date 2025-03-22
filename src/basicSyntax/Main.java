package basicSyntax;

public class Main {

	public static void main(String[] args) {


		// Geek君呼出
		GeekIntroduction gi = new GeekIntroduction();


		// 挨拶メソッド
		int age = 20;
		double height = 155.5;

		gi.greeting(age, height);

		// 特技メソッド
		int num1 = 11, num2 = 20;

		gi.specialSkill(num1, num2);
	}

}
