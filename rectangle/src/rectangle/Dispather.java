package rectangle;

public class Dispather {

	public static void main(String[] args) {
		
		Point a = new Point(2,3);
		Point b = new Point(9,7);
		Rectangle f1= new Rectangle(a,b);
		
		Point c = new Point(-1,7);
		Point d = new Point(7,12);
		Rectangle f2= new Rectangle(c,d);
		
		if(Controller.resultRectangle(f1, f2)){
			View.resultRectangle();
		}
		else if(Controller.resultHorizontalLine(f1, f2)){
			View.resultHorizontalLine();
		}
		else if(Controller.resultVericalLine(f1, f2)){
			View.resultVericalLine();
		}
		else if(Controller.resultPoint(f1, f2)){
			View.resultPoint();
		}
		else{
			View.resultNotCross();
		}
		
		
		
		
		
		
		
		//Controller2.crossingRectangle(f1, f2);
		
//System.out.println(f2.c.x+" "+f2.d.y);
	}

}
