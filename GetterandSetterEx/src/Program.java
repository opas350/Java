
class car{
	private String color;
	
	// Getter
	public String getColor(){
		return color;
	}
	
	// Setter
	public void setColor(String c){
		this.color = c;
	}
}

public class Program {
	public static void main(String[] args){
		car v1 = new car();
		v1.setColor("Red");
		System.out.println(v1.getColor());
	}

}
