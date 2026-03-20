package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Billable> employees = new ArrayList<>();
		 
		employees.add(new FullTimeEmployee(1, "田中"));
		
		employees.add(new ContractEmployee(2, "佐藤"));
		
		employees.add(new FullTimeEmployee(3, "鈴木"));
		
		int hourWorked = 9;
		
		for(Billable emp : employees) {
			
			int dailyCost = emp.costForDay(hourWorked);
			
			System.out.println("日給：" + dailyCost + "円");
			
		}
	}
}
