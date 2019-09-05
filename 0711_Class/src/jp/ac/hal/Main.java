package jp.ac.hal;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Robot r;

		// インスタンス化(実体)化
		r = new Robot();
		r.getName();
		// 戻り値は受け取らなくてもOK

		String rName = r.getName();
		// ↓実行時のイメージ
		// String rName = "ドラえもん";
		System.out.println(rName);

		r.printName();

		r.giveDora(0);
		r.giveDora(3);
		// この数字↑を実引数と呼ぶ

		System.out.println("end");
		myMethod();

	}

	static void myMethod() {

	}

}
