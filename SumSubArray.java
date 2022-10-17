
public class sumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={-1,-2,-3,-4,-5};
		int len=arr.length;
		
		int prev_sum=arr[0];
		int max=arr[0];
		
		for(int i=1;i<len;i++){
			if(prev_sum+arr[i]>arr[i]){
				prev_sum+=arr[i];
			}else{
				prev_sum=arr[i];
			}
			
		}
		if(prev_sum>max){
			max=prev_sum;
		}
		System.out.println(max);

	}

}
