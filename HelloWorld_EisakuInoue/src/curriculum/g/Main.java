package curriculum.g;

public class Main {
	public static void main(String[] args){
		Employee E = new Employee();
        
        E.setEmployeeId("E002");
        E.setName("田中花子");
        System.out.println("社員ID: " + E.getEmployeeId() + "、名前: " + E.getName());

	}
}
