package calculator;

public class Dispatcher {

	public static void main(String[] args) {
		
		Model m1 = new Model(50,8);
		//m1.x=50;
		//m1.y=8;
		
		//Model m2 = new Model(30,21);
		//m2.x=30;
		//m2.y=21;
		
		//Controller c = new Controller();
		int summa = Controller.add (m1);
		int minus = Controller.substruct(m1) ;
		int multply= Controller.multiply(m1);
		double division = Controller.devide(m1);
		
		//View v = new View();
		View.displayInt(summa);
		View.displayInt(minus);
		View.displayInt(multply);
		View.displayDouble(division);
		
		
		// TODO Auto-generated method stub

	}

}
