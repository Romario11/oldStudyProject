
import java.io.*;
import java.util.*;

public abstract class Employee implements Comparable<Employee>, Serializable {

	int id;
	String name;
	double salary;

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", salary=" + salary +
				'}';
	}

	abstract public double calculateMonthlySalary(double hr);


	public int compareTo(Employee arg) {

		int temp = (int) (this.salary * 100 - arg.salary * 100);
		if (temp == 0) {
			return this.name.compareTo(arg.name);
		} else {
			return temp;
		}

	}
}

