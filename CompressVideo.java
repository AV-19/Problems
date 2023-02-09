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
		    int n=sc.nextInt();
		    int []a=new int[n];
		    int i=0;
		    while(n-->0){
		        a[i]=sc.nextInt();
		        i++;
		    }
		    int count=1;
		    for(int j=0;j<a.length-1;j++){
		        if(a[j]==a[j+1]){
		            count=count;
		        }else if(a[j]!=a[j+1]){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
		

		 
		
	}
}
