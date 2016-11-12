package vektorCalculator;

public class Dispather {

	public static void main(String[] args) {
		Vector v1 = new Vector(3,6);
		Vector v2 = new Vector(2,4);
		int k = 8;
		View.display(Controller.add(v1, v2));
		View.displayInt(Controller.scalarMultiply(v1, v2));
		View.displayDouble(Controller.length(v1));
		View.display(Controller.vectorMultiply(v1, k));
		

	}

}
