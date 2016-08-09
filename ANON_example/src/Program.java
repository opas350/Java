
class Machine{
	public void start(){
		System.out.println("Starting ...");
	}
}

public class Program {
	public static void main(String[] args){
		Machine m = new Machine(){
			@Override public void start(){
				System.out.println("Wooooo");
			}
		};
		m.start();
	}

}
