package curriculum.h;

public class Main {
    public static void main(String[] args) {
        Employee f = new FullTimeEmployee("F001", "佐藤太郎");
        Employee p = new PartTimeEmployee("P001", "田中花子");

        System.out.println("正社員の給与 = " + f.calculateDailyWage(9) + "円");
        System.out.println("パート社員の給与 = " + p.calculateDailyWage(9) + "円");
    }
}

