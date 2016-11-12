package Array;

public class Dispather {

	public static void main(String[] args) {
		
		{
		int [] numbers= {47,56,9,87,12,45,3,8,36,9,94,51};
		int i=0;
		int k = 0;
		
		int min=(int) Double.POSITIVE_INFINITY;
		for(;i<numbers.length;i++){
		if(numbers[i]<min){
			min = numbers[i];
			k=i;
		}
		
		}
		System.out.println(min+" "+k);
		}
		
		
		{
			
			int [] numbers= {3,56,9,28,12,45,35,8,36,9,94,51};
			int i=0;
			int  summa = 0;
			
			
			for(;i<numbers.length;i++){
			if((numbers[i]%2==0)&&(numbers[i]>=10)&&(numbers[i]<=30)){
				summa=summa+numbers[i];
				
			}
			
			}
			System.out.println(summa);
			
			
			
			
			
		}
		//String l = "kll";
		String l="";
		String s = "kll";
		//m=(s)*5;
		for (int p =0;p<5;p++){
			
			l =l+s;
		}
		System.out.println(l);
		
		
		
		
	}

}
