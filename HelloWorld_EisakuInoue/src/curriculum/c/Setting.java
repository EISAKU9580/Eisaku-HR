package curriculum.c;

public class Setting {
	static final int Rock = 0;
	static final int Scissors = 1;
	static final int Paper = 2;
	
	static String toString(int Set) {
		switch(Set) {
		case Rock: return "グー";
		case Scissors: return "チョキ";
		case Paper: return "パー";
		default: return "不明";
		}
	}
}
