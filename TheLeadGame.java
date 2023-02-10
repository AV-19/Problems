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
		int player1=0,player2=0;
		int max=0;
		while(t-->0){
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    
		    player1+=p;
		    player2+=q;
		    
		    int lead=player1-player2;
		    
		    if(Math.abs(lead)>Math.abs(max)){
		        max=lead;
		    }
		}
		
		if(max>0){
		    System.out.println(1+" "+Math.abs(max));
		}else{
		    System.out.println(2+" "+Math.abs(max));
		}
	}
}
