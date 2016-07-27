package Switch_Ex;
import java.util.Scanner;
public class Switch_c_ex {
	
	public static void main(String[] args){
		
		int day;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number 1-7 to set date");
		
		day = s.nextInt();
		
		switch(day){
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wendnesday");
			break;
		}
	}

}
