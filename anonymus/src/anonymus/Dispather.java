package anonymus;

public class Dispather {

	public static void main(String[] args) {
		Animal dog = new Animal(){
		void	say(){
			System.out.println("woof");
		}
		};
dog.say();
	}

}
