package arrayLists;

import java.util.*;


public class Dispather {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		
		al.add("Serg");
		al.add(4);
		al.add(new Dog("rex"));
		al.add(1, "ivan");
		al.add(2, 8);
		
		//int [] a = {4,1,7};
		//al.add(4, a);
		
		System.out.println(al.size());
	//	System.out.println(al.contains(new Dog("rex")));
		
		
		//ArrayList al1= new ArrayList();
		//al1.add("Mary");
		//al1.add("Serg");
		//al.set(4, 10);
		//al.add(al1);
		
		//al.addAll(al1);
		//System.out.println(al.size());
		//System.out.println(al.get(3));
		System.out.println(al);
		//System.out.println(al.indexOf(new Dog("rex")));
		//String s=(String)al.remove(0);
		System.out.println(al);
		//System.out.println(s);
		List sub= al.subList(3, al.size());
		System.out.println(al);
		System.out.println(sub);
		
	}

}
