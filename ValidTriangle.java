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
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int nm1=sc.nextInt();
		    int nm2=sc.nextInt();
		    int nm3=sc.nextInt();
		    
		    if(nm1+nm2+nm3==180){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
