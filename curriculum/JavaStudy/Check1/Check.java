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

		// すべての要素を入れ替えるためにfor文を回す
		for (int i = 0; i < data.length - 1; i++) {

			// 現在の要素が一番小さなものになるように,後ろから順番に小さい値を繰り上げていく
			for (int j = data.length - 1; j > i; j--) {
				/*
				 * 問3 以下、配列の添字を入れてソートを完成させなさい
				 */
				// ひとつ上の要素が 自身より大きければ入れ替える
				if (data[j - 1] > data[j]) {
					int box = data[j - 1];
					data[j - 1] = data[j];
					data[j] = box;
				}
			}
		}
		/*
		 * 1回目 3 1 2 5 7 2回目 3 1 2 5 7 3回目 3 1 2 5 7 4回目 1 3 2 5 7 5回目 1 3 2 5 7 6回目 1 3
		 * 2 5 7 7回目 1 2 3 5 7
		 * 
		 */
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}
