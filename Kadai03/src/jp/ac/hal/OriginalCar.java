package jp.ac.hal;

public class OriginalCar {

	private String type;
	private String color;
	private int omosa;

	// 初期化
	public OriginalCar(String type,String color,int omosa) {
		this.type = type;
		this.color = color;
		this.omosa = omosa;
	}

	// 走行メソッド
	public void drive() {
		System.out.println(this.color + "色の" + this.type + "が走る。");
	}

	// 停止メソッド
	public void stop() {
		if(this.omosa <= 1000 ) {
			System.out.println("軽々止まる。");
		}else {
			System.out.println("重々しく止まる。");
		}

	}


}
