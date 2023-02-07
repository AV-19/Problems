import java.util.*;
import java.nio.charset.StandardCharsets;
public class AsciiConversion {
	public static void changeString(String str){
		
		String str1="";
		byte b[]=str.getBytes(StandardCharsets.US_ASCII);
		int l=b.length;
		List<Byte> list=new ArrayList<>();
		for(int i=0;i<l;i++){
			list.add(b[i]);
		}
		//int l=list.size();
		for(int i=0;i<l;i++){
			
			for(int j=i+1;j<l;j++){
				
				if(b[i]>b[j]){
					list.add(b[i]);
					
				}
				
			}
		
		}
		System.out.println(list);
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		AsciiConversion ac= new AsciiConversion();
		ac.changeString(str);

	}

}
