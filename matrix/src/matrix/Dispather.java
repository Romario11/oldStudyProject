package matrix;

import java.util.*;

public class Dispather {

	public static void main(String[] args) {
		int min=(int)Double.POSITIVE_INFINITY;
		int max=(int)Double.NEGATIVE_INFINITY;
		int indexOfMin=0;
		int indexOfMax=0;
		Integer [][] a = {{1, 2,  3, 4, 5, 6, 7, 8, 9},
					      {10,11,12,13,14,15,16,17,18},	
					      {19,20,21,22,23,24,25,26,27},
					      {28,29,30,31,32,33,34,35,36}};
		
		for (int i=0;i<a.length;i++){
		for (int k=0;k<a[i].length;k++){
			if(max<a[i][k]){
				max= a[i][k];
				indexOfMax=k;
				}}}
		System.out.println(max+" "+indexOfMax);
		
		for (int i=0;i<a.length;i++){
			for (int k=0;k<a[i].length;k++){
				if(min>a[i][k]){
					min= a[i][k];
					indexOfMin=k;
					}}}
			System.out.println(min+" "+indexOfMin);
		//everything below it magic) ))
		 ArrayList< ArrayList<Integer>> al = new ArrayList(Arrays.asList(a));
		 ArrayList al0 = new ArrayList(Arrays.asList(a[0]));
		 ArrayList al1 = new ArrayList(Arrays.asList(a[1]));
		 ArrayList al2 = new ArrayList(Arrays.asList(a[2]));
		 ArrayList al3 = new ArrayList(Arrays.asList(a[3]));
		 al.set(0, al0);
		 al.set(1, al1);
		 al.set(2, al2);
		 al.set(3, al3);
		 //al.set(1, 0);
		
		
		 if(al0.contains(max)||al0.contains(min)){
			 al.remove(al0);
		 }
			 else{
				 al0.remove(indexOfMin);
				 al0.remove(indexOfMax-1);
				 System.out.println(al0);
			 
		 }
		 if(al1.contains(max)||al1.contains(min)){
			 al.remove(al1);
		 }
		 else{
			 al1.remove(indexOfMin);
			 al1.remove(indexOfMax-1);
			 System.out.println(al1);
		 }
		 if(al2.contains(max)||al2.contains(min)){
			 al.remove(al2);
		 }
		 else{
			 al2.remove(indexOfMin);
			 al2.remove(indexOfMax-1);
			 System.out.println(al2);
	 }
		 if(al3.contains(max)||al3.contains(min)){
			 al.remove(al3);
		 }
		 else{
			 al3.remove(indexOfMin);
			 al3.remove(indexOfMax-1);
			 System.out.println(al3);
	 }
		 //System.out.println(al);
		 
		// ArrayList <Integer> matrix = new ArrayList();
		// ArrayList <Integer> line1;
		 
	

		

	}

}
