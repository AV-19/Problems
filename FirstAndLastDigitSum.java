import java.util.*;
public class FirstAndLastDigitSum {
	public void sum(int num){
		String str=Integer.toString(num);
		char ch=str.charAt(0);
		char chl=str.charAt(str.length()-1);
		int firstNum= Character.getNumericValue(ch);
		int lastNum=Character.getNumericValue(chl);
		System.out.println(firstNum+lastNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String62  s=new String62();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int num=sc.nextInt();
			s.sum(num);
		}
	

	}

}
