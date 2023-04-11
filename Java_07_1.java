package TextBook;

/**
 質問２︓Mathクラスを作成してください。以下メソッドを定義します。
1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
4. mainメソッドで上記それぞれメソッドを呼び出してください。
以下はメソッドの定義のソースの抜枠です。
 */
public class Java_07_1 {

	public class Math {
	    public static int max(int[] arr) {
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }

	    public static int min(int[] arr) {
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        return min;
	    }

	    public static double average(int[] arr) {
	        double sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return sum / arr.length;
	    }
	}
	public static void main(String[] args) {
	    int[] arr = {4, 2, 8, 1, 6, 9, 3, 7, 5};
	    int max = Math.max(arr);
	    int min = Math.min(arr);
	    double average = Math.average(arr);
	    System.out.println("Max: " + max);
	    System.out.println("Min: " + min);
	    System.out.println("Average: " + average);
	}


}
