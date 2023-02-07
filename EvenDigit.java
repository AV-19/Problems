public class EvenDigit {

	public static int findEven(int[] arr,int l){
		
		int count=0;
		for(int i=0;i<l;i++){
			int s=arr[i];
			String nu=Integer.toString(s);
			System.out.print(nu+" ");
			if(nu.length()%2==0){
				count++;
			}
		}
		System.out.println();
		return count;
			
	}
	public static void main(String[] args) {
		EvenDigit ed=new EvenDigit();
		int []arr={1,23,456,7890,23,23,23,5466576,676345,75675,567654};
		int l=arr.length;
		
		
		System.out.println(ed.findEven(arr,l));

	}

}
