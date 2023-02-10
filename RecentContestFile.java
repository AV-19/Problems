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
		    int counts=0,countl=0;
		    String start="START38";
		    String ltime="LTIME108";
		    String str[]=new String[n];
		    for(int i=0;i<n;i++){
		        str[i]=sc.next();
		        if(str[i].equals(start)){
		            counts++;
		        }
		        if(str[i].equals(ltime)){
		            countl++;
		        }
		    }
		    System.out.println(counts+" "+countl);
		}
	}
}
