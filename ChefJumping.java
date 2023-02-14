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
		long a=sc.nextLong();
		if(a%6==1 || a%3==0 ){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
	}
}
