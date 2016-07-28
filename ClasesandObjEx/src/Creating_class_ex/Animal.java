package Creating_class_ex;
import java.util.Scanner;

public class Animal {

	void bark(){
		System.out.println("MuthaFucka Woof\n");
	}
}

class MyClass{
	public static void main(String[ ] args){
		String ani,t;
		t = "0";
		Scanner s = new Scanner(System.in);
		System.out.println("** Class and Objects example** \nAnimal Farm");
		System.out.println("Type an animal(ex.dog):");
		ani = s.next();
		Animal dog = new Animal();
		
		while(ani.compareTo(t)>0){
		if(ani.equals("dog")){
		dog.bark();
		System.out.println("Type another animal(ex.dog)");
		ani = s.next();
		}
		else {
			System.out.println("Your name isn't valid... Try again");
			System.out.println("Type another kind animal(ex.dog):");
			ani = s.next();
		}
	}
			System.out.println("End of line");
		
	}
}
