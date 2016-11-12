package blocks;

public class Dispather {
	static {
	System.out.println("Start!");
	}
	{
		System.out.println("Start non-static!");
		}
	public static void main(String[] args) {
	System.out.println("Main!");
	new Dispather();

	}

}
