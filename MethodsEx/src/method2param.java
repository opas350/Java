import java.util.Scanner;

public class method2param {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num1,num2;
		
		System.out.println("** Return the Higher Value of the 2 input # ** \nEnter num1: ");
		num1 = s.nextInt();
		System.out.println("Enter num2: ");
		num2 = s.nextInt();
		
		int res = max(num1,num2);
		System.out.println("The Max Value is "+res);
	}
	static int max(int a, int b){
		if (a > b){
			return a;
		}
		else return b;
	}
}
