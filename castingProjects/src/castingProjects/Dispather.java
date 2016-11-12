package castingProjects;

public class Dispather {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		a=(Animal)c;
		a.say();
		//d=c; batko ne dorivnue cunu tilku sun moge dorivnuvatu batku
		//d=a;
		Animal a1 = new Animal();
		//d=(Dog)a1;//rterror
		//d=(Dog)a;   //rterror
		Cat c1 = (Cat) a;
		c1.say();
	}

}
