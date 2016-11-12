package temp;

public class Dispather {
 static	int x = 40;
 static {
 System.out.println(x);
 }
	public static void main(String[] args) {
		System.out.println(Test.z);
		int x= 10;
		
		Test.change();
		//System.out.println(Test.z);
		int y;
		y=10;
		y=y+1;
		System.out.println(x);
		System.out.println(y);
		//System.out.println(Test.z);
		// TODO Auto-generated method stub

	}

}
class Test{
	//int x = 20;
	//static int z = Distather.x ;
	static int z;
	static void change(){
		z = Dispather.x;
		System.out.println(Test.z);
	}
	
}
