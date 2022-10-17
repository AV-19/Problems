public class TowerOfHanoi {
public static void Toh(int n,String source,String helper,String dest){
	if(n==1){
		System.out.println("Transfer disk "+n+" From "+source+" to "+dest);
		return;
	}
	Toh(n-1,source,dest,helper);
	System.out.println("Transfer disk "+n+" From "+source+" to "+dest);
	Toh(n-1,helper,source,dest);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		Toh(n,"S","H","D");
		

	}

}
