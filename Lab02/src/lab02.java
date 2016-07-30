import java.util.Scanner;
import java.lang.Math;

public class lab02 {
	
	Scanner p = new Scanner(System.in);
	
	  public static void multiply()
	    {
	        // Please write your code after this line
		  
		  Scanner s = new Scanner(System.in);
		  int num1, num2, res, j, i;
		  System.out.print("Enter number of operations: ");
		  j = s.nextInt();
		  if(j<=0){
			  System.out.print("Number not Valid.\nTry Again\nEnter number of operations: ");
			  j = s.nextInt();
		  	}
		  
		  String[] inst = {"num1", "num2"};
		  int[] nums = new int[j];
		  
		  for(i = 0; i < j; i++){
			  System.out.print("Enter num" + (i+1) + ": ");
			  nums[i] = s.nextInt();
		  }
		  res = nums[0];
		  for(i = 1; i < j; i++){
			  res = res * nums[i];
		  }
		  for(i = 0; i < j; i++){
			  if(j==1){
				  System.out.print(nums[i]);
			  }
			  else System.out.print(nums[i]+" * ");
		  }
		  System.out.print(" = "+res);
	    }
	    
	    public static void calculateTriangleArea()
	    {
	        // Please write your code after this line
	    	Scanner s = new Scanner(System.in);
	        float width, height, area;
	        int i;
	        String[] inst={"Enter the width of the triangle: ","Enter the height of the triangle: "};
	        float[] sides = new float[2];
	        
	        for(i = 0; i < 2; i++){
	        	System.out.print(inst[i]);
	        	sides[i] = s.nextFloat();
	        }
	        
	        area = (sides[0]*sides[1])/2;
	        
	        System.out.print("Area = " + area);
	        
	    }
	    
	    public static void solveQuadraticEquation()
	    {
	        // Please write your code after this line
	    	Scanner s = new Scanner(System.in);
	    	//float  
	    	double x1, x2;
	    	int i, j = 0;
	    	String[] sides ={"a", "b", "c", "x1", "x2"};
	    	double[] sidesnum = new double[3];
	    	double[] res = new double[3];
	    	
	    	for(i = 0; i < 3; i++){
	    		System.out.print("Enter "+sides[i]+": ");
	    		sidesnum[i] = s.nextDouble();
	    	}
	    	res[0] = (-(sidesnum[1])+ Math.sqrt((sidesnum[1]*sidesnum[1])-4*(sidesnum[0]*sidesnum[2])))/(2*sidesnum[0]);
	        res[1] = (-(sidesnum[1])- Math.sqrt((sidesnum[1]*sidesnum[1])-4*(sidesnum[0]*sidesnum[2])))/(2*sidesnum[0]);
	    	
	        for(i=3; i < 5; i++){
	        	System.out.println(sides[i]+" = "+res[j]);
	        	j++;
	        }   
	    }
	    
public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	int menu;
	
	System.out.println("** Lab02 - Math Demo**");
	System.out.println("Main Menu \n1 = Multiply\n2 = Solve Quadratic Equation\n3 = Calculate Triangle Area\n9 = Quit");
	
	menu = s.nextInt();
	
	while(menu != 9){
	if(menu == 1){
		multiply();
	}
	else if(menu == 2){
		solveQuadraticEquation();
	}
	else if(menu == 3){
		calculateTriangleArea();
	}
	
	else System.out.println("Option not Valid");
	
	System.out.println("\n-------------- \n");
	System.out.println("** Main Menu ** \n\n1 = Multiply\n2 = Solve Quadratic Equation\n3 = Calculate Triangle Area\n9 = Quit");
	menu = s.nextInt();
	}
	System.out.println("*********** End ************");
}
}
	
