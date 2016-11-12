package arrays1;

import java.util.*;

public class Dispather {

	public static void main(String[] args) {
		int [] ar={8,2,5,4,1};// 3  -3  6  -5      7  -5
		Arrays.sort(ar);
		//System.out.println(Arrays.binarySearch(ar, 10));
		int [] [] ar2={{5,2},{6,8,3},{1,7},{5,3,4,8}};
		System.out.println(ar2 [3][2]);
		Dog d1=new Dog("rex");
		Dog d2=new Dog("jack");
		Dog d3=new Dog("jesi");
		 Dog [] d={d1,d2,d3};
		 Dog [][] dm=new Dog[4][];
		 dm[0]=d;
		
		
	}

}
class Dog{
	String name;

	public Dog(String name) {
	
		this.name = name;
	}

	@Override
	public String toString() {
		return  this.name;
	}
	
}