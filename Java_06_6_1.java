package TextBook;

public class Java_06_6_1 {

	public static void main(String[] args) {

		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		int[] result = megerArray(left, right);

		printArray(result);

		//System.out.print(result);
	}

	/**
	 * 引数left と 引数right をマージして、新しい配列を作成して返却する。
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] megerArray(int[] left, int[] right) {

		int[] result = new int[left.length + right.length];

		//  処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する

		for (int i = 0; i < left.length; i++) {
			result[i] = left[i];
		}
		for(int k = 0; k < left.length; k++) {
			result[k + left.length] = right[k];
		}

		return result;

	}

	/**
	 * Print
	 * @param objs
	 */
	public static void printArray(int[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}