package TextBook;

import java.util.Arrays;

/**
 質問９︓メソッドの呼び出す練習。
1. 質問６-１を⽤い、２つ配列をマージします。
2. 質問８を⽤い、ステップ１のマージした配列をソートする。
3. 注意︓コードを１⾏にしてください
 */
public class Java_06_9 {

	public static void main(String[] args) {
		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };

		int start = 0;
		int end = input.length - 1;

		// 先頭から空白文字列を削除
		while (start < end && input[start] == ' ') {
			start++;
		}

		// 末尾から空白文字列を削除
		while (end >= start && input[end] == ' ') {
			end--;
		}

		// 新しい配列を作成
		char[] output = Arrays.copyOfRange(input, start, end + 1);
		System.out.println(Arrays.toString(output));

	}

}
