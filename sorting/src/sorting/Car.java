package sorting;

import java.util.Comparator;

public class Car implements Comparable {
	String type;
	int price;
	int speed;
	String colour;
	int id;
	
	
	 Car(int price, String type) {
		
		this.price = price;
		this.type = type;
	}
	
	public String toString() {
		return type +" "+ price;
	}
	
	
	//public int compareTo(Object o){
	//	 return this.price - ((Car)o).price;
	// }
	public int compareTo(Object o){
		int temp= this.type.compareTo(((Car)o).type);
				if (temp==0){
					return this.price - ((Car)o).price;
				}else{
					return temp ;
				}
		 //porivnanna string
		
	}
		/* if (this.price ==((Car)o).price){
			 return 0; 
		 }
		 else
		 {
			 if (this.price > ((Car)o).price){
				 return 1;
			 }else{
				 
					 return -1;
			 }
	 }
	}	 */
	
	//public int compareTo(Object o){
	//	 return this.type.compareTo(((Car)o).type);
	 //}
	




}
class ComparatorByPrice implements Comparator {
	public int compare (Object o1, Object o2){
	 return((Car)o1).price - ((Car)o2).price;
	}
}
