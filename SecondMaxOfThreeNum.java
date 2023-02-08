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
		    int n=0;
		   
		  //  int y=sc.nextInt();
		  //  int z=sc.nextInt();
		   
		  int arr[]=new int[3];
		  
		  while(n<3){
		       int x=sc.nextInt();
		     
		      arr[n]=x;
		      
		      n++;
		  }
		   int max=arr[0];
		  for(int i=0;i<3;i++){
		      for(int j=i+1;j<3;j++){
		          if(arr[i]>arr[j]){
		              int a=arr[j];
		              arr[j]=arr[i];
		              arr[i]=a;
		          }
		      }
		      
		  }
		 
		  System.out.println(arr[1]);
		  
		  
		}
	}
}
