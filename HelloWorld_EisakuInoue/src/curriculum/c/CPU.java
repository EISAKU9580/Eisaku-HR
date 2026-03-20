package curriculum.c;

import java.util.Random;

public class CPU {
	private Random rand = new Random();
	
	public int ScanHand() {
		return rand.nextInt(3);
	}
}
