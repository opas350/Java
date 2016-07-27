package arrayEx;
import java.util.Scanner;

public class array_examp {

	public static void main(String[] args){
		
		int x;
		String[] myNames = {"Kupo", "Carbuncle", "Bahamut"};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of array element");
		x = s.nextInt();
		System.out.println(myNames[x]);
	}
}
