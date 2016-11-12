package arrays;



public class Dispather {

	public static void main(String[] args) {
		int [] dates = {21, 26, 14, 5, 11, 6, 29 };
		//System.out.println(dates[1]);
	//	System.out.println(dates[7]);
		
		//String []names= {"Serg","Tanja", "Nadia"};
		//System.out.println(names.length);
		//System.out.println(args[1]);
///////////////////////////////////////////////////////////////////////////////////
		//for (int i=0; i<dates.length ; i++ ){
	//		System.out.print(dates[i]+" ");
		//}
	//	System.out.println();
		
	//	for (int i=dates.length-1; i>=0 ; i-- ){
	//		System.out.print(dates[i]+" ");
		//}
//////////////////////////////////////////////////////////////////////
	int  summa = 0;
//		for (int i=0; i<dates.length ; i++ ){
//				summa=summa+dates[i];
//			}
//		System.out.print(summa);
		
		for (int i=0; i<dates.length ; i++ ){
			if(dates[i]%2==0)
			{
				 summa=summa+dates[i];
				
			}
		}
		//System.out.print(summa);
		/////////////////////////////////////////////////////////////
		int min=(int) Double.POSITIVE_INFINITY;
		for (int i=0; i<dates.length ; i++ ){
			if(dates[i]<min){
				min=dates[i];
			}
		}
		
		System.out.print(min);
	}

}
