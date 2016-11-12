package loops;

public class Dispather {

	public static void main(String[] args) {
		/*
		 * int count=0;
		for(int x=1 ; x<=100 ;x++){
			if (x%7==0||x%11==0)
			{ 
				
				System.out.print(x+" ");
				//System.out.println();
				count++;
				

			}
			
		}
		System.out.println();
		System.out.print(count+" ");
		//System.out.println(x);
		//System.out.println("1");
		//System.out.println("2");
		//System.out.println("3");
		//System.out.println("4");
		//System.out.println("5");
		 */
///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		for(int row=1 ; row<=3 ;row++){
			for(int column=0 ; column<=9 ;column++){
			System.out.print(column+row*10+" ");
			}
			System.out.println();
		}
		
	}
	
}
