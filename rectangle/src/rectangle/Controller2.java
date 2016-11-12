package rectangle;

public class Controller2 {
	static void crossingRectangle(Rectangle f1,Rectangle f2){
		if (f1.b.x>f2.c.x  &  f2.d.y>f1.a.y  &  f1.b.y>f2.c.y & f2.d.x>f1.a.x  ){
			System.out.println("Result of crossing is Rectangle");
			
		}else if((f1.b.x==f2.c.x  &  f2.d.y>f1.a.y  &  f1.b.y>f2.c.y & f2.d.x>f1.a.x )|
				(f1.b.x>f2.c.x  &  f2.d.y>f1.a.y  &  f1.b.y>f2.c.y & f2.d.x==f1.a.x))
		 {
			System.out.println("Result of crossing is verical line");
			
		}else if((f1.b.x>f2.c.x  &  f2.d.y==f1.a.y  &  f1.b.y>f2.c.y & f2.d.x>f1.a.x )|
				(f1.b.x>f2.c.x  &  f2.d.y>f1.a.y  &  f1.b.y==f2.c.y & f2.d.x>f1.a.x))
		{
			System.out.println("Result of crossing is horizontal line");
			
		}else if((f1.b.x==f2.c.x & f2.d.y==f1.a.y)|(f1.b.x==f2.c.x & f1.b.y==f2.c.y)|
				(f1.b.y==f2.c.y & f2.d.x==f1.a.x)|(f1.a.x==f2.d.x & f1.a.y==f2.d.y)){
			System.out.println("Result of crossing is point");
			
		}else{
			System.out.println("Rectangle is not crossing");
		}
	}

}
