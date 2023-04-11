package TextBook;

/**
 質問１︓以下コードのコンパイルエラー理由を教えてください。
 	答え：setAgeの型未定義
 */
public class Java_07_2_1 {

	public Matrix add(Matrix b) {
	    int rows = data.length;
	    int cols = data[0].length;
	    
	    // 行列の大きさが同じであることを確認する
	    if (b.data.length != rows || b.data[0].length != cols) {
	        throw new IllegalArgumentException("行列の大きさが一致しません");
	    }
	    
	    int[][] resultData = new int[rows][cols];
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            resultData[i][j] = data[i][j] + b.data[i][j];
	        }
	    }
	    return new Matrix(resultData);
	}

}
