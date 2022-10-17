//Time Complexity O(n)
public class ReverseString {
public static void printString(String str,int idx){
	if(idx==0){
		System.out.print(str.charAt(idx));
		return;
	}
	System.out.print(str.charAt(idx));
	printString(str,idx-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Aniket Verma";
		int idx=str.length();
		printString(str,idx-1);
	}

}
