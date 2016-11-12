package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static int max = 100;
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String max = "Max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max1 = a > b ? a : b;

        System.out.println(max + max1);
        int k=Math.min((Math.min(22, 8)), (Math.min(9, 11)));
		System.out.println(k);
        
    }
    	
   
    
}