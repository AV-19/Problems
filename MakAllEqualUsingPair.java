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
		    	HashMap<Integer, Integer> map= new HashMap<>();
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		   // int count=0;
		    int var=0;
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		       map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		    }
		    	int count=0;
		    	for(int i=0; i < n; i++){
		    	    count = Math.max(count, map.get(arr[i]));
		    	}
		    	
		    	System.out.println(n- count);
		}
	}
}
