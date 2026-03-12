package curriculum.j;

public class FullTimeEmployee extends Employee{
	private static final int HOURLY_WAGE = 1250;
	
	public FullTimeEmployee(int id,String name) {
		super(id, name);
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		
		if(hoursWorked <= 8) {
			return hoursWorked * HOURLY_WAGE;
		}
		else {
			int overtime = hoursWorked - 8;
			
			return(8 * HOURLY_WAGE) + (int)(overtime * HOURLY_WAGE * 1.25);
		}
	}

}
