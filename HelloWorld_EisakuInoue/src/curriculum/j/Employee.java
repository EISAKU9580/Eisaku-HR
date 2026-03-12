package curriculum.j;

public abstract class Employee implements Billable{
	
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract int costForDay(int hoursWorked);
	//サブクラスで必ずオーバーライドする
	//オーバーライドってなんぞや？
	
}
