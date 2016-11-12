package exceptions;
import java.io.*;

public class Dispather  {

	public static void main(String[] args) throws IOException {
		
		try{
			m();
		}catch (Exception e){}
		
	File f = new File("D:/Users/nAz/workspace/exceptions/src/exceptions/f1");
	
	System.out.println(f.length());
	
	File f2 = new File("D:/Users/nAz/workspace/exceptions/src/exceptions/f2");
	
	//try{
		f2.createNewFile();
	//}catch (IOException e){}
	
	}
	
static void m(){
	int [] x= {2,5,4,8,1};
	int y=0;
	System.out.println(x[1]+y);
	//try {
	System.out.println(x[2]/y);
	//System.out.println(x[6]-y);
	//}
	//}catch(ArithmeticException ae) {
	//catch(ArrayIndexOutOfBoundsException ai) {
		
	//	System.out.println(ai);
	
	//}catch(RuntimeException ae) {
		//System.out.println("devide by zero");
		//System.out.println(y);
	//	System.out.println(ae);
	//}
	//}try {
		
		//System.out.println(x[6]-y);
		//}
	//catch(ArrayIndexOutOfBoundsException ai) {
		
	//	System.out.println(ai);
	//}
System.out.println("end");
	}
	
}


