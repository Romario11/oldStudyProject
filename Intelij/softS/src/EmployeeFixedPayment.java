/**
 * Created by ROMARIO on 23.12.2015.
 */
public class EmployeeFixedPayment extends Employee {
     private static double fixsalary = 3000;

    public EmployeeFixedPayment(int id, String name) {
        this.id=id;
        this.name=name;
        this.salary=getFixsalary();
    }

    public static void setFixsalary(double fixsalary) {
        EmployeeFixedPayment.fixsalary = fixsalary;
    }

    public static double getFixsalary() {
        return 3000;
    }

    @Override
    public double calculateMonthlySalary(double salary) {
        return salary;
    }


}
