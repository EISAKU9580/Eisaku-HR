package curriculum_B;

import java.util.Scanner;

public class Question4 
{
	
	public static void main(String[] args) 
	{
		//Q1 数字を格納＋表示
		int[] number = {1,2,3,4,5};
		
		for(int n : number) {
			System.out.println(n);
		}
		System.out.println("");//設問の間をわかりやすくするための改行
			
		//Q2 数字を格納＋逆順表示
		int[] numbers = {10,20,30,40,50};
		for (int f = 0, l = numbers.length - 1; f < l; f++, l--){
			  int temp = numbers[f];
			  numbers[f]  = numbers[l];
			  numbers[l] = temp;
		}
		for(int ns : numbers) {
			System.out.println(ns);
		}
		System.out.println("");//設問の間をわかりやすくするための改行
		
		//Q3 数字を格納＋合計を計算
		int[] total = {3,5,7,9,11};
		int sum = 0;
		
		for(int t : total) {
			sum += t;
		}
		System.out.println(sum);
		System.out.println("");//設問の間をわかりやすくするための改行
		
		//Q4 数字を格納＋最大値最小値を表示
		int[] ave = {12,7,9,21,5,18};
		int max = ave[0];
		int min = ave[0];
		
		for(int a : ave) {
			if(a > max)
				max = a;
		}
		System.out.println("最大値は" + max);
		
		for(int a : ave) {
			if(a < min)
				min = a;
		}
		System.out.println("最小値は" + min);
		System.out.println("");//設問の間をわかりやすくするための改行
		
		//Q5 数字を格納＋全て2倍
		int[] multiple = {1,2,3,4,5};
		
		for(int m : multiple) {
			System.out.println(m*  2);
		}
		System.out.println("");//設問の間をわかりやすくするための改行
		
		//Q6 数字を格納＋ユーザーが入力した数字が含まれているかを確認
		int[] password = {4,7,10,15,20};
		boolean found = false;

		Scanner code = new Scanner(System.in);
		System.out.println("数値を入力してください");
		
		int pass;
		pass = code.nextInt();
		
		for(int p : password) {
			if(p == pass) {
			found = true; 
	        break;
			}
		}
		
		if(found) {
			System.out.println(pass + "は含まれています");
		}
		else {
			System.out.println(pass + "は含まれていません");
		}
		System.out.println("");//設問の間をわかりやすくするための改行
		
		//Q7 2次元配列
		int [][] array = {{1,2},{3,4},{5,6}};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++ ) {
				System.out.println(array[i][j]);
			}
		}
		System.out.println("");//設問の間をわかりやすくするための改行
		
		//Q8 2次元配列の合計
		int[][] array2 = {{10,20,30},{40,50,60},{70,80,90}};
		sum = 0;
		
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++ ) {
				sum += array2[i][j];
			}
		}
		System.out.println(sum);
		System.out.println("");//設問の間をわかりやすくするための改行
		
		//Q9 ２次元配列の最大値と最小値
		int[][] array3 = {{12,15,8},{6,19,25},{30,2,10}};
		max = array3[0][0];
		min = array3[0][0];
		
		//最大値
		for(int i = 0; i < array3.length; i++) {
			for(int j = 0; j < array3[i].length; j++ ) {
				if(array3[i][j] > max)
					max = array3[i][j];
			}
		}
		System.out.println("最大値は" + max);
		
		//最小値
		for(int i = 0; i < array3.length; i++) {
			for(int j = 0; j < array3[i].length; j++ ) {
				if(array3[i][j] < min)
					min = array3[i][j];
			}
		}
		System.out.println("最小値は" + min);
		System.out.println("");//設問の間をわかりやすくするための改行
		
		
		//3次元配列　表示
		int[][][]array4 = {{{1,2},{3,4}},{{5,6},{7,8}}};
		
		for (int i = 0; i < array4.length; i++) { 
            for (int j = 0; j < array4[i].length; j++) { 
                for (int k = 0; k < array4[i][j].length; k++) {
                    System.out.println(array4[i][j][k]);
                }
            }
        }
        code.close();
	}
}


