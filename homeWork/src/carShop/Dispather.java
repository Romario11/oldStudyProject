package carShop;

import java.util.Arrays;

public class Dispather {

	public static void main(String[] args) {
		Car.ComparatorByColour cc =new Car.ComparatorByColour();
		Car.ComparatorBySpeed cs=new Car.ComparatorBySpeed();
		Car.ComparatorByIde ci= new Car.ComparatorByIde();
		Car.ComparatorByPrice cp =new Car.ComparatorByPrice();
		Car c0 = new Car("Mers",9000,320,"Black",10);
		Car c1 = new Car("BMW",8300,260,"Red",13);
		Car c2 = new Car("WV",15000,280,"Green",18);
		Car c3 = new Car("Audi",12500,275,"Yellow",21);
		Car c4 = new Car("Chewrole",9000,285,"Black",25);
		Car c5 = new Car("Mazeratti",25000,350,"Red",28);
		Car c6 = new Car("Volvo",7300,220,"Green",30);
		Car c7 = new Car("Pontiac",45000,200,"Red Flame",33);
		Car c8 = new Car("Skoda",22000,230,"Blue",45);
		Car c9 = new Car("Mers",15000,400,"Black",50);
		Car [] cars={c0,c1,c2,c3,c4,c5,c6,c7,c8,c9};
		View.showArray(cars);
		System.out.println();
		if(args.length==0){
			Arrays.sort(cars);
		}else{
			if(args[0].equals("colour")){
				Arrays.sort(cars,cc);
			}
			else if(args[0].equals("speed")){
				Arrays.sort(cars,cs);
			}
			else if(args[0].equals("id")){
				Arrays.sort(cars,ci);
			}
			else if(args[0].equals("price")){
				Arrays.sort(cars,cp);
			}
		}
		View.showArray(cars);
		
		
	}

}
