package curriculum_B;

 import java.util.Random;
import java.util.Scanner;
public class Question2{

	public static void main(String[] args) {
		
		// Q1 解答
		int score = 75;
		if(score >= 60) {
			System.out.println("合格です！");
		}
		
		// Q2 解答
		int age = 25;
		if(20 <= age && age <= 30) {
			System.out.println("適正年齢です");
		}
		else {
			System.out.println("対象外です。");
		}
		
		//Q3 解答
		int age1 = 18;
		if(age1 >= 20) {
			System.out.println("成人です");
		}
		else if(13 <= age1 && age1 <= 19){
			System.out.println("ティーンエイジャー");
		}
		else if(age1 <= 12) {
			System.out.println("子供です。");
		}
		
		//Q4 解答
		int x = 30;
		int y = 15;
		int z = 50;
		if(x > y) {
			if(x > z) {
				System.out.println(x);
			}
			else {
				System.out.println(z);
			}
		}
		else if(y > z) {
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}
		
		//Q5 解答
		Random rand = new Random();
		int num = rand.nextInt(8) - 4;
		if(0 < num) {
			System.out.println("正の数です");
		}
		else if(0 > num) {
			System.out.println("負の数です");
		}
		else {
			System.out.println("0です");
		}
		
		//Q6 解答
		int value = rand.nextInt(10) + 100;
		if(value%2 == 0) {
			System.out.println("偶数です");
		}
		else {
			System.out.println("奇数です");
		}
		
		//Q7 解答
		/*int[] score1 = new int[101];
		for(int i = 0; i < 101; i++) {*/
			int score1 = 88;
			if(score1 >= 90){
			System.out.println("優");
			}
			else if(score1 >= 70){
				System.out.println("良");
			}
			else if(score1 >= 50){
				System.out.println("可");
			}
			else if(score1 < 50) {
				System.out.println( "不可");
			}
		
	
		
		//Q8 解答
		Scanner code = new Scanner(System.in);
		System.out.println("名前を入力してください");
		String name = code.nextLine();
		//System.out.println(num1 * 2);
		if(name == null || name.trim().isEmpty()) {
			System.out.println("入力が無効です");
		}
		
		

		//Q9	解答
		System.out.println("数値を入力してください");
		int day = code.nextInt();
		switch(day) {
			case 1 : System.out.println("月曜日");
			break;
	
			case 2 : System.out.println("火曜日");
			break;
	
			case 3 : System.out.println("水曜日");
			break;
	
			case 4 : System.out.println("木曜日");
			break;
	
			case 5 : System.out.println("金曜日");
			break;
	
			case 6 : System.out.println("土曜日");
			break;
	
			case 7 : System.out.println("日曜日");
			break;
			
			default : System.out.println("無効な入力です");
		}
		
		//Q10 解答
		System.out.println("暦を入力してください");
		int month = code.nextInt();
		switch(month) {
		
			case 12 : 
			case 1 : 
			case 2 : System.out.println("冬");
			break;
			
			case 3 : 
			case 4 : 
			case 5 : System.out.println("春");
			break;
	
			case 6 :
			case 7 : 
			case 8 : System.out.println("夏");
			break;
			
			case 9 : 
			case 10 : 
			case 11 : System.out.println("秋");
			break;
			
			default : System.out.println("無効な入力です");

			code.close();
		}
		
	}
}