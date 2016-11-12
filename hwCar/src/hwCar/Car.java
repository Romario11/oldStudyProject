package hwCar;



public class Car {
	String type;
	int maxSpeed;
	String colour;
	int produceYear;
	int price;
	Car(String type, int maxSpeed, String colour, int produceYear, int price){
		this.colour=colour;
		this.maxSpeed=maxSpeed;
		this.type=type;
		this.produceYear=produceYear;
		this.price=price;
			}
	Car(){}
	public boolean equals (Object o){
		return this.type.equals(((Car)o).type)&&this.price==((Car)o).price;
	}
	public String toString(){
		return type +" "+price ;
	}

	
}
