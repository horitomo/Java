package jp.ac.hal;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Product[] cart;
		cart = new Product[5];

		//↑の時点ではまだインスタンス化されていない
		// なので↓のforでnullをとりあえず入れてみる
		for( int i = 0; i < cart.length; i++) {
			cart[i] = null;
		}

		// 1つ目の商品登録
		// まだ何もないのでnewする必要がある
		cart[0] = new Product( 1, "a");
		cart[1] = new Product( 3, "b");

		for( Product p : cart ) {
			if(p != null) {
				System.out.print(p.getId());
			}
			// finalをつけると変更できなくなる
			final int a = 10;
			//a = 30;
		}
	}

}
