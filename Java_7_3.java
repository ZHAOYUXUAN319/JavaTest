package TextBook;

/**
 * 質問１︓ペットクラスを定義してください。ペットクラスは名称と年齢を保有して。以下
２インスタンスを作成してください。変数１︓cat , 変数２︓dog。catの名称は ”cat”, 年齢
=2, dogの名称は ”dog”, 年齢=5。
1. クラスを定義する。クラス名は Pet。
2. 該当クラスに、「名称」「年齢」属性が保有しています。
3. Petクラスをインスタンス化する。以下２つオブジェクトを作成してください。
4. オブジェクト１︓変数名 = cat。名称 = “cat“, 年齢 = 2。
5. オブジェクト２︓変数名 = dog。名称 = “dog“, 年齢 = 5。
 * @author hangt
 *
 */
public class Java_7_3 {
	public class Pet {
	    private String name;
	    private int age;

	    public Pet(String name, int age) {
			this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	}
	 public static void main(String[] args) {
	        // オブジェクト１：cat
	        Pet cat = new Pet("cat", 2);
	        // オブジェクト２：dog
	        Pet dog = new Pet("dog", 5);
	    }

	

}
