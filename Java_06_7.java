package TextBook;

import java.util.Arrays;

/**
 * 質問７︓以下静的なメソッドを定義してください。
1. メソッド名︓trim
2. 引数１︓charの配列
3. 戻り値︓charの配列
4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
以下メソッドの実施例︓
char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
// メソッドを実施後
char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数
 * @author hangt
 *
 */
public class Java_06_7 {
	

	public static void main(String[] args) {
		
		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; 

		
		Java_06_6_2 j = new Java_06_6_2();
		
		System.out.println(Arrays.toString(j.trim(input)));
		
		
	}
	
}
