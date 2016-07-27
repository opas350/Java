package while_loops;
import java.util.Scanner;

public class Wloops {
	public static void main(String[] args)
	{
		int x;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value to count to zero");
		
		x = s.nextInt();
		while(x > 0){
			System.out.println(x);
			x--;
		}
		System.out.println("0");
		System.out.println("Program END");
	}
}
