package worldWar2Times;

import java.util.*;

import static java.util.Calendar.*;



class Dates extends GregorianCalendar {
	public boolean equals (Object o){
		return  this.get(DAY_OF_MONTH) ==(((Dates)o).get(DAY_OF_MONTH))&&this.get(DAY_OF_YEAR) ==(((Dates)o).get(DAY_OF_YEAR))&&
				this.get(DAY_OF_WEEK) ==(((Dates)o).get(DAY_OF_WEEK));
	}
}



public class Dispather  {
	
	
	//static boolean eQuals (GregorianCalendar a, GregorianCalendar b )
	//{
	//	return a.get(DAY_OF_MONTH)==b.get(DAY_OF_MONTH)&&a.get(DAY_OF_WEEK)==b.get(DAY_OF_WEEK)&&a.get(DAY_OF_YEAR)==b.get(DAY_OF_YEAR);
	//}
	 /*!eQuals(start,end)*/
	public static void main(String[] args) {
		
		Dates start = new Dates();
		start.set(1939, 8, 1, 0, 0, 0);
		Dates end = new Dates();
		end.set(1945, 8, 2, 0, 0, 0);
		int days=0;
		
		
		for(; !start.equals(end)  ;  start.add(DAY_OF_MONTH, 1))
		{
			
			days++;
			
		}
		
		
		System.out.println(days);
		
		System.out.println();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//start.get(YEAR)<=end.get(YEAR)
		
		// Date e = end.getTime();
		// System.out.println(e);
		// System.out.println(start.getTimeInMillis());
		//long p = end.getTimeInMillis() - start.getTimeInMillis();
		//long days = p / 1000 / 60 / 60 / 24;
		//System.out.println(days);
		
		
		
		
		// Date g=e-d;
		// start.get(DAY_OF_MONTH);
		// GregorianCalendar sdd = new GregorianCalendar();
		// sdd.setTimeInMillis(p);
		// System.out.println(sdd.set);
		// for(start.get(DAY_OF_MONTH) ; start.getTime()<=end.getTime();
		// start.add(DAY_OF_MONTH,1)){

		// System.out.println(start.get(DATE));
		// }

	}

}
