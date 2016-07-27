package arrayEx;
import java.util.Scanner;

public class arraystringex {
	
	public static void main(String [] args){
	
		Scanner s = new Scanner(System.in);
		int x;
		
		System.out.println("Enter # for array size:");
		x = s.nextInt();
		
		String arr[] = new String[x];
		
		for(int i =0; i < x; i++){
			System.out.println("Enter # for element " +i );
			arr[i] = s.next();
			System.out.println("echo: "+ arr[i]);
		}
		System.out.println("End");
	}
}
