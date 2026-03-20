package curriculum.j;

public class ContractEmployee extends Employee{
	
	private static final int HOURLY_WAGE = 1000;
	
	public ContractEmployee(int id, String name) {
		
		super(id, name);
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		
		return hoursWorked * HOURLY_WAGE;
		
	}
}
