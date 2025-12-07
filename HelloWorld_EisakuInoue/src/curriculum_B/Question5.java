package curriculum_B;

public class Question5 {
	
	//Q1　メソッド
	public static void helloWorld() {
		System.out.println("Hello,World!!");
	}
	
	//Q2 メソッド
	public static int doubleValue(int num) {
		return num * 2;
	}
	
	//Q3 メソッド
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public class Main {	
		public static void main(String[] args) {
			helloWorld(); //Q１ メソッド	
			
			//Q2 戻り値？
			int value = 10;
			int total = doubleValue(value);
			System.out.println(value + " を２倍すると" + total + "です。");
			
			//Q3　戻り値？
			int num1 = 10;
			int num2 = 7;
			
			if(isEven(num1)) {
				System.out.println(num1 + "は偶数です");
			}
			else {
				System.out.println(num1 + "は奇数です");
			}
			
			if(isEven(num2)) {
				System.out.println(num2 + "は偶数です");
			}
			else {
				System.out.println(num2 + "は奇数です");
			
			//別のクラスからの呼び出し
			Greeting.sayHello();
			
			//別クラスからの呼び出し
			Animal animal = new Animal();
			animal.putInName("ライオン");
			animal.putInLength(2.1);
			animal.putInSpeed(80);
			
			System.out.println("動物名 : " + animal.takeName());
			System.out.println("体長 : " + animal.takeLength());
			System.out.println("速度 : " + animal.takeSpeed());
			}
		}
	}
}
