import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t-->0){
		     int A=in.nextInt();
		    int B=in.nextInt();
		    int C=in.nextInt();
		    if((A==(B+C)) || (B==(C+A))|| (C==(A+B))){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
