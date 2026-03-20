package curriculum.k;

public class ContractEmployee implements Payable {
    private String name;
    private int hours;

    public ContractEmployee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public int calculateSalary() {
        return hours * 1000;
    }

    @Override
    public String getName() {
        return name;
    }
}
