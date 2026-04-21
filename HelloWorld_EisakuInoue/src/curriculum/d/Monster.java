package curriculum.d;

/*public class Monster {
	Random random = new Random();
	
	String name = "モンスター";
	int HP = random.nextInt(50) +50;
	int ATK = random.nextInt(30);
	int AGI = random.nextInt(30);	
}*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Monster {
    String name;
    int HP;
    int ATK;
    int AGI;

    public Monster() {
        loadDaemon();
    }

    private void loadDaemon() {
        try (BufferedReader br = new BufferedReader(new FileReader("daemon_status.txt"))) {
            name = br.readLine();            
            HP = Integer.parseInt(br.readLine());  
            ATK = Integer.parseInt(br.readLine()); 
            AGI = Integer.parseInt(br.readLine()); 
        } catch (IOException e) {
            System.out.println("Daemonのステータス読み込みに失敗しました");
        }
    }
}

