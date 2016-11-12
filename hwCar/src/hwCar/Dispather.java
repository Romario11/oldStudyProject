package hwCar;

public class Dispather {

	public static void main(String[] args) {
		
		Car Mers = new Car("Mers" , 300 , "Black" ,2013 ,25000);
		Car Skoda = new Car("Skoda" , 230 , "Red" ,2010 ,22000);
		Car BMW = new Car("BMW" , 280 , "Green" ,2008 ,18000);
		Car WV = new Car("WV" , 250, "Yellow" ,2015 ,15000);
		Car [] c = {Mers,Skoda,BMW,WV};
		Car Finder = new Car("WV",300,"Black",2014,15000);
		

			for (int i=0;i<c.length; i++ )
				
					if(Finder.equals(c[i]))
						
					{
					System.out.println("Your car is "+c[i]);
					}
			
					//else
					//{
					//	System.out.println("Your car is not found ");
					//	;
				//}
					
				

		
		

   
		

	}

}
