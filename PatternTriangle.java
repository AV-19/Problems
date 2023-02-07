public class PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int right=5/2;
		int left=5/2;
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
				if(j==left || j==right){
					System.out.print("*");
				}
				else if(i==2){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
				
			}
			right++;
			left--;
			System.out.println();
		}

	}

}
