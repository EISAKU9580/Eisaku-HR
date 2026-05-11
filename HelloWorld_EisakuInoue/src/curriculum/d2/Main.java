package curriculum.d2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("あなたの名前を教えてください");
		String name = scanner.nextLine(); 
		Character player = new Character(name);
		
		System.out.println(player.name + "のステータスは");
		System.out.println("体力：" + player.HP);
		System.out.println("攻撃力：" + player.ATK);
		System.out.println("速さ：" + player.AGI);
		
		
		Monster enemy = new Monster();

		System.out.println(enemy.name + "が現れた！");
		System.out.println("体力：" + enemy.HP);
		System.out.println("攻撃力：" + enemy.ATK);
		System.out.println("速さ：" + enemy.AGI);
		
		System.out.println("バトルが始まった");
		
		Random rand = new Random();
		boolean playerFirst;

		if (player.AGI > enemy.AGI) {
		    playerFirst = true;
		    System.out.println(player.name + "が先攻！");
		} else if (player.AGI < enemy.AGI) {
		    playerFirst = false;
		    System.out.println(enemy.name + "が先攻！");
		} else {
		    playerFirst = rand.nextBoolean();
		    System.out.println("素早さが同じなのでランダムで先に動く方が決まる！");
		    if (playerFirst) {
		        System.out.println(player.name + "が先攻！");
		    } else {
		        System.out.println(enemy.name + "が先攻！");
		    }
		}

		
		while (player.HP > 0 && enemy.HP > 0) {

		    if (playerFirst) {
		        // プレイヤー先攻
		        System.out.println(player.name + "の攻撃！");
		        enemy.HP -= player.ATK;

		        if (enemy.HP <= 0) break;

		        System.out.println(enemy.name + "の攻撃！");
		        player.HP -= enemy.ATK;

		    } else {
		        // 敵先攻
		        System.out.println(enemy.name + "の攻撃！");
		        player.HP -= enemy.ATK;

		        if (player.HP <= 0) break;

		        System.out.println(player.name + "の攻撃！");
		        enemy.HP -= player.ATK;
		    }

		    System.out.println(player.name + "のHP:" + player.HP);
		    System.out.println(enemy.name + "のHP:" + enemy.HP);
		}

		
		
		if (player.HP <= 0) {
		    System.out.println(player.name + "は倒れた…");
		    System.out.println("ゲームオーバー");
		} else {
		    System.out.println(enemy.name + "を倒した！");
		    System.out.println("勝利！！");
		}
		scanner.close();
		try (FileWriter fw = new FileWriter("battle_log.txt", true)) {
		    fw.write("===== バトル結果 =====\n");
		    fw.write("プレイヤー名: " + player.name + "\n");
		    fw.write("敵: " + enemy.name + "\n");

		    if (player.HP <= 0) {
		        fw.write("結果: 敗北\n");
		    } else {
		        fw.write("結果: 勝利\n");
		    }

		    fw.write("プレイヤー残りHP: " + player.HP + "\n");
		    fw.write("敵残りHP: " + enemy.HP + "\n");
		    fw.write("======================\n\n");

		} catch (IOException e) {
		    System.out.println("バトルログの書き込みに失敗しました");
		}

	}
	
}