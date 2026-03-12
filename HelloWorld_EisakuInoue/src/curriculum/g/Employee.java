package curriculum.g;

public class Employee{
	private String name;
	private String employeeId;

	public void showinfo() {
		System.out.println("社員ID: [" + employeeId + "], 名前: [" + name + "]");
		
	}
	public void setEmployeeId(String id) { 
		this.employeeId = id;          //プライベートIDをセット
		} 
	public String getEmployeeId() {
		return this.employeeId; 
		} 
	public void setName(String name) {
		this.name = name;              //プライベートネームをセット
		}
	public String getName() {
		return this.name; 
		}

}