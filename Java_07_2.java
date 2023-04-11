package TextBook;

/**
 質問１︓以下コードのコンパイルエラー理由を教えてください。
 	答え：setAgeの型未定義
 */
public class Java_07_2 {

	public class Pet {
		 public String name;
		 
		 public void setName(String value) {
		 this.name = value;
		 }
		}
		// Kicker.java
		public class Kicker {
		 public static void main(String...args) {
		 Pet cat = new Pet();
		 cat.setAge(1234);
		 }
		}

}
