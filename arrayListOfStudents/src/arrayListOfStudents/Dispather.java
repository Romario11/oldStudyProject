package arrayListOfStudents;

import java.util.ArrayList;
import java.util.Arrays;

public class Dispather {

	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList();
		al.add(new Student("Serg",4.6));
		al.add(new Student("Ann",4.5));
		al.add(new Student("Mary",4.9));
		Student [] s= new Student[al.size()];
		al.toArray(s);
		Arrays.sort(s);
		//System.out.println(s[0]);
		al = new ArrayList(Arrays.asList(s));
		System.out.println(al);
		al.add(new Student("Ivan",4.1));
		al.add(new Student("Oleg",4.7));
		System.out.println(al);

	}

}
