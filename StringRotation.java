import java.util.*;
public class String60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCD";
		String str1="CDAB";
		int len=str.length();
		Queue<Character> q1=new LinkedList<>();
		Queue<Character> q2=new LinkedList<>();
		for(int i=0;i<len;i++){
			if(len!=str1.length()){
				System.out.println("String is not rotational String");
				break;
			}
			q1.add(str.charAt(i));
			q2.add(str1.charAt(i));

		}
		int count=0;
		while(len>0){
			len--;
			char ch=q2.peek();
			q2.remove();
			q2.add(ch);
			
			if(q2.equals(q1)){
				System.out.println("String is rotational string");
				break;
			}else{
				count++;
			}
				
		}
		if(count==4)
		System.out.println("String is not rotational string");
		

	}

}
