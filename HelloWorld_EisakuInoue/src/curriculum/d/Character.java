package curriculum.d;

import java.util.Random;

public class Character {
	Random random = new Random();
	
	String name;
	int HP = random.nextInt(50) + 51;
	int ATK = random.nextInt(31);
	int AGI = random.nextInt(31);

	 public Character(String name) {
	        this.name = name;
	    }
}
