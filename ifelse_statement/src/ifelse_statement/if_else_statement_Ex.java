package ifelse_statement;
import java.util.Scanner;

public class if_else_statement_Ex {
	
	public static void main (String[] args){

	int age;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter your age");
	
	age = s.nextInt();
	
	if (age <= 0){
		System.out.println("Error you don't exist");
	}
	else if(age <= 16){
		System.out.println("Too Young...so Fuck off");
	}
	else if(age<100){
		System.out.println("You're ok.. you may pass for now");
	}
	else{
		System.out.println("You're really smart...");
	}
}
}