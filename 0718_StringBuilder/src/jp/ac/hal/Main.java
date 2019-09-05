package jp.ac.hal;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 大量
		// StringBuilderを使う！
		int loop_count = 10000000;
		long start_time = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder();
		//String a = "";
		for( int i = 0; i < loop_count; i++) {
			sb.append("a");
		}
		System.out.println(System.currentTimeMillis() - start_time);
	}

}
