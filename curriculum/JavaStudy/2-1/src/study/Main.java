package study;

/**
 *
 * 本課題では、フィールド変数、メソッドの基本的な使い方を学んでいきましょう。
 * 課題範囲は以下のとおりです。
 *   Main.java: 問①から問③
 * 指定された値と変数名を守って記述してください。
 *
 */
public class Main {

    public static void main(String[] args) {

      //① firstNameとlastNameという名前の変数を定義し、
      //   firstNameには自分の名前、lastNameには自分の名字で初期化しなさい


        //getName関数の呼び出しと出力
        System.out.println(getName(firstName, lastName));
        System.out.println();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //③ arr 配列をループさせ、isOdd関数を使って配列の要素が奇数かどうかの判定を行いなさい。
        //   要素が奇数の場合には「nは奇数です。」と出力されます。



    }

    //② 関数を定義しなさい。
    //   関数名：getName
    //  修飾子：public
    //   引数には①で定義したfirstNameとlastNameを引数で受け取り、
    //  last_name と first_name を連結した値を返り値とする変数を定義しなさい。




    //奇数の判定を行う。
    public static void isOdd(int num) {
      if(num % 2 != 0) {
        System.out.println(num + "は奇数です。");
        }
  }
}