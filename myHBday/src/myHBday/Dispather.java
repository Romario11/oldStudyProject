package myHBday;

import java.util.GregorianCalendar;

import static java.util.Calendar.*;
//import static java.util.GregorianCalendar.*;
public class Dispather {

	public static void main(String[] args) {
		GregorianCalendar bDay = new GregorianCalendar(2010,MARCH,11);
		for(;bDay.get(YEAR)<=2020;bDay.add(YEAR, 1)){
			
			
			if (bDay.get(DAY_OF_WEEK)==1){
				
				System.out.println(bDay.get(YEAR)+" Неділя");
			}
				else if (bDay.get(DAY_OF_WEEK)==2){
					System.out.println(bDay.get(YEAR)+" Понеділок");
			}
				else if (bDay.get(DAY_OF_WEEK)==3){
					System.out.println(bDay.get(YEAR)+" Вівторок");
			}
				else if (bDay.get(DAY_OF_WEEK)==4){
					System.out.println(bDay.get(YEAR)+" Середа");
			}
				else if (bDay.get(DAY_OF_WEEK)==5){
					System.out.println(bDay.get(YEAR)+" Четвер");
			}
				else if (bDay.get(DAY_OF_WEEK)==6){
					System.out.println(bDay.get(YEAR)+" П'ятниця");
			}
				else{System.out.println(bDay.get(YEAR)+" Субота");}
			
		}

	}

}
