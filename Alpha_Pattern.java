import java.util.* ;
import java.io.*; 
public class Solution {

	public static void alphaPattern(int n) {

		// Write your code here.
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)(i+64)); // convert ascii to char
			}
			System.out.println();
		}

	}
}
