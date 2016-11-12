package overriding;

public class Dispather {

	public static void main(String[] args) {
		String s = new String ("Serg");
		//System.out.println(s);
		Dog d = new Dog("Doberman",150);
		Dog d1 = new Dog("Doberman",150);
		//System.out.println(d);
		String s1 = new String ("Serg");
		System.out.println(s.equals(s1));
		System.out.println(d.equals(d1));
		

	}

}
