class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a=sc.nextInt();
		    
		    if(a>=x && a<y){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
