package curriculum.c;

public class Setting {
	int Rock = 0;
	int Scissors = 1;
	int Paper = 2;
	
	static String toString(int Set) {
		switch(Set) {
		case Rock: return "グー";
		case Scissors: return "チョキ";
		case Paper: return "パー";
		default: return "不明";
		}
	}
}
