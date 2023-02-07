import java.util.ArrayList;
import java.util.List;


public class RunningSum {

	public static List<Integer> sum(int []arr){
		List<Integer>list=new ArrayList<>();
		int l=arr.length;
		int num=0;
		for(int i=0;i<l;i++){
			num+=arr[i];
			list.add(num);
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        RunningSum rs=new RunningSum();
        int arr[]={1,2,3,4};
        System.out.print(rs.sum(arr));
	}

}
