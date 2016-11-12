import package1.Animal;


public class Dispather extends Animal {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Dog d = new Dog();
		Dispather ds= new Dispather();
		System.out.println(a.forAll);
		//System.out.println(a.forMeOnly);
		//System.out.println(a.forMyPackeg);
		System.out.println(ds.forMySonsFromOtherPackeg);
		System.out.println(d.temp4);
		System.out.println(a.getForMeOnly());
		
	}

}
