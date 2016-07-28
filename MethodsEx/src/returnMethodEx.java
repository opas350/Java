import java.util.Scanner;

public class returnMethodEx {

	static int sum(int val1, int val2){
		return val1+val2;
	}
	
	public static void main(String[] args){
		int num1, num2;
		Scanner s = new Scanner(System.in);
		System.out.println("*Sum of Two numbers* \nEnter First #:");
		num1 = s.nextInt();
		System.out.println("Enter Second #: ");
		num2 = s.nextInt();
		int x = sum(num1,num2);
		System.out.println("The Sum of both numbers is "+x);
	}
}
