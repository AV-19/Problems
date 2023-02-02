import java.util.* ;
import java.io.*; 

public class Solution {
	public static int convert(int N, String str) {
		// Write your code here
		int l=0;
		double n;
		
		for(int i=0;i<N;i++){
			if(str.charAt(i)=='1'){
				
				double d=N-1-i;
				n=Math.pow(2, d);
				l+=1*n;
				
			}
			
		}
		
		return l;

	}
}
