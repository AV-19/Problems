class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		while(T-->0){
		    int X=sc.nextInt();
		    int N=sc.nextInt();
		    
		    int div=X/10;
		    System.out.println(div*N);
		}
	}
}
