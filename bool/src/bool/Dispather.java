package bool;

public class Dispather {

	public static void main(String[] args) {
		/*
		int x= 10;
		double y=5.4;
		String s="Serg";
		boolean b= x>y ;
		boolean c = false;
		System.out.println(b);
		System.out.println(y==x);
		System.out.println(c);
		*/
		/*
		int amount = 60;
		int ticketPrice=50;
		boolean haveFriends=true;
		boolean niceWeather=true;
		boolean anoughMoney = amount >= ticketPrice;
		if (anoughMoney&niceWeather&haveFriends ){
			System.out.println("go to cinema");
		}
		else{
			System.out.println("go to home games");
		}
		*/
		
		/*boolean haveCash=false;
		boolean haveCard=false;
		if (haveCash || haveCard ){
			System.out.println("go to cinema");
		}
		else{
			System.out.println("go to home play games");
		}*/
		
		/*int x=10;
		int y=20;
		int z=100;
		if ((x+15>z-20) & (y=y+5)<z){
			System.out.println("go to cinema");
		}
		else{
			System.out.println("go to home play games");
		}*/
		
		int x= -5;
		if(x<0){
			x=-x;
		}else{
			x=x;
		}
		
		x=(x<0) ? -x:x;
		System.out.println(x);
		
	}

}
