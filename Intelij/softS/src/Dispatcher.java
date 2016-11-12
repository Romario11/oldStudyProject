

import java.io.*;
import java.util.*;

public class Dispatcher {
	public static void main(String[] args) {
		EmployeeAverageMonthlySalary e1 = new EmployeeAverageMonthlySalary (new Random().nextInt(100), "Ivan", 20.2);
		EmployeeAverageMonthlySalary e2 = new EmployeeAverageMonthlySalary (new Random().nextInt(100), "Serg", 20.1);
		EmployeeFixedPayment e3 = new EmployeeFixedPayment (new Random().nextInt(100), "Anton");
		EmployeeFixedPayment e4 = new EmployeeFixedPayment (new Random().nextInt(100), "Mary");
		EmployeeAverageMonthlySalary e5 = new EmployeeAverageMonthlySalary (new Random().nextInt(100), "Serg", 23);
		EmployeeAverageMonthlySalary e6 = new EmployeeAverageMonthlySalary (new Random().nextInt(100), "Anton", 26.2);
		EmployeeAverageMonthlySalary e7 = new EmployeeAverageMonthlySalary (new Random().nextInt(100), "Mary", 16.4);

		ArrayList <Employee> al = new ArrayList ();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);
		for (Employee a: al) {
			System.out.println(a);
		}



	}












































/*
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e1 = new Employee (01, "Ivan", Employee.calculateAverageMonthlySalary(20.2));
		Employee e2 = new Employee (02, "Serg", Employee.calculateAverageMonthlySalary(20.1));
		Employee e3 = new Employee (03, "Anton", Employee.calculateFixedPayment());
		Employee e4 = new Employee (04, "Mary", Employee.calculateFixedPayment());
		Employee e5 = new Employee (05, "Serg", Employee.calculateAverageMonthlySalary(23.1));
		Employee e6 = new Employee (06, "Anton", Employee.calculateAverageMonthlySalary(26.2));
		Employee e7 = new Employee (07, "Mary", Employee.calculateAverageMonthlySalary(16.4));


		
		ArrayList <Employee> al = new ArrayList ();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);
		
		File f1 = new File ("f1");

		ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream(f1));
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		oos.writeObject(e4);
		oos.writeObject(e5);
		oos.writeObject(e6);
		oos.writeObject(e7);
		oos.flush();
		oos.close();

		ObjectInputStream ois = new ObjectInputStream (new FileInputStream(f1));

		Employee e1_New = (Employee)ois.readObject();
		Employee e2_New = (Employee)ois.readObject();
		Employee e3_New = (Employee)ois.readObject();
		Employee e4_New = (Employee)ois.readObject();
		Employee e5_New = (Employee)ois.readObject();
		Employee e6_New = (Employee)ois.readObject();
		Employee e7_New = (Employee)ois.readObject();
		ois.close();
		ArrayList <Employee> al2 = new ArrayList ();
		al2.add(e1_New);
		al2.add(e2_New);
		al2.add(e3_New);
		al2.add(e4_New);
		al2.add(e5_New);
		al2.add(e6_New);
		al2.add(e7_New);
		
		*//*System.out.println(e5_New.id);
		System.out.println(e6_New.id);
		System.out.println(e7_New.id);	*//*
		Collections.sort(al2);
		for (int i=0;i<al2.size();i++){
			System.out.println(al2.get(i));
		}


		for (int i=al.size()-3;i<al.size();i++){
			System.out.println(al.get(i).id);
		}
		
		*//*for (Employee e : al){
			System.out.println(e);
		}*//*

		for (int i=0;i<5;i++){
			System.out.println(al.get(i));
		}


	}*/

}
