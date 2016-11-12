package arrays3;

public class Dispather {

	public static void main(String[] args) {
		/*
	}
int [] x = {6,3,4,5,3,7,5,8,2,9,6,9,2,5,3,2,9,6,7,9,8,4 };
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
		int countExtrem=0;
		for(int i=0;i<x.length;i++){
			if(x[i]==min||x[i]==max){
				countExtrem++;
			}
		}
		int  []rezult= new int[x.length-countExtrem];
		int j=0;
		for(int i=0;i<x.length;i++){
			if(x[i]!=min&&x[i]!=max){
				rezult[j++]=x[i];
			}}
		for(int i=0;i<rezult.length;i++){
			System.out.print(rezult[i]+" ");
		}
		*/
	////////////////////////////////////////////////////////////////////
		int [] x = {6,3,4,5,3,7,5,8,2,9,6,9,2,5,3,2,9,6,7,9,8,4 };
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
				int countExtrem=0;
				boolean wasFirstMax=false;
				boolean wasFirstMin=false;
				for(int i=0;i<x.length;i++){
					if(x[i]==min||x[i]==max){
						countExtrem++;
					}
				}
				int  []rezult= new int[x.length-countExtrem+2];
				int j=0;
				for(int i=0;i<x.length;i++){
					if(x[i]!=min&&x[i]!=max){
						rezult[j++]=x[i];
					}
					
					if(x[i]==min&&!wasFirstMin){
						rezult[j++]=x[i];
						wasFirstMin=true;
						
					}
					if(x[i]==max&&!wasFirstMax){
						rezult[j++]=x[i];
						wasFirstMax=true;
						
					}
					
					
					
					
				}
				for(int i=0;i<rezult.length;i++){
					System.out.print(rezult[i]+" ");
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
