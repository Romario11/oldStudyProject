package arguments;

public class Dispather {

	public static void main(String[] args) {
		Car c1= new Car();
		c1.price=9000;
		c1.enginePrice=2000;
		System.out.println(c1.price);
		//changeInt (c1.price, c1.enginePrice);
		changeObj(c1);
		System.out.println(c1.price);
		System.out.println(c1.enginePrice);
		
		
		
	}
	/*static void changeInt(int price, int enginePrice){
		 price = price + 500;
		enginePrice = enginePrice + 100;
		}
		*/
		
	
	static void changeObj(Car c){
		c.enginePrice= c.enginePrice+100;
		c.price= c.price+500;
	}
}
