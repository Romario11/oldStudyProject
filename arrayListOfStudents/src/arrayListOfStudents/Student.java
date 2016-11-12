package arrayListOfStudents;

public class Student implements Comparable<Student> {
	String name;
	double rate;
	public Student(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}
	@Override
	public String toString() {
		
		return this.name+" "+this.rate;
	}
	@Override
	public int compareTo(Student s) {
		return (int)((s.rate-this.rate)*100);
		
	}
	
}
