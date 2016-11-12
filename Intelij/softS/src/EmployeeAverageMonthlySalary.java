/**
 * Created by ROMARIO on 23.12.2015.
 */
public class EmployeeAverageMonthlySalary extends Employee {
    double hr;

    public EmployeeAverageMonthlySalary(int id, String name, double hr) {
       this.id=id;
        this.name=name;
        this.salary=this.calculateMonthlySalary(hr);

    }

    public  double calculateMonthlySalary(double hr) {
        return 20.8*8*hr;

    }


}
