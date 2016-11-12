package rectangle;

public class Controller {
	static boolean resultRectangle(Rectangle f1,Rectangle f2){
		return f1.b.x>f2.c.x  &  f2.d.y>f1.a.y  &  f1.b.y>f2.c.y & f2.d.x>f1.a.x;
		}
	static boolean resultVericalLine(Rectangle f1,Rectangle f2){
		return (f1.b.x==f2.c.x  &  f2.d.y>f1.a.y  &  f1.b.y>f2.c.y & f2.d.x>f1.a.x )|
				(f1.b.x>f2.c.x  &  f2.d.y>f1.a.y  &  f1.b.y>f2.c.y & f2.d.x==f1.a.x);
	}
	static boolean resultHorizontalLine(Rectangle f1,Rectangle f2){
		return (f1.b.x>f2.c.x  &  f2.d.y==f1.a.y  &  f1.b.y>f2.c.y & f2.d.x>f1.a.x )|
				(f1.b.x>f2.c.x  &  f2.d.y>f1.a.y  &  f1.b.y==f2.c.y & f2.d.x>f1.a.x);
	}
	static boolean resultPoint(Rectangle f1,Rectangle f2){
		return (f1.b.x==f2.c.x & f2.d.y==f1.a.y)|(f1.b.x==f2.c.x & f1.b.y==f2.c.y)|
				(f1.b.y==f2.c.y & f2.d.x==f1.a.x)|(f1.a.x==f2.d.x & f1.a.y==f2.d.y);
	}
}
