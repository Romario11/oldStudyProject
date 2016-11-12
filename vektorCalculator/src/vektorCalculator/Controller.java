package vektorCalculator;

public class Controller {
	static Vector add(Vector v1, Vector v2)
	{
		Vector result = new Vector();
		result.ox=v1.ox+v2.ox;
		result.oy=v1.oy+v2.oy;
		return result;
	}
	static int scalarMultiply (Vector v1, Vector v2){
		int resultInt = v1.ox*v2.ox+v1.oy*v2.oy;
	 return resultInt;
	}
	static double length(Vector v1){
		double  resultDouble = Math.sqrt(v1.ox*v1.ox+v1.oy*v1.oy);
		return resultDouble;
		
	}
	static Vector vectorMultiply(Vector v1,int k){
		Vector result = new Vector();
		result.ox=v1.ox*k;
		result.oy=v1.oy*k;
		return result;
		
		
	}
	

}
