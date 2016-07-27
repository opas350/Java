package arrayEx;
import java.util.Scanner;

public class arrayscanex {
	
	public static void main(String [] args){
	
		Scanner s = new Scanner(System.in);
		int x;
		
		System.out.println("Enter # for array size:");
		x = s.nextInt();
		
		int arr[] = new int[x];
		
		for(int i =0; i < 3; i++){
			System.out.println("Enter # for element " +i );
			arr[i] = s.nextInt();
		}
		int res = arr[0] + arr[2];
		System.out.println(res);
	}
}
