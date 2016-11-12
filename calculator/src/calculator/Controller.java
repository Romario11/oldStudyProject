package calculator;

public class Controller {
	static int add (Model m) {
		//int summa=a+b;
		return m.x+m.y;
	}
	
	static int substruct (Model m) {
		return m.x-m.y;
	}
	
	static int multiply (Model m) {
		return m.x*m.y;
	}
	
	static double devide (Model m) {
		return (double)m.x/m.y;
	}

}
