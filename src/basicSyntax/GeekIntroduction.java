package basicSyntax;

// Geek君が自己紹介をするためのクラス
public class GeekIntroduction {

	// 挨拶メソッド
	public void greeting(int age, double height) {
		System.out.println("こんにちは! 私はGeek君でごわす。");
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");
		return;
	}

	// 特技メソッド
	public void specialSkill(int num1, int num2) {

		if(num1 < 1 || num2 < 1) {
			System.out.println("num1とnum2は0より大きい値にしてください。");
			return;
		}

		if(num1 >= num2) {
			System.out.println("num2はnum1より大きい値にしてください。");
			return;
		}

		if(num1 > 300 ||  num2 > 300) {
			System.out.println("num1とnum2は300以下にしてください。");
			return;
		}

		for(int i = num1; i <= num2 ; i++) {

			if(i % 3 == 0 && i % 5 == 0){
				System.out.println(i + "は3の倍数かつ5の倍数です。");
				continue;
			}

			if(i % 3 == 0){
				System.out.println(i + "は3の倍数です。");
				continue;
			}

			if(i % 5 == 0){
				System.out.println(i + "は5の倍数です。");
				continue;
			}

			System.out.println(i);
		}

	}
}
