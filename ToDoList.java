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
		    int x=sc.nextInt();
		    int arr[]=new int[x];
		    int count=0;
		    for(int i=0;i<x;i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]>=1000){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
		
	}
}
