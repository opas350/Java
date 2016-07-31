import java.util.Scanner;
/**
 * 
 * @author Javier
 * 
 * Expected output when the main method is invoked.
 * You can assume the code in the main method is correct.
 * 
 * This is: Mark ?
 * This is: Mark 42
 * You must be joking +_+
 * 3 ... 2 ... 1 ... BOOM!
 * 
 * 
 */
public class IronMan {
	
	public IronMan() {}
	
	private String id = "?";
	
	public void IronMan (String newID) {
		id = newID;
	}
	
	private void dance () {
		System.out.println("You must be joking +_+");
	}
	
	public void cleanSlateProtocol () {
		System.out.println("3 ... 2 ... 1 ... BOOM!");
	}
	
	public void setID (String givenId) {
		id = givenId;
	}
	
	public String getName () {
		return "Mark " + id;
	}
	
	public static void main (String[] args) {
		
		// Construct an IronMan using the default constructor
		IronMan defaultIronMan = new IronMan ();
		String name = defaultIronMan.getName ();
		
		IronMan mark42 = new IronMan("42");
		System.out.println("This is: " + mark42.getName ());
		mark42.dance();
		mark42.cleanSlateProtocol();
	}
	
	
	
	
	
	
	
	
	

}
