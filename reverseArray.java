import java.util.*;
public class ReverseArray {
public static  void reverseArrays(String arr[],int len){
	String temp;
	for(int i=0;i<len/2;i++){
		temp=arr[i];
		arr[i]=arr[len-i-1];
		arr[len-i-1]=temp;
		
	}
	printArrayReverse(arr,len);
	}
public static void printArrayReverse(String arr[],int len){
	for(int i=0;i<len;i++){
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]={"a","e","i","o","u"};
		int len=arr.length;
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		reverseArrays(arr,len);
		

	}

}
