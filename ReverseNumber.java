//If a number has trailing zeroes, then it's reverse will not include them
//Eg - 10400 = 401

import java.util.* ;
import java.io.*; 

public class Solution {
	public static long reverseNumber(long n) {
		// Write your code here
		String str= String.valueOf(n);
		String str1="";
		String l="";

		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)=='0'){
				
				str1=str.substring(0,i+1);
			}else{
				str1=str.substring(0,i+1);
				break;
			}
			
		}
		
		for(int j=str1.length()-1;j>=0;j--){
			l+=str1.charAt(j);
			
		}
		long h=Long.parseLong(l);
		return h;
	}

}
//Second Method --------------------------------------------------------------------->
// import java.util.* ;
// import java.io.*; 

// public class Solution {
// 	public static long reverseNumber(long n) {
// 		// Write your code here
// 		  long Last_digit=0;
//         long sum=0;
//         while(n>0)
//         {
//             Last_digit=n%10; //Fetching the last Digit from the number
             
//             sum=sum*10+Last_digit; //making new reversed number 
            
//             n=n/10; // removing the last dingit from the number 
//         }
//         return sum;
// 	}
// 	}
