import java.util.*;
import java.util.Arrays;
public class KthElement {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k;
		int arr[]={1,5,3,8,4,6};
		int len=arr.length;
		System.out.println("Enter the Kth Index");
		k=sc.nextInt();
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int max,min;
		max=arr[len-k];
		min=arr[k-1];
		System.out.println("Maximum "+k+"th element is "+max+"\nMinimum "+k+"th Element is "+min);
	}

}
