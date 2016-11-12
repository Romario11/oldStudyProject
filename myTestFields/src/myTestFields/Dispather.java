package myTestFields;

public class Dispather {
	 int i;

	public static void main(String[] args) {

		Dispather dis = new Dispather();
		Model m = new Model();
		int k = dis.i + 1 + Model.p + dis.hor();
		System.out.println(k);

	}

	int hor() {
		int jjj = 12 + i;

		return jjj;

	}

}
