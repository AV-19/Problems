import java.util.*;
public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,8,9,12};
		int b[]={2,3,5,8,10,11,13,14};
		int count=0,total=0;
		int lena=a.length;
		int lenb=b.length;
		for(int i=0;i<lenb;i++){
			for(int j=0;j<lena;j++){
				if(b[i]==a[j]){
					count=0;
					break;
					
				}else{
				count=1;
				}
				
			}total+=count;
		}
		lena+=total;
		System.out.println(lena);
		
		
	}

}
