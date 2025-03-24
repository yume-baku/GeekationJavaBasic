package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {

		// 1.
		String msg;
		for(int i = 1; i <= 100; i++) {

			msg = ""; // 評価処理前の初期化

			if(i % 3 == 0) { msg += "Fizz"; }

			if(i % 5 == 0) { msg += "Buzz"; }

			// FizzBuzzセットなしの場合はカウンタをセット
			if(msg.equals("")){ msg += i; }

			System.out.println(msg);
		}

		System.out.println("---------------------------------");

		// 2.
		String[] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};

		for(String language: languages) {

			if(language == "Java") {
				System.out.println("現在学習中の言語はJavaです。");
				continue;
			}else if(language == "HTML") {
				System.out.println("HTMLはプログラミング言語ではありません。");
				break;
			}

			System.out.println(language);
		}
	}
}
