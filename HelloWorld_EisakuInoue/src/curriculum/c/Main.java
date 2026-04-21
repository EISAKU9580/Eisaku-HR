package curriculum.c;

public class Main {
	public static void main(String[] args) {
		me player = new me();
		CPU cpu = new CPU();
		
		while(true) {
			int meHand = player.ScanHand();
			int cpuHand = cpu.ScanHand();
			
			System.out.println("私の手は:" + Setting.toString(meHand));
			System.out.println("相手の手は：" + Setting.toString(cpuHand));
			
			
			if(meHand == cpuHand) {
				System.out.println("あいこで～～～～");
				continue;
			}
			
			boolean win = 
				(meHand == Setting.Rock && cpuHand == Setting.Scissors) ||
				(meHand == Setting.Scissors && cpuHand == Setting.Paper)||
				(meHand == Setting.Paper && cpuHand == Setting.Rock);
			
			if(win) {
				System.out.println("勝ったぜ！");
				break;
			}
			else {
				System.out.println("負けました～");
			}			
		}
	}
}