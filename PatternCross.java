public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int number=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(number);
				
				if(j<number&&j<i){
					System.out.print("*");
					
				}
				number++;
			}
			System.out.println();
		}

	}

}
