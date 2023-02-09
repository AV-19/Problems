import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
		     String s = sc.next();
	       int coun = 0;
	       for(int i = 0; i<s.length(); i++){
	           char c = s.charAt(i);
	        if((c=='a') || (c == 'e') || (c== 'i') || (c== 'o')||(c=='u')){
	            coun++;
	            if(coun>2){
	                break;
	            }
	        } else {
	             coun= 0;
	        }
	       }
	       if(coun > 2){
	                System.out.println("Happy");
	               
	   
	       }else {
	        System.out.println("Sad");
	    }
		}
	}
}
