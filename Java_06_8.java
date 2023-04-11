package TextBook;

import java.util.Arrays;

/**
質問８︓バブルソート⽤メソッドを作成してください。
1. メソッド名︓bubbleSort
2. 引数１︓intの配列
3. 戻り値︓ソート済みの配列
4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
い。
 */
public class Java_06_8 {
	
	
	public static void main(String[] args) {
		int [] nums = {3,55,89,45,2,6,99,32};
		Matome matome = new Matome();
		System.out.print(Arrays.toString(matome.bubbleSort(nums)));
	}
	
}
