package curriculum.c;

import java.util.Scanner;

public class me {
	private Scanner scanner = new Scanner(System.in);
	
	public int ScanHand() {
		System.out.print("グー(0)、　チョキ(1)、　パー(2)を入力してください。");
		return scanner.nextInt();
	}
}
