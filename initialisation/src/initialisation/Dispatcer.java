package initialisation;

public class Dispatcer {
	Dispatcer(){
		System.out.println("New Dispatcer");
	}
	
	static int a=10;
	int c = 40;
	static Dog dg = new Dog(50);

	public static void main(String[] args) {
		int b=20;
		System.out.println(b);
		System.out.println(a);
		Dispatcer d= new Dispatcer();
		System.out.println(d.c);
		System.out.println(d.dg.price);

	}
	

}
class Dog{
	int price;
	Dog(int p){
		price = p;
		System.out.println("Create dog");
		
	}
}