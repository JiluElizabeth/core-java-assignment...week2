import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("No of values:");
		int n = Integer.parseInt(br.readLine()); 
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter a number");
			arr[i]=Integer.parseInt(br.readLine()); 
		}
		UserMainCode u=new UserMainCode();
		if(u.checkTriplets(arr))
			System.out.println("array has triplets");
		else
			System.out.println("array dont have triplets");
	}

}
 
class UserMainCode {
	 public static boolean checkTriplets(int arr[]) {
		 if (arr.length<3)
			 return false;
		 
			 for( int i=2;i<arr.length;i++) {
				 if(arr[i]==arr[i-1]&&arr[i-1]==arr[i-2])
					 return true;
				
			 }
			return false;
		 
		 
		 
	}
	
	
}
