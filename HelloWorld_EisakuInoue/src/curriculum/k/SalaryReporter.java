package curriculum.k;

public class SalaryReporter {
    public void print(Payable p) {
        System.out.println(p.getName() + "の給料は" + p.calculateSalary() + "円");
    }
}
