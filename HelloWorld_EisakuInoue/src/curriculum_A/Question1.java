package curriculum_A;

public class Question1{
	
	public static void main(String[] args) {
		
		// Q1の答え
		
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0;
		float floatNum = 0.0f;
		double doubleNum = 0.0;
		
		char letter = '\u0000';
		String letters = null;
		boolean isBoolean = false;
		
		// Q2の答え
		
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum= 9.5f;
		doubleNum = 10.5;
		
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		// Q3の答え
		
		System.out.println(byteNum + shortNum + intNum + longNum );
		
		System.out.println(byteNum + byteNum);
		
		System.out.println(letter + letters + isBoolean);
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);

		// Q4の答え
				
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");

		// Q5の答え
		
		int age = 25;
		System.out.println("年齢" + age + "歳");
 
		// Q6の答え
		
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);

		// Q7の答え
		
		int score = 80;
		System.out.println(score);
		score = score + 20;
		System.out.println(score);

		// Q8の答え
		
		double price = 99.99;
		int i = (int) price;
		System.out.println("整数価格：" + i);

		// Q9の答え
		
		String numStr = "123";
		int numInt = Integer.parseInt(numStr) ; 
		System.out.println(numInt + 10);

		// Q10の答え
		
		int num = 50;
		String str = String.valueOf(num);
		System.out.println("得点" + str + "点");

		// Q11の答え
		
		int a = 10;
		int b = 20;
		boolean result = a < b;
		System.out.println(result);

		// Q12の答え
		
		int x = 15;
		if(x >= 10) {
			System.out.println("OK");
		}
		else {
			System.out.println("NG");
		}

		// Q13の答え
		
		String text = "私はJavaが好きです。Javaは楽しい！";
		System.out.println(text.replace("Java" , "Python"));
	}
}