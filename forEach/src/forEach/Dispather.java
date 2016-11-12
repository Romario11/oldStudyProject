package forEach;

public class Dispather {

	public static void main(String[] args) {
		int [] x = {2,6,4,9,7};
		Car [] c = {new Car(9000),new Car(7000),new Car(10000)};
	//	for (int i = 0;i<x.length;i++){
	//		++x[i];
	//	}
	//	for (int i = 0;i<x.length;i++){
	//		System.out.println(x[i]);
	//	}
		for(int temp: x){
				++temp;
			}
		for(int temp: x){
			System.out.println(temp);
		
		}
		
		for(Car temp: c){
			temp.price+=100;
		}
		for(Car temp: c){
		System.out.println(temp.price);
	}
	
	}
}
