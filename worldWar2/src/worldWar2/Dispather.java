package worldWar2;

import java.util.*;

public class Dispather {

	public static void main(String[] args) {
		GregorianCalendar start = new GregorianCalendar(1939,8,1,0,0,0);
		GregorianCalendar end = new GregorianCalendar(1945,8,2,0,0,0);
		long duration = end.getTimeInMillis()-start.getTimeInMillis();
		System.out.println(Dispather.milisToDays(duration));	 
	}
	public static long milisToDays (long a) {
		return a/1000/60/60/24  ;
	}

}
