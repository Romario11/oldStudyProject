package dates;

import java.util.*;
import static java.util.Calendar.*;
public class Dispather {

	public static void main(String[] args) {
		//GregorianCalendar gc = new GregorianCalendar(2015,MARCH,11);
		GregorianCalendar gc = new GregorianCalendar();
		
		gc.set(MONTH, DECEMBER);
		gc.set(DAY_OF_MONTH, 21);
		gc.add(DAY_OF_MONTH, 12);
		System.out.println(gc.get(YEAR));
		System.out.println(gc.get(DAY_OF_MONTH));
		System.out.println(gc.get(MONTH));
		System.out.println(gc.get(DAY_OF_WEEK));
		//System.out.println(gc.get(DAY_OF_WEEK));
		Date d = gc.getTime();// Convert gc to Date
		Date dateFromDb = new Date();
		GregorianCalendar gcFromDb = new GregorianCalendar();
		gcFromDb.setTime(dateFromDb); // Convert Date to GC
		
		
	}

}
