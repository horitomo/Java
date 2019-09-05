package jp.ac.hal;

public class Robot {
	// フィールド定義
	String id;
	String color = "blue";
	String type = "cat";
	String name = "ドラえもん";

	// メソッド定義
	String getName() {
		return this.name;
	}

	// 自己紹介するメソッドを定義
	void printName() {
		System.out.println("ぼく" + this.name);
	}

	void giveDora(int dorayakiCount) {
		// とくにこれを↑を仮引数
		switch(dorayakiCount) {
		case 0:
			System.out.println("お帰りください");
			break;
		case 1:
			System.out.println("もっと～もっと～");
			break;
		case 2:
			System.out.println("にや");
			break;
		case 3:
			System.out.println("たぬきとお呼びください");
			break;
		}
	}
}
