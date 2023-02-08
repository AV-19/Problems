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
		    try{
		        int x=sc.nextInt();
		        int y=sc.nextInt();
		        
		        if(x<y){
		            System.out.println("B");
		        }else{
		            System.out.println("A");
		        }
		    }catch(Exception e){
		        System.out.println(e);
		    }
		}
	}
}
