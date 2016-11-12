package drobu;

public class Dispatcher {

	public static void main(String[] args) {
		Model d1 = new Model(1,2);
		Model d2 = new Model(1,2);
		View.display(Controll.sum(d1, d2));

	}

}
