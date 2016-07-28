import java.util.Scanner;

public class methodparam {
	
	static void sayHello(String name){
		System.out.println("Hello " + name);
	}
	
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		String pname;
		System.out.println("Input player1: ");
		pname = s.next();
		sayHello(pname);
		System.out.println("Input player2: ");
		pname = s.next();
		sayHello(pname);
		
		System.out.println("Ready... Fight!");
	}
}
