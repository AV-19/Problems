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
		    long x=sc.nextInt();
		    long total=0;
		    if(x==0){
		        System.out.println(0);
		    }else{
		         for(long i=0;i<10e9;i++){
		        total+=i;
		        if(total==x){
		            System.out.println(i);
		            break;
		        }else if(total>x){
		            System.out.println(i-1);
		            break;
		        }
		    }
		    }
		   
		}
	}
}
