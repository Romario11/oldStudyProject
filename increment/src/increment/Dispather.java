package increment;

public class Dispather {

	public static void main(String[] args) {
		int x =51;
		int y = 9;
		if(x%2==0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
		/*
		System.out.println(++x);
		System.out.println(y++);
		System.out.println(y);*/
		//x+=7;
		//System.out.println(x);
		//x=++x;
		//++x;
		//x++;
		//x=x+1;
		//x=x++;  //10!!!!!!!!!!!!
				//System.out.println(x);
		System.out.println(x/y); //6
		System.out.println(x%y); //2
		
	}
}