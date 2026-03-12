package curriculum.h;

public class FullTimeEmployee extends Employee {
    private static final int HOURLY_RATE = 1200;

    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {
        if (hoursWorked <= 8) {
            return hoursWorked * HOURLY_RATE;
        } else {
            int overtime = hoursWorked - 8;
            return (8 * HOURLY_RATE) + (int)(overtime * HOURLY_RATE * 1.25);
        }
    }
}

