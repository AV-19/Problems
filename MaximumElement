import java.util.*;
public class MaximumElement {

	public static void findMaximumElement(int arr[],int len){
		int max=0;
		int min=0;
		for(int i=0;i<len;i++){
			if(max<arr[i]){
				max=arr[i];
			}else if(min>arr[i]){
				min=arr[i];
			}
			
		}
		printMaxMinElement(max,min);
	}
	public static void printMaxMinElement(int max, int min){
		System.out.println("Maximum element is "+max);
		System.out.println("Minimum Element is "+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0,6,3,7,9,8,2,0};
		int len=arr.length;
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		findMaximumElement(arr,len);
	}

}
