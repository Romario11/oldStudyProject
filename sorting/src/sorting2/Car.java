package sorting2;
import java.util.Comparator;



public class Car implements Comparable<Car> {
	String type;
	int price;
	int speed;
	String colour;
	int id;
	
	
	 Car(int price, String type) {
		
		this.price = price;
		this.type = type;
	}
	 Car(){
		 
	 }
	
	 
	public String toString() {
		return type +" "+ price;
	}
	public int compareTo(Car o){
		int temp= this.type.compareTo(o.type);
				if (temp==0){
					return this.price - (o.price);
				}else{
					return temp ;
				}
		 //porivnanna string
		
	}
	
	
static public	class ComparatorByPrice implements Comparator<Car> {
		public int compare (Car o1, Car o2){
		 return(o1.price - o2.price);
		}
	}



}

