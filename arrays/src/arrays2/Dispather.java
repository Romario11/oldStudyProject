package arrays2;

public class Dispather {

	public static void main(String[] args) {
		/*
		int [] x1 = {21, 26, 14, 5, 11, 6, 29 };
		int [] x2 = {18, 31, 17, 21, 13, 8, 16 };
		int  []rezult= new int[x1.length];
		for(int i=0;i<x1.length;i++){
			rezult[i]=x1[i]+x2[i];
		}
		
		for(int i=0;i<rezult.length;i++){
			System.out.print(rezult[i]+" ");
		}
		*/
////////////////////////////////////////////////////////////////////////////		
		/*
		int [] x = {21, 26, 14, 5, 11, 6, 29 };
		int [] y = {18, 31, 17, 21};
		int  []rezult= new int[x.length+y.length];
		for(int i=0;i<x.length;i++){
			rezult[i]=x[i];
		}
		for(int i=0;i<x.length;i++){
			rezult[ i + x.length]=y[i];
		}
		for(int i=0;i<rezult.length;i++){
			System.out.print(rezult[i]+" ");
		}
		*/
///////////////////////////////////////////////////////////////////////////////////
		/*
		int [] x = {21, 26, 14, 5, 11, 6, 23 };
		
		int  []rezult= new int[x.length-2];
		int j=0;
		int max = (int) Double.NEGATIVE_INFINITY;
		int min = (int) Double.POSITIVE_INFINITY;
		
		
		for(int i=0;i<x.length;i++){
		if(x[i]<min){
			min=x[i];
		}
		if(x[i]>max){
			max=x[i];
		}
		}
		//System.out.print(max+" ");
		//System.out.print(min+" ");
		for(int i=0;i<x.length;i++){
			if(x[i]!=max && x[i] !=min){
				rezult[j++]=x[i];
			}
			
		}
		
		for(int i=0;i<rezult.length;i++){
			System.out.print(rezult[i]+" ");
		}
		*/
///////////////////////////////////////////////////////////////////////////
		int [] x = {21, -26, -14, 5, -11, 6, 23 };
		int countNeg=0;
		for(int i=0;i<x.length;i++){
			if(x[i]<0){
				countNeg++;
			}
			}
		//System.out.print(countNeg+" ");
		int [] neg = new int [countNeg];
		int [] pos = new int [x.length-countNeg];
		int [] indexNeg =  new int [countNeg];
		int n = 0;
		int p = 0;
		for(int i=0;i<x.length;i++){
			if(x[i]<0){
				neg[n]=x[i];
				indexNeg [n++]= i;
			}else{
				pos[p++]=x[i];
			}
			
		}
		for(int i=0;i<neg.length;i++){
			System.out.print(neg[i]+" ");
			}
		System.out.println();
		
		for(int i=0;i<pos.length;i++){
			System.out.print(pos[i]+" ");
			}
		System.out.println();
		for(int i=0;i<indexNeg.length;i++){
			System.out.print(indexNeg[i]+" ");
			}
		
		
		
		
		
		
	}

}
