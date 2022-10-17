public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,0,2,0,1,0};
		int len=arr.length;
		int temp=0,k=0;
		for(int j=0;j<3;j++){
			for(int i=0;i<len;i++){
				if(temp==arr[i]){
					int t=arr[k];
					arr[k]=arr[i];
					arr[i]=t;
					k++;
				}
				
			}
			temp++;

		}
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
