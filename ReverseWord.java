import java.io.*;
import java.util.*;
public class ReverseWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String []str=bf.readLine().split(" ");
	for(int i=str.length-1;i>=0;i--){
		System.out.print(str[i]+" ");
	}

	}

}
