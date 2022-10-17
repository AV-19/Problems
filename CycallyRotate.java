public class CycallyRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,4,6,3,6,3,7};
		int len=arr.length;
		int num;
		num=arr[len-1];
		for(int i=len-1-1;i>=0;i--){
			arr[i+1]=arr[i];
			
		}
		arr[0]=num;
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
	
	
}
