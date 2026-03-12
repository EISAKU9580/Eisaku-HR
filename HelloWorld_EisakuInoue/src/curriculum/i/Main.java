package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("FT001", "佐藤"));
        employees.add(new FullTimeEmployee("FT002", "鈴木"));
        employees.add(new ContractEmployee("CT001", "田中"));
        employees.add(new ContractEmployee("CT002", "高橋"));

        int totalWage = 0;
        for (Employee emp : employees) {
            int wage = emp.calculateDailyWage(10);
            System.out.println(emp.getName() + " の日給は " + wage + "円");
            totalWage += wage;
        }

        System.out.println("合計日給：" + totalWage + "円");
    }
}


