package jp.ac.hal;

public class Main {
	// 定数…定まっている値
	// つまり変更できない値
	// 変数…変更できる値

	// 基本的にはここに定数をかく
	// javaでの定数宣言
	public static final int MAX_COUNT = 10;

	// 定数名は、大文字＆アンダーバーであることが慣例


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i = 0;

		if( i < MAX_COUNT ) {

		}

		while( i < MAX_COUNT ) {

		}

		// 定数の利点
		// ①修正箇所が１か所になる
		// ②定数名で用途が分かり、保守性が上がる

		// if( i < 10 )
		//         ↑
		// 処理中に出現する数値は、
		// マジックナンバーと呼ばれ、
		// 禁止されていることが多いです。
		// →定数を利用すること。
		// ＊マジックナンバーとは
		// 　マジックみたいに、ぱっと見で
		// 　よくわからない数値
		// 　0は例外である

		// おまけ～PHP～
		// define("MAX_COUNT", 10);
		// classを使うとconst MAX_COUNT = 10;
		// でいける
	}

}
