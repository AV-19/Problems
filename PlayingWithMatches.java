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
		    HashMap<Integer,Integer> map=new HashMap<>();
		    map.put(0,6);
		    map.put(1,2);
		    map.put(2,5);
		    map.put(3,5);
		    map.put(4,4);
		    map.put(5,5);
		    map.put(6,6);
		    map.put(7,3);
		    map.put(8,7);
		    map.put(9,6);
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int count=0;
		    int total=a+b;
		    while(total!=0){
		        int rem=total%10;
		        total=total/10;
		        count+= map.get(rem);
		    }
		    System.out.println(count);
		    
		}
	}
}
