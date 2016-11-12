import package1.*;
import package2.*;
import static package1.Test3.b;
import static java.lang.Math.*;
public class Dispather {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		package2.Test2 t2 = new Test2();
		//System.out.println(t1.x1);
		System.out.println(t2.x2);
		System.out.println(b);
		Test3 t3 = new Test3();
		double length = sqrt(pow(b,3)+pow(t1.x1,3));
	}

}
