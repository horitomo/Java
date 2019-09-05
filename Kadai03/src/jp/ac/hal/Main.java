package jp.ac.hal;

public class Main {

	public static void main(String[] args) {
		// 演習5
		ProductCar productCar = new ProductCar();
		productCar.drive();
		productCar.stop();

		// 演習9
		OriginalCar originalCar1 = new OriginalCar("軽","白",800);
		originalCar1.drive();
		originalCar1.stop();

		// 演習10-11
		OriginalCar originalCar2 = new OriginalCar("スポーツカー","赤",1200);
		originalCar2.drive();
		originalCar2.stop();

		// 演習12
		OriginalCar[] originalCar3 = new OriginalCar[3];
		originalCar3[0] = new OriginalCar("セダン","青",1000);
		originalCar3[1] = new OriginalCar("ワンボックス","黄",1000);
		originalCar3[2] = new OriginalCar("ワゴン","灰",1000);

		for(OriginalCar a : originalCar3) {
			a.drive();
		}
	}

}
