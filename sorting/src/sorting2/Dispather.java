package sorting2;

import java.util.*;

public class Dispather {

	public static void main(String[] args) {
		
		Car c1 = new Car(9000,"Mers");
		Car c2 = new Car(12000,"BMW");
		Car c3 = new Car(8000,"Opel");
		Car[] cars= {c1,c2,c3};
		Arrays.sort(cars,new Comparator<Car>(){
			public int compare(Car o1, Car o2){
				return o1.speed-o2.speed;
			}
		});
		
		
		
		if (args.length==0){
			Arrays.sort(cars);
		}else{
			if (args[0].equals("1")){
				Car.ComparatorByPrice cp= new Car.ComparatorByPrice();
			}else{
				Arrays.sort(cars);
			}
			
		}
			for (int i=0; i<cars.length ; i++ ){
			
			System.out.println(cars[i]+" ");
		
		
		
		
	}

}
}
