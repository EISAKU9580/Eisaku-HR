package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		
		// 1から10の数字を表示
		System.out.println("Q1");
		for(int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("");
		
		
		// 2から20までの偶数を表示
		System.out.println("Q2");
		for(int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
		System.out.println("");
		
		
		// Q1の逆
		System.out.println("Q3");
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("");
		
		
		// 1から100の合計を計算
		System.out.println("Q4");
		int Total = 0;
		for(int i = 1; i <= 100; i++) {
			Total  = Total + i;
		}
		System.out.println(Total);
		System.out.println("");
		
		
		// 三角形作り
		System.out.println("Q5");
		String Triangle = "*";
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(Triangle);
				//System.out.println("*");
			}
			System.out.println("");
		}
		
		
		// while利用で1から10を表記
		System.out.println("Q6");
		int count = 1;
		while(count <= 10) {
			System.out.println(count);
			count++;
		}
		System.out.println("");
		
		
		// while利用で1から10を表記
		System.out.println("Q7");
		int gusu = 2;
		while(gusu <= 20) {
			System.out.println(gusu);
			gusu += 2;
		}
		System.out.println("");
		
		
		// while利用で1から10を表記
		System.out.println("Q8");
		int countdoun = 10;
		while(countdoun >= 1) {
			System.out.println(countdoun);
			countdoun--;
		}
		System.out.println("");
		
		
		// while利用で1から100を合計する
		System.out.println("Q9");
		int goke = 0;
		int i = 0;
		while(i <= 100) {
			goke += i;
			i++;
		}
		System.out.println(goke);
		System.out.println("");
		
		
		//　数値入力
		System.out.println("Q10");
		Scanner code = new Scanner(System.in);
			System.out.println("数値を入力してください");
		int a;
		a = code.nextInt();
		while(a!= 0) {			
			System.out.println("再度数値を入力してください");
			a = code.nextInt();
			
		}
		System.out.println("終了しました");
		code.nextLine();
		System.out.println("");
		
		
		// 九九表作り
		System.out.println("Q11");
		
		for(int d = 1; d <= 9; d++) 
		{
			for(int b = 1; b <= 9; b++) 
			{
				int A = d*b;
				System.out.printf
				(String.format("%02d", d) + " * " + String.format("%02d", b) + " = " + String.format("%02d", A) + " ");
				if(b < 9) {
				System.out.print("|| ");
				}
			}
			System.out.println("  ");
		}
		System.out.println("");

		
		// 商品の在庫を確認する。
        Random rand = new Random(); //ランダム

        System.out.println("商品を入力してください（複数入力する場合は「、」で区切る）:");
        System.out.println("商品一覧: パソコン, 冷蔵庫, 扇風機, 洗濯機, 加湿器, テレビ, ディスプレイ");

        String shohin = code.nextLine(); 
        String[] products = shohin.split("、"); 

        int TV = rand.nextInt(12); //テレビの台数を先に指定
        int display = 11 - TV;	//テレビに対しての台数を判定

        for (String p : products) { //拡張for文
            String product = p.trim(); 

            switch (product) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    int stock = rand.nextInt(12);
                    System.out.println(product + "の残り台数は" + stock + "台です。");
                    break;

                case "テレビ":
                case "ディスプレイ":
                    int zaiko = product.equals("テレビ") ? TV : display;
                    System.out.println(product + "の残り台数は" + zaiko + "台です。");
                    break;
                    
                default:
                    System.out.println(product+ "は指定の商品ではありません。");
                    break;
            }
        }

        code.close();
		
      
	}
}
