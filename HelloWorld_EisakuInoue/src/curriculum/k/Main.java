package curriculum.k;

public class Main {
    public static void main(String[] args) {
        Payable emp1 = new FullTimeEmployee("佐藤", 8);
        Payable emp2 = new ContractEmployee("田中", 6);

        SalaryReporter reporter = new SalaryReporter();
        reporter.print(emp1);
        reporter.print(emp2);
    }
}
