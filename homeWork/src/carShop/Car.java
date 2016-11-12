package carShop;

import java.util.Comparator;



public class Car implements Comparable {
	String type;
	int price;
	int speed;
	String colour;
	int id;
	Car(String type, int price, int speed, String colour, int id) {
		
		this.type = type;
		this.price = price;
		this.speed = speed;
		this.colour = colour;
		this.id = id;
	}
	@Override
	public String toString() {
		return type + ", price=" + price + ", speed=" + speed + ", colour=" + colour + ", id=" + id;
	}
	@Override
	public int compareTo(Object o) {
		
		int temp= this.type.compareTo(((Car)o).type);
		if (temp==0){
		return	this.price-((Car)o).price;
		}else{
			return temp;
		}
	}
	
	static class ComparatorByColour implements Comparator {
		public int compare (Object o1, Object o2){
		 return((Car)o1).colour.compareTo(((Car)o2).colour);
		}
	}
	static	class ComparatorBySpeed implements Comparator {
			public int compare (Object o1, Object o2){
			 return((Car)o1).speed - ((Car)o2).speed;
			}
		}
	static	class ComparatorByIde implements Comparator {
				public int compare (Object o1, Object o2){
				 return((Car)o1).id - ((Car)o2).id;
				}
			}
	static	class ComparatorByPrice implements Comparator {
		public int compare (Object o1, Object o2){
		 return((Car)o1).price - ((Car)o2).price;
		}
	}
	
	
}
