import java.util.*;



public class String58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		str.compareToIgnoreCase(str);
		
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(str.charAt(i)==(str.charAt(j))){
					System.out.println(str.charAt(i));
					
					break;
				}
			}
		}

	}

}
