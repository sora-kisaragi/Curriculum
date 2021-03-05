/**
 * バブルソート チェックテスト-Java1章
 *
 */
public class Check {
	public static void main(String[] args) {
		/*
		 * 問1 int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
		 */
		int[] data = { 3, 1, 2, 7, 5 };
		/*
		 * 問2 以下のfor文を完成させなさい
		 */
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < data.length - 1; i++) {
			// 自身を除く配列の長さ分for文を回す
			// 後ろから回すことによって大きい数字が配列数の大きい方へ格納されていくため小さい数字から順に並ぶ
			for (int j = data.length - 1; j > i; j--) {
				/*
				 * 問3 以下、配列の添字を入れてソートを完成させなさい
				 */
				// ひとつ隣のデータが自身より大きければ値を入れ替える
				if (data[j - 1] > data[j]) {
					int box = data[j - 1];
					data[j - 1] = data[j];
					data[j] = box;
				}
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}
