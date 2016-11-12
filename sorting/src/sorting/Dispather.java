package sorting;

import java.util.Arrays;

public class Dispather {

	public static void main(String[] args) {
		/*int [] dates = {21,26,24,7,12,10,29};
		String [] names =  {"Serg","Tanja","Oleh","Olja"};
		Arrays.sort(dates);
		Arrays.sort(names);
		for (int i=0; i<dates.length ; i++ ){
			
				System.out.print(dates[i]+" ");
				
			}
		System.out.println();
		for (int i=0; i<names.length ; i++ ){
			
			System.out.print(names[i]+" ");
			
		}*/
		Car c1 = new Car(9000,"Mers");
		Car c2 = new Car(12000,"BMW");
		Car c3 = new Car(8000,"Opel");
		Car[] cars= {c1,c2,c3};
		if (args.length==0){
			Arrays.sort(cars);
		}else{
			if (args[0].equals("1")){
				Arrays.sort(cars, new ComparatorByPrice());
			}else{
				Arrays.sort(cars);
			}
			
		}
			for (int i=0; i<cars.length ; i++ ){
			
			System.out.println(cars[i]+" ");
		
		
		
		
		/*Arrays.sort(cars);
		for (int i=0; i<cars.length ; i++ ){
			
			System.out.println(cars[i]+" ");
			
			
		}
		System.out.println();
		ComparatorByPrice cm = new ComparatorByPrice();
		Arrays.sort(cars,cm);
		for (int i=0; i<cars.length ; i++ ){
			
			System.out.println(cars[i]+" ");
			
			
		}*/
	}

}
}
