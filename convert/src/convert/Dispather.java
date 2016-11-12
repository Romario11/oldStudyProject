package convert;

import java.util.*;



public class Dispather {

	public static void main(String[] args) {
		Integer [] a = {4,8,3,2,9};
		List <Integer> al = Arrays.asList(a);
		al.set(1, 5);
		System.out.println(al);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//al.add(1);
		ArrayList<Integer> al1= new ArrayList( Arrays.asList(a));// перетворення масиву в колекцію
		al1.add(1);
		al1.set(0, 7);
		System.out.print(al1);
		System.out.println();
		Integer [] a1= new Integer[al1.size()]; //перетворення   колекцію в  масиву
		al1.toArray(a1);						//перетворення   колекцію в  масиву
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]+" ");
		}
		
	}

}
